package com.example.bankingapi.security;

import com.example.bankingapi.dto.UserRegisterDTO;
import com.example.bankingapi.entity.User;
import com.example.bankingapi.repository.UserRepository;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Data
public class CustomUserDetailsService implements UserDetailsService {
    UserRepository userRepository;
    public CustomUserDetailsService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    @Override
    public UserDetails loadUserByUsername(@Email @NotNull String Email) throws UsernameNotFoundException {

        List<User> users = userRepository.findByEmail(Email);
        if (users.isEmpty()) {
            throw new UsernameNotFoundException("Email not found" + Email);
        }
        User user = users.get(0);
        return org.springframework.security.core.userdetails.User
                .withUsername(user.getEmail())
                .password(user.getPassword())
                .authorities("ROLE_USER")
                .build();
    }
}
