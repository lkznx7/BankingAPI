package com.example.bankingapi.dto;

import com.example.bankingapi.entity.enums.TransactionStatus;
import com.example.bankingapi.entity.enums.TransactionType;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

public record TransactionResponseDTO(
        UUID id,
        BigDecimal amount,
        TransactionType type,
        String description,
        LocalDateTime transactionDate,
        TransactionStatus status,
        String sourceAccountNumber,
        String destinationAccountNumber

) {
}
