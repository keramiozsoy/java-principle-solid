package com.example.solid.openClosed.example2.good;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Account account = new CurrentAccount();
        BankAppWithdrawalService service = new BankAppWithdrawalService(account);
        service.withdrawCurrent(BigDecimal.ONE);

        // Solution
        // Now, we can add new account type.
        // We do not need to update BankAppWithdrawalService.
    }
}
