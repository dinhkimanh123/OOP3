module com.example.javafx_2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javafx_2 to javafx.fxml;
    exports com.example.javafx_2;
}