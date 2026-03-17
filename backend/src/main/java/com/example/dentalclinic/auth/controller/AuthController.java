package com.example.dentalclinic.auth.controller;

import com.example.dentalclinic.auth.dto.LoginRequest;
import com.example.dentalclinic.auth.service.AuthService;
import com.example.dentalclinic.common.ApiResponse;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    private final AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/login")
    public ApiResponse login(@Valid @RequestBody LoginRequest request) {
        return authService.login(request);
    }
}
