package com.example.qltmn_ltnc.controllers;

import com.example.qltmn_ltnc.dao.DBUtils;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {
    @FXML
    private Button button_logout;
    @FXML
    private Hyperlink managerTeacher;
    @FXML
    private Hyperlink managerStudent;
    @FXML
    private Hyperlink managerClass;
    @FXML
    private Label label_welcome;
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        button_logout.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                DBUtils.changeScence(event,"login.fxml", "Login", null, null);
            }
        });

        //Manager Teacher
        managerTeacher.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                DBUtils.changeScence(event, "managerTeacher.fxml", "Manager Teacher", null, null);
            }
        });

        //ManagerStudent
        managerStudent.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                DBUtils.changeScence(event, "managerStudent.fxml", "Manager Student", null, null);
            }
        });

        //ManagerClass
        managerClass.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                DBUtils.changeScence(event, "managerClass.fxml", "Manager Class", null, null);
            }
        });
    }
    public void setUserInformation(String username, String password) {
        label_welcome.setText("Welcome " + username + "!");
    }
}
