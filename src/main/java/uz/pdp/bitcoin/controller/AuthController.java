package uz.pdp.bitcoin.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import uz.pdp.bitcoin.payload.ApiResponse;
import uz.pdp.bitcoin.payload.LoginDto;
import uz.pdp.bitcoin.payload.RegisterDto;
import uz.pdp.bitcoin.payload.VerifyDto;
import uz.pdp.bitcoin.service.AuthService;
import uz.pdp.bitcoin.service.OwnerService;


@Controller
@RequiredArgsConstructor
public class AuthController {


    private final OwnerService ownerService;

    @GetMapping
    public String getHome(){return "index";}

    @GetMapping("/users")
    public String getUsers(Model model) {
        ApiResponse response = ownerService.getUsers();
        model.addAttribute("response", response);
        return "users";
    }

    @GetMapping("/login")
    public String getLoginPage() {
        return "login";
    }

    @PostMapping("/login")
    public String login(@ModelAttribute LoginDto loginDto, Model model) {
        ApiResponse response = ownerService.getLogin(loginDto);
        model.addAttribute("response", response);
        if (response.isSuccess())
            return "cabinet";
        return "login";
    }

    @GetMapping("/register")
    public String getRegisterPage(Model model) {
        model.addAttribute("response", null);
        return "register";
    }

    @PostMapping("/register")
    public String register(@ModelAttribute RegisterDto registerDto, Model model) {
        ApiResponse response = ownerService.register(registerDto);
        model.addAttribute("response", response);
        if (response.isSuccess())
            return "verification";
        return "register";
    }

    @PutMapping("/reset")
    public String resetMail(@RequestParam Long id, Model model) {
        ApiResponse response = ownerService.resetEmail(id);
        model.addAttribute("response", response);
        if (response.isSuccess())
            return "verification";
        return "register";
    }


    @PostMapping("/verify")
    public String verifyEmail(@ModelAttribute VerifyDto verifyDto, Model model) {
        ApiResponse response = ownerService.verifyEmail(verifyDto);
        if (response.isSuccess())
            return "login";
        model.addAttribute("response", response);
        return "verification";
    }
}
