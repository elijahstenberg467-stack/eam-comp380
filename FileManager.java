/**
 * CSUN COMP 380/L - Spring 2026
 *
 * @author EAM
 */
package com.carrental;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileManager {

    // ============================================================
    // CAR METHODS
    // ============================================================

    public static List<Car> loadCars(String filePath) {
        List<Car> cars = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts      = line.split(",");
                int carID           = Integer.parseInt(parts[0].trim());
                String type         = parts[1].trim();
                String brand        = parts[2].trim();
                String model        = parts[3].trim();
                double pricePerDay  = Double.parseDouble(parts[4].trim());
                boolean isAvailable = Boolean.parseBoolean(parts[5].trim());
                cars.add(new Car(carID, type, brand, model, pricePerDay, isAvailable));
            }
        } catch (IOException e) {
            System.out.println("Error loading cars: " + e.getMessage());
        }
        return cars;
    }

    public static void saveCars(List<Car> cars, String filePath) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (Car car : cars) {
                writer.write(
                        car.getCarID() + "," +
                                car.getType() + "," +
                                car.getBrand() + "," +
                                car.getModel() + "," +
                                car.getPricePerDay() + "," +
                                car.isAvailable()
                );
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error saving cars: " + e.getMessage());
        }
    }

    // ============================================================
    // CUSTOMER METHODS
    // ============================================================

    public static List<Customer> loadCustomers(String filePath) {
        List<Customer> customers = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts  = line.split(",");
                int customerID  = Integer.parseInt(parts[0].trim());
                String firstName = parts[1].trim();
                String lastName  = parts[2].trim();
                String email    = parts[3].trim();
                String password = parts[4].trim();
                String phone    = parts[5].trim();
                customers.add(new Customer(customerID, firstName, lastName, email, password, phone));
            }
        } catch (IOException e) {
            System.out.println("Error loading customers: " + e.getMessage());
        }
        return customers;
    }

    public static void saveCustomers(List<Customer> customers, String filePath) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (Customer customer : customers) {
                writer.write(
                        customer.getCustomerID() + "," +
                                customer.getFirstName() + "," +
                                customer.getLastName() + "," +
                                customer.getEmail() + "," +
                                customer.getPassword() + "," +
                                customer.getPhoneNumber()
                );
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error saving customers: " + e.getMessage());
        }
    }

    // ============================================================
    // BOOKING METHODS
    // ============================================================

    public static List<Booking> loadBookings(String filePath) {
        List<Booking> bookings = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                int bookingID  = Integer.parseInt(parts[0].trim());
                int customerID = Integer.parseInt(parts[1].trim());
                int carID      = Integer.parseInt(parts[2].trim());
                String start   = parts[3].trim();
                String end     = parts[4].trim();
                String status  = parts[5].trim();
                double total   = Double.parseDouble(parts[6].trim());

                Customer customer = new Customer();
                customer.setCustomerID(customerID);

                Car car = new Car();
                car.setCarID(carID);

                Payment payment = new Payment();
                payment.setTotalAmount(total);

                bookings.add(new Booking(bookingID, customer, car, start, end, status, payment));
            }
        } catch (IOException e) {
            System.out.println("Error loading bookings: " + e.getMessage());
        }
        return bookings;
    }

    public static void saveBookings(List<Booking> bookings, String filePath) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (Booking booking : bookings) {
                writer.write(
                        booking.getBookingID() + "," +
                                booking.getCustomer().getCustomerID() + "," +
                                booking.getCar().getCarID() + "," +
                                booking.getStartDate() + "," +
                                booking.getEndDate() + "," +
                                booking.getStatus() + "," +
                                booking.getPayment().getTotalAmount()
                );
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error saving bookings: " + e.getMessage());
        }
    }
}