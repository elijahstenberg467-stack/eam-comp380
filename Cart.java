/**
 * CSUN COMP 380/L - Spring 2026
 *
 * @author EAM
 */
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Cart {
    private int cartID;
    private Car selectedCar;
    private String startDate;
    private String endDate;

    // default constructor
    public Cart() {
        this.cartID = -1;
        this.selectedCar = null;
        this.startDate = "N/A";
        this.endDate = "N/A";
    }

    // complete constructor
    public Cart(int cartID, Car selectedCar, String startDate, String endDate) {
        this.cartID = cartID;
        this.selectedCar = selectedCar;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public void addCar(Car car) {
        this.selectedCar = car;
    }

    public void removeCar() {
        this.selectedCar = null;
    }

    public int getCartID() {
        return this.cartID;
    }

    public Car getSelectedCar() {
        return this.selectedCar;
    }

    public String getStartDate() {
        return this.startDate;
    }

    public String getEndDate() {
        return this.endDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public int getRentalDays() {
        if (startDate == null || endDate == null ||
            startDate.equals("N/A") || endDate.equals("N/A")) {
            return 0;
        }

        LocalDate start = LocalDate.parse(startDate);
        LocalDate end = LocalDate.parse(endDate);

        long days = ChronoUnit.DAYS.between(start, end);
        return (int) days;
    }

    public double getPriceSummary() {
        if (selectedCar == null) {
            return 0.0;
        }

        int rentalDays = getRentalDays();
        return selectedCar.getPricePerDay() * rentalDays;
    }
}
