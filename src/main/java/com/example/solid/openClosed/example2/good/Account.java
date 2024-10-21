package com.example.solid.openClosed.example2.good;

import java.math.BigDecimal;

public abstract class Account {
    abstract void deposit(BigDecimal amount);
    abstract void withdraw(BigDecimal amount);
}
