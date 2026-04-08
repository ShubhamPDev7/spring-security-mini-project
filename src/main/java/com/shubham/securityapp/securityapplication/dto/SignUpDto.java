package com.shubham.securityapp.securityapplication.dto;

import com.shubham.securityapp.securityapplication.entities.enums.Role;
import lombok.Data;

import java.util.Set;

@Data
public class SignUpDto {
    private String email;
    private String password;
    private String name;
    private Set<Role> roles;
}
