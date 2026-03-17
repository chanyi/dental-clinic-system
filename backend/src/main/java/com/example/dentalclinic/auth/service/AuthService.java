package com.example.dentalclinic.auth.service;

import com.example.dentalclinic.auth.dto.LoginRequest;
import com.example.dentalclinic.common.ApiResponse;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    public ApiResponse login(LoginRequest request) {
        return new ApiResponse("Placeholder login accepted for user: " + request.username());
    }
}
