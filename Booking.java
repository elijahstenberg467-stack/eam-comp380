/**
 * CSUN COMP 380/L - Spring 2026
 *
 * @author EAM
 */
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Booking {
    private int bookingID;
    private Customer customer;
    private Car car;
    private LocalDate startDate;
    private LocalDate endDate;
    private BookingStatus status;
    private Payment payment;

    // default constructor
    public Booking() {
        this.bookingID = -1;
        this.customer = null;
        this.car = null;
        this.startDate = null;
        this.endDate = null;
        this.status = BookingStatus.PENDING;
        this.payment = null;
    }

    // complete constructor
    public Booking(int bookingID, Customer customer, Car car,
                   LocalDate startDate, LocalDate endDate,
                   BookingStatus status, Payment payment) {
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

    public Customer getCustomer() {
        return this.customer;
    }

    public Car getCar() {
        return this.car;
    }

    public LocalDate getStartDate() {
        return this.startDate;
    }

    public LocalDate getEndDate() {
        return this.endDate;
    }

    public BookingStatus getStatus() {
        return this.status;
    }

    public void setStatus(BookingStatus status) {
        this.status = status;
    }

    public Payment getPayment() {
        return this.payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    // helper method
    public long getRentalDays() {
        return ChronoUnit.DAYS.between(startDate, endDate);
    }
}
