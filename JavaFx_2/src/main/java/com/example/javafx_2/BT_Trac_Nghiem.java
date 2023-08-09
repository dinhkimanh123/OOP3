package com.example.javafx_2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class BT_Trac_Nghiem extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage ) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("tracnghiem-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Trắc Nghiệm!");
        stage.setScene(scene);
        stage.show();

    }
}
