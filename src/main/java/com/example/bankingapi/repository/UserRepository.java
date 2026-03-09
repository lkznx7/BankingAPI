package com.example.bankingapi.repository;

import com.example.bankingapi.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {
    List<User> Email(String email);

    List<User> findByEmail(String email);
}
