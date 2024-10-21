package com.example.solid.liskovSubsituation.bad;

import java.math.BigDecimal;

public class BankAppWithdrawalService {

    private final Account account;

    public BankAppWithdrawalService(Account account) {
        this.account = account;
    }

    void withdrawCurrent(BigDecimal amount) {
        account.withdraw(amount);
    }
}
