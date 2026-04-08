package com.carrental;
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
        return 0.0;
    }

    public double applyTaxAndFees() {
        return 0.0;
    }

    public double getTotalAmount() {
        return this.totalAmount;
    }

    public void setTotalAmount(double total) {
    }
}
