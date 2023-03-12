package com.example.desweek6;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.io.IOException;

public class RegistrationFormController {
    public RegistrationFormController() {

    }

    @FXML
    private Button submitButton;
    @FXML
    private Label textMessage;
    @FXML
    private TextField fullName;
    @FXML
    private TextField emailID;
    @FXML
    private PasswordField password;

    public void submitButton_onClick(ActionEvent event) throws IOException {
        checkSubmit();

    }

    private void checkSubmit() throws IOException {
        if (fullName.getText().isEmpty() || emailID.getText().isEmpty() || password.getText().isEmpty()) {
            textMessage.setText("Please enter your details.");
        }

        else {
            textMessage.setText("Registered successfully !!!");
        }
    }
}