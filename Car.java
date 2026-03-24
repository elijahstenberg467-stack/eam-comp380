/**
 * CSUN COMP 380/L - Spring 2026
 * 
 * @author EAM
 */
public class Car {
    private String type;
    private double price;
    private boolean avail;
    
    public Car() {
	this.type = "N/A";
	this.price = 0;
	this.availability = false;
    }
    
    public Car(String type, double price, boolean avail) {
	this.type = type;
	this.price = price;
	this.avail = avail;
    }
}
