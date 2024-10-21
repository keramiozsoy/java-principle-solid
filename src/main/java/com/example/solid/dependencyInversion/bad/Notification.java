package com.example.solid.dependencyInversion.bad;

public class Notification {
    private final EmailSender emailSender;
    private final SMSSender smsSender;

    public Notification(EmailSender emailSender, SMSSender smsSender) {
        this.emailSender = emailSender;
        this.smsSender = smsSender;
    }

    void sender(){
        emailSender.sendEmail();
        smsSender.sendSMS();
    }
}
