package com.example.solid.openClosed.example2.good;

import java.math.BigDecimal;

public class BankAppWithdrawalService {

    private final Account account;

    public BankAppWithdrawalService(Account account) {
        this.account = account;
    }

    void withdrawCurrent(BigDecimal amount) {
        account.withdraw(amount);
    }

    void withdrawSaving(BigDecimal amount) {
        account.withdraw(amount);
    }
}
