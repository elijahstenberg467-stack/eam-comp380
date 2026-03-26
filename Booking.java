/**
 * CSUN COMP 380/L - Spring 2026
 *
 * @author EAM
 */
public class Booking {
    private int bookingID;
    private Customer customer;
    private Car car;
    private String startDate;
    private String endDate;
    private String status;
    private Payment payment;

    // default constructor
    public Booking() {
        this.bookingID = -1;
        this.customer = null;
        this.car = null;
        this.startDate = "N/A";
        this.endDate = "N/A";
        this.status = "N/A";
        this.payment = null;
    }

    // complete constructor
    public Booking(int bookingID, Customer customer, Car car,
                   String startDate, String endDate,
                   String status, Payment payment) {
        this.bookingID = bookingID;
        this.customer = customer;
        this.car = car;
        this.startDate = startDate;
        this.endDate = endDate;
        this.status = status;
        this.payment = payment;
    }

    public int getBookingID() {
        return this.bookingID;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Payment getPayment() {
        return this.payment;
    }
}
