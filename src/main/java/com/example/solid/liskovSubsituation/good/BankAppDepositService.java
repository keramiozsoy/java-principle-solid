package com.example.solid.liskovSubsituation.good;

import java.math.BigDecimal;

public class BankAppDepositService {

    private final Account account;

    public BankAppDepositService(Account account) {
        this.account = account;
    }

    void doDeposit(BigDecimal amount) {
        account.deposit(amount);
    }
}
