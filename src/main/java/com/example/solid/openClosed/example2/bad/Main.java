package com.example.solid.openClosed.example2.bad;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        CurrentAccount currentAccount = new CurrentAccount();
        SavingsAccount savingsAccount = new SavingsAccount();
        BankAppWithdrawalService service = new BankAppWithdrawalService(currentAccount, savingsAccount);

        service.withdrawCurrent(BigDecimal.ONE);
        service.withdrawSaving(BigDecimal.TEN);

        // Problem
        // The BankAppWithdrawalService, CurrentAccount and SavingsAccount depend directly on.
        // We want to add new account, we should change BankAppWithdrawalService.
        // It is not support Open/Closed.
    }
}
