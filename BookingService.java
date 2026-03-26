/**
 * CSUN COMP 380/L - Spring 2026
 *
 * @author EAM
 */
import java.util.List;

public class BookingService {
    private List<Booking> bookings;

    // default constructor
    public BookingService() {
        this.bookings = null;
    }

    // complete constructor
    public BookingService(List<Booking> bookings) {
        this.bookings = bookings;
    }

    public boolean isDoubleBooked(int carID, String start, String end) {
        return false;
    }

    public Booking createBooking(Cart cart, Customer customer) {
        return null;
    }

    public List<Booking> getBookingsByCustomer(int customerID) {
        return null;
    }

    public void confirmBooking(Booking booking) {
    }
}
