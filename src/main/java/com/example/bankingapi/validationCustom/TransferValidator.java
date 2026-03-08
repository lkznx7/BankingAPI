package com.example.bankingapi.validationCustom;

import com.example.bankingapi.dto.TransactionRequestDTO;
import com.example.bankingapi.entity.enums.TransactionType;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class TransferValidator implements ConstraintValidator<ValidTransfer, TransactionRequestDTO> {
    @Override
    public boolean isValid(TransactionRequestDTO dto, ConstraintValidatorContext context) {
        if (dto.transactionType() == TransactionType.TRANSFER) {
            return dto.destinationAccountNumber() != null && !dto.destinationAccountNumber().isBlank();
        }
        return true;
    }
}

