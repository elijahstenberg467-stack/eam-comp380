package com.carrental;
/**
 * CSUN COMP 380/L - Spring 2026
 *
 * @author EAM
 */
public class AuthService {
    private Customer loggedInCustomer;
    private boolean sessionActive;

    // default constructor
    public AuthService() {
        this.loggedInCustomer = null;
        this.sessionActive = false;
    }

    // complete constructor
    public AuthService(Customer loggedInCustomer, boolean sessionActive) {
        this.loggedInCustomer = loggedInCustomer;
        this.sessionActive = sessionActive;
    }

    public boolean validateLogin(String email, String password) {
        return false;
    }

    public void registerCustomer(Customer c) {
    }

    public void logout() {
    }

    public boolean isSessionActive() {
        return this.sessionActive;
    }
}
