package com.shubham.securityapp.securityapplication.services;

import com.shubham.securityapp.securityapplication.dto.LoginDto;
import com.shubham.securityapp.securityapplication.dto.SignUpDto;
import com.shubham.securityapp.securityapplication.dto.UserDto;
import com.shubham.securityapp.securityapplication.entities.User;
import com.shubham.securityapp.securityapplication.exceptions.ResourceNotFoundException;
import com.shubham.securityapp.securityapplication.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService implements UserDetailsService {

    private final UserRepository userRepository;
    private final ModelMapper modelMapper;
    private final PasswordEncoder passwordEncoder;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return userRepository.findByEmail(username)
                .orElseThrow(() -> new BadCredentialsException("User with email " + username + " not found"));
    }

    public User getUserById(Long userId) {
        return userRepository.findById(userId).orElseThrow(() -> new ResourceNotFoundException("User with id " + userId + " not found"));
    }

    public User getUserByEmail(String email) {
        return userRepository.findByEmail(email).orElse(null);
    }

    public UserDto signUp(SignUpDto signUpDto) {
        Optional<User> user = userRepository.findByEmail(signUpDto.getEmail());
        if(user.isPresent()) {
            throw new BadCredentialsException("User with email already exists " + signUpDto.getEmail());
        }

        User toBeCreateUser = modelMapper.map(signUpDto, User.class);
        toBeCreateUser.setPassword(passwordEncoder.encode(toBeCreateUser.getPassword()));

        User savedUser = userRepository.save(toBeCreateUser);

        return modelMapper.map(savedUser, UserDto.class);
    }

    public User save(User newUser) {
        return userRepository.save(newUser);
    }
}
