/**
 * CSUN COMP 380/L - Spring 2026
 *
 * @author EAM
 */
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
    }

    public void removeCar() {
    }

    public int getRentalDays() {
        return 0;
    }

    public double getPriceSummary() {
        return 0.0;
    }
}
