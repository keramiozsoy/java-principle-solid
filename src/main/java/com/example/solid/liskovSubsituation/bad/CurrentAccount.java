package com.example.solid.liskovSubsituation.bad;

import java.math.BigDecimal;

public class CurrentAccount extends Account {

    @Override
    void deposit(BigDecimal amount) {
        //
    }

    @Override
    void withdraw(BigDecimal amount) {
        //
    }
}
