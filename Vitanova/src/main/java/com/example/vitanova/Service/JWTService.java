package com.example.vitanova.Service;

import org.springframework.security.core.userdetails.UserDetails;

import java.util.Map;

public interface JWTService {
    public String ExtractUserName(String token);
    String generateToken(UserDetails userDetails);
    public boolean isTokenValid(String token,UserDetails userDetails);
    public String generateRefreshToken(Map<String,Object> extractClaims, UserDetails userDetails);
}
