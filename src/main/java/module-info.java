module com.example.qltmn_ltnc {

    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.qltmn_ltnc to javafx.fxml;
    exports com.example.qltmn_ltnc;
}