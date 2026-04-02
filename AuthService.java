/**
 * CSUN COMP 380/L - Spring 2026
 *
 * @author EAM
 */
import java.util.ArrayList;
import java.util.List;

public class AuthService {
    private Customer loggedInCustomer;
    private boolean sessionActive;
    private List<Customer> customers; // acts as in-memory database

    // default constructor
    public AuthService() {
        this.loggedInCustomer = null;
        this.sessionActive = false;
        this.customers = new ArrayList<>();
    }

    // register a new customer
    public void registerCustomer(Customer c) {
        // check if email already exists
        for (Customer customer : customers) {
            if (customer.getEmail().equals(c.getEmail())) {
                System.out.println("Email already registered.");
                return;
            }
        }
        customers.add(c);
        System.out.println("Customer registered successfully.");
    }

    // login validation
    public boolean validateLogin(String email, String password) {
        for (Customer customer : customers) {
            if (customer.getEmail().equals(email) &&
                customer.getPassword().equals(password)) {

                this.loggedInCustomer = customer;
                this.sessionActive = true;
                System.out.println("Login successful.");
                return true;
            }
        }
        System.out.println("Invalid email or password.");
        return false;
    }

    // logout
    public void logout() {
        this.loggedInCustomer = null;
        this.sessionActive = false;
        System.out.println("Logged out successfully.");
    }

    public boolean isSessionActive() {
        return this.sessionActive;
    }

    public Customer getLoggedInCustomer() {
        return this.loggedInCustomer;
    }
}
