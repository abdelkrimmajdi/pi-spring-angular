package com.example.vitanova.Service;

import com.example.vitanova.Repositorie.UserRepositorie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl {
    @Autowired
    private UserRepositorie userRepositorie;
}
