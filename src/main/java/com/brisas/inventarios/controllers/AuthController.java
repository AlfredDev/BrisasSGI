package com.brisas.inventarios.controllers;

import com.brisas.inventarios.request.AuthService;
import com.brisas.inventarios.request.LoginRequest;
import com.brisas.inventarios.request.RegisterRequest;
import com.brisas.inventarios.response.AuthResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {
    private  final AuthService authService;

    @PostMapping(value = "login")
    public ResponseEntity<AuthResponse> login (@RequestBody LoginRequest request){
        return ResponseEntity.ok(authService.login(request));
    }

    @PostMapping(value = "register")
    public ResponseEntity<AuthResponse> register (@RequestBody RegisterRequest request){
        return  ResponseEntity.ok(authService.register(request));
    }

}
