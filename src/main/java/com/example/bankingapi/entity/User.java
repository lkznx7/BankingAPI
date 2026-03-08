package com.example.bankingapi.entity;


import com.example.bankingapi.entity.enums.Status;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID ID;
    private String name;
    @Column(unique = true)
    private String email;
    private String password;
    private LocalDate createdAT;
    @Enumerated(EnumType.STRING)
    private Status status;
}
