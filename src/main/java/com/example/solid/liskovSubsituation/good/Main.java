package com.example.solid.liskovSubsituation.good;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        WithdrawableAccount currentAccount = new CurrentAccount();
        BankAppWithdrawalService service1 = new BankAppWithdrawalService(currentAccount);
        service1.withdrawCurrent(BigDecimal.ONE);

        WithdrawableAccount savingsAccount = new SavingsAccount();
        BankAppWithdrawalService service2 = new BankAppWithdrawalService(savingsAccount);
        service2.withdrawCurrent(BigDecimal.TEN);

        Account fixedTermDepositAccount = new FixedTermDepositAccount();
        BankAppDepositService service3 = new BankAppDepositService(fixedTermDepositAccount);
        service3.doDeposit(BigDecimal.TEN);

        // Solution
        // Delete withdraw method from Account.
        // Create, WithDrawableAccount
        // Extend, WithDrawableAccount from Account
        // Extend, CurrentAccount and SavingAccount from WithDrawableAccount
        // Extend, FixedTermDepositAccount from Account.
        // Update, BankAppWithdrawalService constructor with WithDrawableAccount
        // Create, BankAppDepositService class and add Account class as constructor.
        // Now, we can use two services without change behaviour of parent type.

    }
}
