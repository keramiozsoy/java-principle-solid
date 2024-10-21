package com.example.solid.openClosed.example2.bad;

import java.math.BigDecimal;

public class BankAppWithdrawalService {

    private final CurrentAccount currentAccount;
    private final SavingsAccount savingsAccount;

    public BankAppWithdrawalService(CurrentAccount currentAccount, SavingsAccount savingsAccount) {
        this.currentAccount = currentAccount;
        this.savingsAccount = savingsAccount;
    }


    void withdrawCurrent(BigDecimal amount) {
        currentAccount.withDraw(amount);
    }

    void withdrawSaving(BigDecimal amount) {
        savingsAccount.withdraw(amount);
    }
}
