package com.example.solid.dependencyInversion.good;

public class SMSSender extends Message {
    private String phoneNumber;

    public SMSSender(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    private void sendSMS(){
        System.out.println(" SendSMS ->" + phoneNumber);
    }

    @Override
    public void sendMessage() {
        sendSMS();
    }
}
