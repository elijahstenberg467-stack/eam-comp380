/**
 * CSUN COMP 380/L - Spring 2026
 *
 * @author EAM
 */
package com.carrental;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.util.List;

public class CarListController {

    @FXML private TextField searchDateField;
    @FXML private ListView<String> carListView;
    @FXML private Label statusLabel;

    private List<Car> allCars;

    private static final String CARS_FILE = "data/cars.txt";

    @FXML
    public void initialize() {
        allCars = FileManager.loadCars(CARS_FILE);
        populateList(allCars);
    }

    private void populateList(List<Car> cars) {
        carListView.getItems().clear();
        for (Car car : cars) {
            if (car.isAvailable()) {
                carListView.getItems().add(
                        car.getCarID() + " | " +
                                car.getType() + " | " +
                                car.getBrand() + " " + car.getModel() + " | " +
                                "$" + car.getPricePerDay() + "/day"
                );
            }
        }
        if (carListView.getItems().isEmpty()) {
            statusLabel.setText("No available cars found.");
        } else {
            statusLabel.setText("");
        }
    }

    @FXML
    public void handleSearch() {
        String date = searchDateField.getText().trim();
        if (date.isEmpty()) {
            statusLabel.setText("Please enter a date to search.");
            return;
        }
        // full date filtering will be wired in once BookingService is ready
        statusLabel.setText("Showing available cars (date filtering coming soon).");
        populateList(allCars);
    }

    @FXML
    public void handleShowAll() {
        searchDateField.clear();
        populateList(allCars);
        statusLabel.setText("");
    }

    @FXML
    public void handleViewDetails() {
        int index = carListView.getSelectionModel().getSelectedIndex();
        if (index < 0) {
            statusLabel.setText("Please select a car first.");
            return;
        }
        Car selectedCar = getSelectedCar(index);
        if (selectedCar == null) return;

        try {
            FXMLLoader loader = new FXMLLoader(
                    getClass().getResource("/com/carrental/cardetail-view.fxml")
            );
            Scene scene = new Scene(loader.load(), 800, 600);
            CarDetailController controller = loader.getController();
            controller.setCar(selectedCar);
            Stage stage = (Stage) carListView.getScene().getWindow();
            stage.setScene(scene);
        } catch (Exception e) {
            statusLabel.setText("Error loading car details.");
            e.printStackTrace();
        }
    }

    @FXML
    public void handleAddToCart() {
        int index = carListView.getSelectionModel().getSelectedIndex();
        if (index < 0) {
            statusLabel.setText("Please select a car first.");
            return;
        }
        Car selectedCar = getSelectedCar(index);
        if (selectedCar == null) return;

        try {
            FXMLLoader loader = new FXMLLoader(
                    getClass().getResource("/com/carrental/cart-view.fxml")
            );
            Scene scene = new Scene(loader.load(), 800, 600);
            CartController controller = loader.getController();
            controller.setCar(selectedCar);
            Stage stage = (Stage) carListView.getScene().getWindow();
            stage.setScene(scene);
        } catch (Exception e) {
            statusLabel.setText("Error loading cart.");
            e.printStackTrace();
        }
    }

    @FXML
    public void handleLogOut() {
        try {
            FXMLLoader loader = new FXMLLoader(
                    getClass().getResource("/com/carrental/login-view.fxml")
            );
            Scene scene = new Scene(loader.load(), 600, 500);
            Stage stage = (Stage) carListView.getScene().getWindow();
            stage.setScene(scene);
        } catch (Exception e) {
            statusLabel.setText("Error logging out.");
            e.printStackTrace();
        }
    }

    private Car getSelectedCar(int index) {
        int count = 0;
        for (Car car : allCars) {
            if (car.isAvailable()) {
                if (count == index) return car;
                count++;
            }
        }
        return null;
    }
}