package com.example.solid.liskovSubsituation.good;

import java.math.BigDecimal;

public abstract class WithdrawableAccount extends Account {
    public abstract void withdraw(BigDecimal amount);
}
