package io.pragmatic.coponderus.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class JwtController {
    
    @GetMapping("/api/me")
    public String me(@AuthenticationPrincipal Jwt jwt) {
        return jwt.getSubject(); // = le firebase_uid
    }
}
