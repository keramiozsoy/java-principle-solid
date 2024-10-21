package com.example.solid.dependencyInversion.bad;

public class EmailSender {
    private String email;

    public EmailSender(String email) {
        this.email = email;
    }

    void sendEmail(){
        System.out.println(" SendEmail ->" + email);
    }
}
