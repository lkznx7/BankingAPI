package com.example.bankingapi.service;

import com.example.bankingapi.repository.AccountRepository;
import com.example.bankingapi.repository.TransactionRepository;

public class TransactionService {
    //injection dependency
    private final AccountRepository accountRepository;
    private final TransactionRepository transactionRepository;
    public TransactionService(TransactionRepository transactionRepository ,AccountRepository accountRepository) {
        this.transactionRepository = transactionRepository;
        this.accountRepository = accountRepository;
    }

}
