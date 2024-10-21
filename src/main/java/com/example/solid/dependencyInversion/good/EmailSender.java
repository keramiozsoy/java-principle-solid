package com.example.solid.dependencyInversion.good;

public class EmailSender extends Message{
    private final String email;

    public EmailSender(String email) {
        this.email = email;
    }


    private void sendEmail(){
        System.out.println(" SendEmail ->" + email);
    }

    @Override
    public void sendMessage() {
        sendEmail();
    }


}
