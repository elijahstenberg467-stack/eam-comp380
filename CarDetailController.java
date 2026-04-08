package com.carrental;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class CarDetailController {

    @FXML private Label typeLabel;
    @FXML private Label brandLabel;
    @FXML private Label modelLabel;
    @FXML private Label priceLabel;
    @FXML private Label availLabel;
    @FXML private Label statusLabel;

    private Car car;

    public void setCar(Car car) {
        this.car = car;
        typeLabel.setText("Type: "   + car.getType());
        brandLabel.setText("Brand: " + car.getBrand());
        modelLabel.setText("Model: " + car.getModel());
        priceLabel.setText("Price: $" + car.getPricePerDay() + " / day");
        availLabel.setText("Available: " + (car.isAvailable() ? "Yes" : "No"));
    }

    @FXML
    public void handleAddToCart() {
        try {
            FXMLLoader loader = new FXMLLoader(
                    getClass().getResource("/com/carrental/cart-view.fxml")
            );
            Scene scene = new Scene(loader.load(), 800, 600);
            CartController controller = loader.getController();
            controller.setCar(car);
            Stage stage = (Stage) typeLabel.getScene().getWindow();
            stage.setScene(scene);
        } catch (Exception e) {
            statusLabel.setText("Error loading cart.");
            e.printStackTrace();
        }
    }

    @FXML
    public void handleBack() {
        try {
            FXMLLoader loader = new FXMLLoader(
                    getClass().getResource("/com/carrental/carlist-view.fxml")
            );
            Scene scene = new Scene(loader.load(), 800, 600);
            Stage stage = (Stage) typeLabel.getScene().getWindow();
            stage.setScene(scene);
        } catch (Exception e) {
            statusLabel.setText("Error going back.");
            e.printStackTrace();
        }
    }
}