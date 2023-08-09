module com.example.javafxtutorials {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javafxtutorials to javafx.fxml;
    exports com.example.javafxtutorials;
}