package com.carrental;
/**
 * CSUN COMP 380/L - Spring 2026
 *
 * @author EAM
 */
public class Customer {
    private int customerID;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String phoneNumber;

    // default constructor
    public Customer() {
        this.customerID = -1;
        this.firstName = "N/A";
        this.lastName = "N/A";
        this.email = "N/A";
        this.password = "N/A";
        this.phoneNumber = "N/A";
    }

    // complete constructor
    public Customer(int customerID, String firstName, String lastName,
                    String email, String password, String phoneNumber) {
        this.customerID = customerID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.phoneNumber = phoneNumber;
    }

    // These methods are better handled by AuthService
    public void register() {
        // registration should be handled in AuthService
    }

    public boolean login(String email, String password) {
        // login should be handled in AuthService
        return this.email.equals(email) && this.password.equals(password);
    }

    public int getCustomerID() {
        return this.customerID;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPassword() {
        return this.password;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setCustomerID(int customerID) {
    }
}

