package com.example.solid.dependencyInversion.good;

public class Notification {
    private final Message notificationMessage;

    public Notification(Message message) {
        this.notificationMessage = message;
    }

    void sender(){
        notificationMessage.sendMessage();
    }
}
