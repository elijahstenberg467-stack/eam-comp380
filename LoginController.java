package com.carrental;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginController {

    @FXML private TextField emailField;
    @FXML private PasswordField passwordField;
    @FXML private Label errorLabel;
    @FXML private Button loginButton;

    @FXML
    public void handleLogin() {
        try {
            FXMLLoader loader = new FXMLLoader(
                    getClass().getResource("/com/carrental/carlist-view.fxml")
            );
            Scene scene = new Scene(loader.load(), 800, 600);
            Stage stage = (Stage) loginButton.getScene().getWindow();
            stage.setScene(scene);
        } catch (Exception e) {
            errorLabel.setText("Error loading car list.");
            e.printStackTrace();
        }
    }

    @FXML
    public void handleRegister() {
        errorLabel.setText("Register coming soon.");
    }
}