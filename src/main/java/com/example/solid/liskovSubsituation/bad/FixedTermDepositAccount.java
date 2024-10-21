package com.example.solid.liskovSubsituation.bad;

import java.math.BigDecimal;

public class FixedTermDepositAccount extends Account{

    @Override
    void deposit(BigDecimal amount) {

    }

    @Override
    void withdraw(BigDecimal amount) {
        // This behaviour is opposite of Liskov.
        throw new UnsupportedOperationException();
    }
}
