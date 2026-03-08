package com.example.bankingapi.dto;

import com.example.bankingapi.entity.enums.AccountType;

public record AccountRequestDTO(AccountType accountType) {
}
