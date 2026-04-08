package com.carrental;
/**
 * CSUN COMP 380/L - SPRING 2026
 *
 * @AUTHOR EAM
 */
public class EmailNotification {
    private String recipientEmail;
    private String subject;
    private String body;

    // DEFAULT CONSTRUCTOR
    public  EmailNotification() {
        this.recipientEmail = "N/A";
        this.subject = "N/A";
        this.body = "N/A";
    }

    // COMPLETE CONSTRUCTOR
    public EmailNotification(String recipientEmail, String subject, String body) {
        this.recipientEmail = recipientEmail;
        this.subject = subject;
        this.body = body;
    }

    public void formatEmail(Booking booking, Customer customer) {
    }

    public boolean sendConfirmation(String email) {
        return false;
    }

    public String getBody() {
        return this.body;
    }
}
