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

    public void register() {
	// fill method
    }

    public boolean login(String email, String password) {
	// fill method
	return false;
    }

    public int getCustomerID() {
	return this.customerID;
    }

    public String getEmail() {
	return this.email;
    }

}
