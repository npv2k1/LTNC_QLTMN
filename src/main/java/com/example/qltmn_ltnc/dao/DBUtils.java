package com.example.qltmn_ltnc.dao;

import com.example.qltmn_ltnc.controllers.LoginController;
import com.example.qltmn_ltnc.controllers.MainController;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.stage.Stage;

import java.sql.*;
import java.time.LocalDate;

public class DBUtils {
    public static void changeScence(ActionEvent event, String fxmlfile, String title, String username, String password) {
        Parent root = null;
        if(username != null && password != null ) {
            try {
                FXMLLoader loader = new FXMLLoader(DBUtils.class.getResource(fxmlfile));
                root = loader.load();
                MainController mainController = loader.getController();
                if(mainController != null) {
                    mainController.setUserInformation(username, password);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            try {
                root = FXMLLoader.load(DBUtils.class.getResource(fxmlfile));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle(title);
        stage.setScene(new Scene(root, 700, 500));
        stage.show();
    }


    //Đăng ký
    public  static void signUpUser(ActionEvent event, String username, String password, String phone, String gender, String address, String name, LocalDate dob) {
        Connection connection = null;

        //Insert account
        PreparedStatement psInsert = null;
        //Check account exits?
        PreparedStatement psCheckUserExists = null;
        ResultSet resultSet = null;
        String url = "jdbc:sqlserver://DESKTOP-9J07U8P\\SQLEXPRESS:1433;"+"user=sa;password=123;databaseName=QLTMN;encrypt=true;trustServerCertificate=true";
        try{
            connection = DriverManager.getConnection(url);
            psCheckUserExists = connection.prepareCall("SELECT * FROM user WHERE username = ?");
            psCheckUserExists.setString(1, username);
            resultSet = psCheckUserExists.executeQuery();

            if(resultSet.isBeforeFirst()) {
                System.out.println("Tài khoản đã tồn tại");
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setContentText("Bạn không thể sử dụng tên đăng nhập này");
                alert.show();
            } else {
                psInsert = connection.prepareStatement("INSERT INTO user (username, password, phone, gender, address, name, dob) VALUES (?, ?, ?, ?, ?, ?, ?)");
                psInsert.setString(1, username);
                psInsert.setString(2, password);
                psInsert.setString(3, phone);
                psInsert.setString(4, gender);
                psInsert.setString(5, address);
                psInsert.setString(6, name);
                psInsert.setDate(7, Date.valueOf(dob));
                psInsert.executeUpdate();
                System.out.println("Đăng ký thành công");
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setContentText("Đăng ký thành công");
                alert.show();
                //changeScence();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            //Giải phóng bộ nhớ
            if(resultSet != null) {
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(psCheckUserExists != null) {
                try {
                    psCheckUserExists.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(psInsert != null) {
                try {
                    psInsert.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void loginUser(ActionEvent event, String username, String password) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        String url = "jdbc:sqlserver://DESKTOP-9J07U8P\\SQLEXPRESS:1433;"+"user=sa;password=123;databaseName=QLTMN;encrypt=true;trustServerCertificate=true";
        try {
            connection = DriverManager.getConnection(url);
            preparedStatement = connection.prepareStatement("SELECT password, phone, gender, address, name, dob FROM user WHERE username = ?");
            preparedStatement.setString(1, username);
            resultSet = preparedStatement.executeQuery();
            //Check account?
            if(!resultSet.isBeforeFirst()) {
                System.out.println("Tài khoản không tồn tại");
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setContentText("Tài khoản không tồn tại");
                alert.show();
            } else {
                while (resultSet.next()) {
                    String retriedPassword = resultSet.getString("password");
                    if(retriedPassword.equals(password)) {
                        System.out.println("Đăng nhập thành công");
                       // changeScence();
                    } else {
                        System.out.println("Mật khẩu sai");
                        Alert alert = new Alert(Alert.AlertType.ERROR);
                        alert.setContentText("Mật khẩu sai");
                        alert.show();
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if(resultSet != null) {
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(preparedStatement != null) {
                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
