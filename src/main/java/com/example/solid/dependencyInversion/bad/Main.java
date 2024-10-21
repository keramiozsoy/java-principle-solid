package com.example.solid.dependencyInversion.bad;

public class Main {
    public static void main(String[] args) {
        EmailSender emailSender = new EmailSender("test@mail.com");
        SMSSender smsSender = new SMSSender("`123456");

        Notification notification = new Notification(emailSender, smsSender);
        notification.sender();

        // PROBLEM
        // We should update Notification class when we needed to add another sender system
    }
}
