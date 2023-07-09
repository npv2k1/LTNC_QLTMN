package com.example.qltmn_ltnc.controllers;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;

public class SignUpController implements Initializable {
    @FXML
    private Button button_signup;
    @FXML
    private  Button button_log_in;
    @FXML
    private TextField tf_username;
    @FXML
    private PasswordField tf_password;
    @FXML
    private TextField tf_phone;
    @FXML
    private RadioButton rb_male;
    @FXML
    private RadioButton rb_female;
    @FXML
    private TextField tf_address;
    @FXML
    private TextField tf_name;
    @FXML
    private DatePicker dp_dob;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //Gom lại thành gender
        ToggleGroup toggleGroup = new ToggleGroup();
        //Only choice
        rb_male.setToggleGroup(toggleGroup);
        rb_female.setToggleGroup(toggleGroup);
        rb_male.setSelected(true);

        //Định dạng lại dob
        LocalDate myDob = dp_dob.getValue();
        String myFormattedDob = myDob.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));

        //Thao tác với sign up button
        button_signup.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String toggleName = ((RadioButton) toggleGroup.getSelectedToggle()).getText();
                //Loại bỏ khoảng trắng thừa từ username, password, address, name, phone
                if(!tf_username.getText().trim().isEmpty() && !tf_password.getText().trim().isEmpty() && !tf_address.getText().trim().isEmpty() && !tf_phone.getText().trim().isEmpty() && !tf_name.getText().trim().isEmpty()) {
                    //Tiến hành sign up (SignUp-DAO)
                }
                else {
                    System.out.println("Hãy điền đầy đủ thông tin");
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setContentText("Nhập đầy đủ thông tin để đăng ký");
                    alert.show();
                }
            }
        });

        //Thao tác với Login button
        button_log_in.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                //Chuyển về trang đăng ký (changeScence-DAO)
            }
        });
    }
}
