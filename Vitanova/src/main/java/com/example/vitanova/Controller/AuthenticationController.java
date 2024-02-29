package com.example.vitanova.Controller;

import com.example.vitanova.Dto.JwtAuthenticationResponse;
import com.example.vitanova.Dto.RefreshTokenRequest;
import com.example.vitanova.Dto.SignUpRequest;
import com.example.vitanova.Dto.SigninRequest;
import com.example.vitanova.Entities.User;
import com.example.vitanova.Service.AuthenticationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class AuthenticationController {
    private final AuthenticationService authenticationService;
    @PostMapping("/signup")
    public ResponseEntity<User> signup(@RequestBody SignUpRequest signUpRequest){

        return ResponseEntity.ok(authenticationService.signup(signUpRequest));


    }
    @PostMapping("/signin")
    public ResponseEntity<JwtAuthenticationResponse>signin(@RequestBody SigninRequest signinRequest){
        return ResponseEntity.ok(authenticationService.signin( signinRequest));

    }
    @PostMapping("/refresh")
    public ResponseEntity<JwtAuthenticationResponse>referesh(@RequestBody RefreshTokenRequest refreshTokenRequest) {
        return ResponseEntity.ok(authenticationService.refreshToken(refreshTokenRequest));
    }
}
