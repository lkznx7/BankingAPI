package com.example.bankingapi.validationCustom;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = TransferValidator.class)

public @interface ValidTransfer {
    String message() default "destiantionAccountNumber é obrigatório para Transfer ";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};

}
