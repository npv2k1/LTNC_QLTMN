module com.example.qltmn_ltnc {

    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.qltmn_ltnc to javafx.fxml;
    exports com.example.qltmn_ltnc;
    opens com.example.qltmn_ltnc.controllers to javafx.fxml;
}