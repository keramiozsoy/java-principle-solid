package com.example.solid.liskovSubsituation.bad;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Account currentAccount = new CurrentAccount();
        BankAppWithdrawalService service1 = new BankAppWithdrawalService(currentAccount);
        service1.withdrawCurrent(BigDecimal.ONE);

        Account savingsAccount = new SavingsAccount();
        BankAppWithdrawalService service2 = new BankAppWithdrawalService(savingsAccount);
        service2.withdrawCurrent(BigDecimal.TEN);

        // Problem
        // There is not problem until you added new account type.
        // FixedTermDepositAccount does not support withdraw operation (UnSupporttedOperation0
        // Liskov supports, subtypes can not change behavior of parent type.

        Account fixedTermDepositAccount = new FixedTermDepositAccount();
        BankAppWithdrawalService service3 = new BankAppWithdrawalService(fixedTermDepositAccount);
        // Blow code will get new UnsupportedOperationException()
        fixedTermDepositAccount.withdraw(BigDecimal.TEN);


    }
}
