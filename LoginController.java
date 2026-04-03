package com.carrental;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {

    @FXML private TextField emailField;
    @FXML private PasswordField passwordField;
    @FXML private Label errorLabel;

    @FXML
    public void handleLogin() {
        errorLabel.setText("Login coming soon.");
    }

    @FXML
    public void handleRegister() {
        errorLabel.setText("Register coming soon.");
    }
}