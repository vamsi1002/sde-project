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
        // VVR CHANGE: Generate JWT token for logged-in user
        // VVR CHANGE: Token is returned to the client
        // nenu CHANGE: Token is returned to the client
        // iam: Token is returned to the client

        return JwtUtil.generateToken(username);
    }
}
