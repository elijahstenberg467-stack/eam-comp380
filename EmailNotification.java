/**
 * CSUN COMP 380/L - SPRING 2026
 *
 * @AUTHOR EAM
 */
public class EmailNotification {
    private String recipientEmail;
    private String subject;
    private String body;

    // default constructor
    public EmailNotification() {
        this.recipientEmail = "N/A";
        this.subject = "N/A";
        this.body = "N/A";
    }

    // complete constructor
    public EmailNotification(String recipientEmail, String subject, String body) {
        this.recipientEmail = recipientEmail;
        this.subject = subject;
        this.body = body;
    }

    public void formatEmail(Booking booking, Customer customer) {
        if (booking == null || customer == null) return;

        this.recipientEmail = customer.getEmail();
        this.subject = "Booking Confirmation";

        this.body = "Hello " + customer.getFirstName() + ",\n\n"
                + "Your booking has been confirmed.\n"
                + "Booking ID: " + booking.getBookingID() + "\n"
                + "Car ID: " + booking.getCar().getCarID() + "\n"
                + "Start Date: " + booking.getStartDate() + "\n"
                + "End Date: " + booking.getEndDate() + "\n"
                + "\nThank you for choosing our service!";
    }

    public boolean sendConfirmation(String email) {
        if (email == null || email.equals("N/A")) {
            return false;
        }

        // simulate sending email
        System.out.println("Sending email to: " + email);
        System.out.println("Subject: " + subject);
        System.out.println("Body:\n" + body);

        return true;
    }

    public String getBody() {
        return this.body;
    }
}