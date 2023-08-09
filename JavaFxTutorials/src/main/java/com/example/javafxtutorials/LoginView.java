package com.example.javafxtutorials;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginView {
    @FXML
    TextField name;
    @FXML
    TextField pass;

    public void login(){
        String name = this.name.getText();
        String pass = this.pass.getText();

        if (name.equals("admin") & pass.equals("pass")) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setContentText("thanh cong");
        } else {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setContentText("that bai");
            alert.show();
            }
        }

   }
