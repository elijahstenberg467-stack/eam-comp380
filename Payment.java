/**
 * CSUN COMP 380/L - Spring 2026
 *
 * @author EAM
 */
public class Payment {
    private int paymentID;
    private double subtotal;
    private double taxRate;
    private double fees;
    private double totalAmount;

    // default constructor
    public Payment() {
        this.paymentID = -1;
        this.subtotal = 0.0;
        this.taxRate = 0.0;
        this.fees = 0.0;
        this.totalAmount = 0.0;
    }

    // complete constructor
    public Payment(int paymentID, double subtotal, double taxRate,
                   double fees, double totalAmount) {
        this.paymentID = paymentID;
        this.subtotal = subtotal;
        this.taxRate = taxRate;
        this.fees = fees;
        this.totalAmount = totalAmount;
    }

    public double calculateSubtotal(int days, double pricePerDay) {
        this.subtotal = days * pricePerDay;
        return this.subtotal;
    }

    public double applyTaxAndFees() {
        double taxAmount = this.subtotal * this.taxRate;
        this.totalAmount = this.subtotal + taxAmount + this.fees;
        return this.totalAmount;
    }

    public int getPaymentID() {
        return this.paymentID;
    }

    public double getSubtotal() {
        return this.subtotal;
    }

    public double getTaxRate() {
        return this.taxRate;
    }

    public double getFees() {
        return this.fees;
    }

    public double getTotalAmount() {
        return this.totalAmount;
    }
}