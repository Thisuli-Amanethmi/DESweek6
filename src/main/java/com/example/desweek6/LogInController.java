package com.example.desweek6;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LogInController {
    public LogInController(){

    }

    @FXML
    private Button login_button;
    @FXML
    private Label wrong_login;
    @FXML
    private TextField username;
    @FXML
    private PasswordField password;


    public void userLogIn(ActionEvent actionEvent) throws Exception {
        checkLogin(actionEvent);

    }

    private void checkLogin(ActionEvent actionEvent) throws Exception {
        if (username.getText().toString().equals("user name") && password.getText().toString().equals("1234")) {
            wrong_login.setText("Login Success !!!");
            navigate(actionEvent);
        }

        else if (username.getText().isEmpty() && password.getText().isEmpty()) {
            wrong_login.setText("Please enter your login information.");
        }

        else {
            wrong_login.setText("Wrong username or password.");
        }
    }

    private void navigate(ActionEvent actionEvent) throws Exception {
        Stage newStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("RegistrationForm-view.fxml"));
        newStage.setScene(new Scene(root, 600, 400));
        newStage.show();

        Stage previousStage = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        previousStage.close();
    }
}