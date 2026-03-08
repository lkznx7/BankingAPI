package com.example.bankingapi.dto;

import com.example.bankingapi.entity.Account;
import com.example.bankingapi.entity.enums.Status;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

public record AccountResponseDTO(UUID ID , Account accountNumber, BigDecimal balance, Status status, LocalDate date)
{
}
