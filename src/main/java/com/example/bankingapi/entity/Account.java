package com.example.bankingapi.entity;

import com.example.bankingapi.entity.enums.AccountType;
import com.example.bankingapi.entity.enums.Status;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Account {
    @GeneratedValue(strategy = GenerationType.UUID)
    @Id
    private UUID ID;
    private String accountNumber;
    private BigDecimal balance = BigDecimal.ZERO;
    @Enumerated(EnumType.STRING)
    private AccountType accountType;
    private LocalDateTime createdAt;
    @Enumerated(EnumType.STRING)
    private Status statusAccount;
    public Account (AccountType accountType,String accountNumber, Status statusAccount, LocalDateTime createdAt) {
        this.accountType = accountType;
        this.statusAccount = statusAccount;
        this.createdAt = createdAt;
    }
}

