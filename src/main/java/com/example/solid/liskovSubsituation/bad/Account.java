package com.example.solid.liskovSubsituation.bad;

import java.math.BigDecimal;

public abstract class Account {
    abstract void deposit(BigDecimal amount);
    abstract void withdraw(BigDecimal amount);
}
