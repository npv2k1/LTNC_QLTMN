package com.example.qltmn_ltnc.controllers;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

import java.net.URL;
import java.util.ResourceBundle;

public class UserManager implements Initializable {
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    @FXML
    private VBox root;

    @FXML
    private Label helloLabel;

    @FXML
    private Button clickButton;

    @FXML
    private void handleButtonClick() {
//        helloLabel.setText("Button clicked!");
        System.out.println("Hello");
    }

}
