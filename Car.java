package com.carrental;
/**
 * CSUN COMP 380/L - Spring 2026
 * 
 * @author EAM
 */
public class Car {
    private int carID;
    private String type;
    private String brand;
    private String model;
    private double pricePerDay;
    private boolean isAvailable;

    // default constructor
    public Car() {
        this.carID = -1;
        this.type = "N/A";
        this.brand = "N/A";
        this.model = "N/A";
        this.pricePerDay = 0.0;
        this.isAvailable = false;
    }

    // complete constructor
    public Car(int carID, String type, String brand, String model, double pricePerDay,
	       boolean isAvailable) {
        this.carID = carID;
        this.type = type;
        this.brand = brand;
        this.model = model;
        this.pricePerDay = pricePerDay;
        this.isAvailable = isAvailable;
    }

    public int getCarID() {
	return this.carID;
    }

    public String getType() { return this.type; }

    public String getBrand() { return this.brand; }

    public String getModel() {
        return model;
    }

    public boolean isAvailable() { return this.isAvailable; }

    public boolean isAvailableForDates(String startDate, String endDate) {
	return false;
    }

    public double getPricePerDay() {
	return pricePerDay;
    }

    public void setAvailability(boolean status) {
	this.isAvailable = status;
    }

    public void setCarID(int carID) { this.carID = carID; }
}
