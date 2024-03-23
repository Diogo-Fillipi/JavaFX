module com.example.training2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.training2 to javafx.fxml;
    exports com.example.training2;
}