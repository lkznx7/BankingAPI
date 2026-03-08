package com.example.bankingapi.service;

import com.example.bankingapi.dto.UserRegisterDTO;
import com.example.bankingapi.entity.User;
import com.example.bankingapi.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service

public class UserService {
    private final UserRepository userRepository;
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    public UserRegisterDTO registerUser(UserRegisterDTO userDTO) {
        User newUser = new User();
        newUser.setName(userDTO.name());
        newUser.setEmail(userDTO.email());
        newUser.setPassword(userDTO.password());
        userRepository.save(newUser);
        return userDTO;
    }
    public User findById(UUID id ){
        return userRepository.findById(id).orElseThrow(()->new RuntimeException("User not found!"));
    }
}
