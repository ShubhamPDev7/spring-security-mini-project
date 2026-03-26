package com.shubham.securityapp.securityapplication;

import com.shubham.securityapp.securityapplication.entities.User;
import com.shubham.securityapp.securityapplication.services.JwtService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SecurityApplicationTests {

    @Autowired
    private JwtService jwtService;

    @Test
    void contextLoads() {

        User  user = new User(4L, "shubham@gmail.com", "1234");

        String token = jwtService.generateToken(user);

        System.out.println(token);

        Long id = jwtService.getUserIdFromToken(token);
        System.out.println(id);



    }

}
