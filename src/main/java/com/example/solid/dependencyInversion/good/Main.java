package com.example.solid.dependencyInversion.good;

public class Main {
    public static void main(String[] args) {
        EmailSender emailSender = new EmailSender("test@mail.com");
        //SMSSender smsSender = new SMSSender("`123456");

        Notification notification = new Notification(emailSender);
        notification.sender();

        // Solution
        // Create, Abstract Message class which provides common point for senders.
        // Extends, EmailSender and SmsSender from Message class.
        // Notification class will take parameter which is extended from Message class.
        // We fixed problem
        // When we wanted to add new sender classes,
        // The  Notification class will not be updated. :)

    }
}
