package com.example.bankingapi.entity;

import com.example.bankingapi.entity.enums.TransactionStatus;
import com.example.bankingapi.entity.enums.TransactionType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID ID ;
    private BigDecimal value;
    @Enumerated(EnumType.STRING)
    private TransactionType type;
    private String description;
    private LocalDateTime transactionDate;
    @Enumerated(EnumType.STRING)
    private TransactionStatus status;

    public Transaction(BigDecimal value, TransactionType type, String description, LocalDateTime transactionDate, TransactionStatus status) {
        this.value = value;
        this.type = type;
        this.description = description;
        this.transactionDate = transactionDate;
        this.status = status;
    }
}
