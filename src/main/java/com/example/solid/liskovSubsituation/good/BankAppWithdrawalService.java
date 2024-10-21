package com.example.solid.liskovSubsituation.good;

import java.math.BigDecimal;

public class BankAppWithdrawalService {

    private final WithdrawableAccount withdrawableAccount;

    public BankAppWithdrawalService(WithdrawableAccount withdrawableAccount) {
        this.withdrawableAccount = withdrawableAccount;
    }

    void withdrawCurrent(BigDecimal amount) {
        withdrawableAccount.withdraw(amount);
    }
}
