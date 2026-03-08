package com.example.bankingapi.dto;

import com.example.bankingapi.entity.enums.TransactionType;
import com.example.bankingapi.validationCustom.ValidTransfer;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

import java.math.BigDecimal;

@ValidTransfer
public record TransactionRequestDTO(
        @Positive BigDecimal amount,
        @NotNull TransactionType transactionType,
        @NotNull String description,
        String destinationAccountNumber
) {}

