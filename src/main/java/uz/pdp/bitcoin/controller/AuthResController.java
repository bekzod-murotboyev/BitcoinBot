package uz.pdp.bitcoin.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uz.pdp.bitcoin.payload.ApiResponse;
import uz.pdp.bitcoin.payload.LoginDto;
import uz.pdp.bitcoin.payload.RegisterDto;
import uz.pdp.bitcoin.payload.VerifyDto;
import uz.pdp.bitcoin.service.AuthService;
import uz.pdp.bitcoin.service.OwnerService;


@RestController
@RequiredArgsConstructor
@RequestMapping("api/auth")
public class AuthResController {


    private final OwnerService ownerService;

    @GetMapping("/users")
    public ResponseEntity<?> getUsers(){ApiResponse response = ownerService.getUsers();
        return ResponseEntity.status(response.isSuccess()?200:404).body(response);
    }

    @GetMapping("/login")
    public ResponseEntity<?> getLogin(@RequestBody LoginDto loginDto){
        ApiResponse response=ownerService.getLogin(loginDto);
        return ResponseEntity.status(response.isSuccess()?200:403).body(response);
    }
    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody RegisterDto registerDto){
        ApiResponse response=ownerService.register(registerDto);
        return ResponseEntity.status(response.isSuccess()?201:409).body(response);
    }

    @PostMapping("/verify")
    public ResponseEntity<?> verifyEmail(@RequestBody VerifyDto verifyDto){
        ApiResponse response=ownerService.verifyEmail(verifyDto);
        return ResponseEntity.status(response.isSuccess()?201:409).body(response);
    }
}
