package uz.pdp.bitcoin.service;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import uz.pdp.bitcoin.component.EmailComponent;
import uz.pdp.bitcoin.entity.Owner;
import uz.pdp.bitcoin.entity.User;
import uz.pdp.bitcoin.payload.ApiResponse;
import uz.pdp.bitcoin.payload.LoginDto;
import uz.pdp.bitcoin.payload.RegisterDto;
import uz.pdp.bitcoin.payload.VerifyDto;
import uz.pdp.bitcoin.repository.OwnerRepository;
import uz.pdp.bitcoin.repository.UserRepository;
import uz.pdp.bitcoin.security.JwtProvider;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class OwnerService {

    private final OwnerRepository ownerRepository;

    private final UserRepository userRepository;

    private final AuthenticationManager authenticationManager;

    private final JwtProvider jwtProvider;

    private final EmailComponent emailComponent;

    private final PasswordEncoder passwordEncoder;



    public ApiResponse getLogin(LoginDto loginDto) {
        try {
            Authentication authenticate = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(loginDto.getUsername(), loginDto.getPassword()));
            Owner owner = (Owner) authenticate.getPrincipal();
            String token = jwtProvider.generateToken(owner.getUsername());
            return new ApiResponse(true, "Token: ",owner,token);
        } catch (Exception e) {
            return new ApiResponse(false, "Username or/and password is/are wrong!");
        }
    }

    public ApiResponse getUsers() {
        List<User> users = userRepository.findAll(Sort.by(Sort.Direction.ASC,"id"));
        return users.isEmpty() ? new ApiResponse(false, "Not found") :
                new ApiResponse(true, "Success", users);
    }

    public ApiResponse register(RegisterDto registerDto) {
        if (ownerRepository.existsByUsername(registerDto.getUsername()))
            return new ApiResponse(false, "Username already exist");
        if (ownerRepository.existsByMail(registerDto.getEmail()))
            return new ApiResponse(false, "Mail already exist");
        String code = String.valueOf(UUID.randomUUID()).substring(0, 4);
        Owner owner = new Owner();
        owner.setUsername(registerDto.getUsername());
        owner.setPassword(passwordEncoder.encode(registerDto.getPassword()));
        owner.setMail(registerDto.getEmail());
        owner.setEmailCode(code);
        if (emailComponent.sendToRegistration(registerDto.getEmail(), code)){
            ownerRepository.save(owner);
            return new ApiResponse(true, "Please enter the code", owner.getId());
        }
        return new ApiResponse(false, "Mail not found");
    }

    public ApiResponse verifyEmail(VerifyDto verifyDto) {
        if (!ownerRepository.existsById(verifyDto.getId()))
            return new ApiResponse(false, "User not found",verifyDto.getId());

        Owner owner = ownerRepository.findById(verifyDto.getId()).get();

        if (!owner.getEmailCode().equals(verifyDto.getCode()))
            return new ApiResponse(false, "Code is wrong",verifyDto.getId());

        owner.setEnabled(true);
        owner.setEmailCode(null);
        ownerRepository.save(owner);
        return new ApiResponse(true, "Success");
    }

    public ApiResponse resetEmail(Long id) {
        if (!ownerRepository.existsById(id))
            return new ApiResponse(false, "Mail not found");

        String code = String.valueOf(UUID.randomUUID()).substring(0, 4);
        Owner owner = ownerRepository.findById(id).get();
        owner.setEmailCode(code);
        ownerRepository.save(owner);
        if (emailComponent.sendToRegistration(owner.getMail(), code))
            return new ApiResponse(true, "Please enter the code", owner.getId());
        return new ApiResponse(false, "Mail not found");
    }
}
