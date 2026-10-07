package com.vamsi.microservices.apigateway;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
//vamsi
//reddy
//hi
@RestController
@RequestMapping("/auth")
public class AuthController {
    @PostMapping("/login")
    public String login(@RequestParam String username) {
        // RAVI CHANGE: Validate username before generating token
        // RAVI CHANGE: Authentication request received

        return JwtUtil.generateToken(username);
    }
}
