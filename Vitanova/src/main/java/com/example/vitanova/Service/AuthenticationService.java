package com.example.vitanova.Service;

import com.example.vitanova.Dto.JwtAuthenticationResponse;
import com.example.vitanova.Dto.RefreshTokenRequest;
import com.example.vitanova.Dto.SignUpRequest;
import com.example.vitanova.Dto.SigninRequest;
import com.example.vitanova.Entities.User;

public interface AuthenticationService {
    User signup(SignUpRequest signUpRequest);
    public JwtAuthenticationResponse signin(SigninRequest signinRequest);
    public JwtAuthenticationResponse refreshToken(RefreshTokenRequest refreshTokenRequest);
}
