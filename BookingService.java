/**
 * CSUN COMP 380/L - Spring 2026
 *
 * @author EAM
 */
import java.util.ArrayList;
import java.util.List;

public class BookingService {
    private List<Booking> bookings;

    // default constructor
    public BookingService() {
        this.bookings = new ArrayList<>();
    }

    // complete constructor
    public BookingService(List<Booking> bookings) {
        if (bookings == null) {
            this.bookings = new ArrayList<>();
        } else {
            this.bookings = bookings;
        }
    }

    public boolean isDoubleBooked(int carID, String start, String end) {
        for (Booking booking : bookings) {
            if (booking.getCar().getCarID() == carID) {
                String existingStart = booking.getStartDate();
                String existingEnd = booking.getEndDate();

                // overlap exists unless one booking ends before the other starts
                if (!(end.compareTo(existingStart) < 0 || start.compareTo(existingEnd) > 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    public Booking createBooking(Cart cart, Customer customer) {
        if (cart == null || customer == null) {
            return null;
        }

        Car selectedCar = cart.getSelectedCar();
        String startDate = cart.getStartDate();
        String endDate = cart.getEndDate();

        if (selectedCar == null || startDate == null || endDate == null) {
            return null;
        }

        if (isDoubleBooked(selectedCar.getCarID(), startDate, endDate)) {
            return null;
        }

        int newBookingID = bookings.size() + 1;

        Booking booking = new Booking(
            newBookingID,
            customer,
            selectedCar,
            startDate,
            endDate,
            "PENDING",
            null
        );

        bookings.add(booking);
        return booking;
    }

    public List<Booking> getBookingsByCustomer(int customerID) {
        List<Booking> customerBookings = new ArrayList<>();

        for (Booking booking : bookings) {
            if (booking.getCustomer().getCustomerID() == customerID) {
                customerBookings.add(booking);
            }
        }

        return customerBookings;
    }

    public void confirmBooking(Booking booking) {
        if (booking != null) {
            booking.setStatus("CONFIRMED");
        }
    }
}
