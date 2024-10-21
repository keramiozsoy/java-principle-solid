package com.example.solid.liskovSubsituation.good;

import java.math.BigDecimal;

public class SavingsAccount extends WithdrawableAccount {

    @Override
    void deposit(BigDecimal amount) {

    }

    @Override
    public void withdraw(BigDecimal amount) {
        System.out.println("SavingsAccount - WithdrawableAccount can withdraw.");
    }
}
