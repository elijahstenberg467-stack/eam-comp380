/**
 * CSUN COMP 380/L - SPRING 2026
 *
 * @AUTHOR EAM
 */
PUBLIC CLASS EMAILNOTIFICATION {
    PRIVATE STRING RECIPIENTEMAIL;
    PRIVATE STRING SUBJECT;
    PRIVATE STRING BODY;

    // DEFAULT CONSTRUCTOR
    PUBLIC EMAILNOTIFICATION() {
        THIS.RECIPIENTEMAIL = "N/A";
        THIS.SUBJECT = "N/A";
        THIS.BODY = "N/A";
    }

    // COMPLETE CONSTRUCTOR
    PUBLIC EMAILNOTIFICATION(STRING RECIPIENTEMAIL, String subject, String body) {
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
