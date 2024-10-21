package com.example.solid.dependencyInversion.bad;

public class SMSSender {
    private String phoneNumber;

    public SMSSender(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    void sendSMS(){
        System.out.println(" SendSMS ->" + phoneNumber);
    }
}
