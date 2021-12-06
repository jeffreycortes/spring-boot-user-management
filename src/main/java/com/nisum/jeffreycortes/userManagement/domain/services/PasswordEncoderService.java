package com.nisum.jeffreycortes.userManagement.domain.services;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class PasswordEncoderService {
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    public PasswordEncoderService() {
        this.bCryptPasswordEncoder = new BCryptPasswordEncoder();
    }

    public String encode(String password) {
        return bCryptPasswordEncoder.encode(password);
    }
}