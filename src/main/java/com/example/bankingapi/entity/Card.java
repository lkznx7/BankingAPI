package com.example.bankingapi.entity;

import com.example.bankingapi.entity.enums.CardType;
import com.example.bankingapi.entity.enums.Status;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.YearMonth;
import java.util.UUID;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID ID;
    private String cardNumber;
    private CardType cardType;
    private YearMonth expirationDate;
    private Status status;
}
