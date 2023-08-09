package com.example.javafxtutorials;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class tinhTuoi {
    @FXML
    private TextField year;
    public void click(){
        int a = 2023;
        int age = a - Integer.parseInt(year.getText());
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText("Tuoi ban la : " + age);
        alert.show();
    }


}
