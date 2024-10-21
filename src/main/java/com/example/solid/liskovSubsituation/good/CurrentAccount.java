package com.example.solid.liskovSubsituation.good;

import java.math.BigDecimal;

public class CurrentAccount extends WithdrawableAccount {

    @Override
    void deposit(BigDecimal amount) {

    }

    @Override
    public void withdraw(BigDecimal amount) {
        System.out.println("CurrentAccount - WithdrawableAccount can withdraw.");
    }
}
