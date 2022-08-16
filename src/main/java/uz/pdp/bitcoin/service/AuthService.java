package uz.pdp.bitcoin.service;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
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
public class AuthService implements UserDetailsService {


    private final OwnerRepository ownerRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return ownerRepository.findByUsername(username).orElseThrow(() -> new BadCredentialsException("USER NOT FOUND"));
    }
}
