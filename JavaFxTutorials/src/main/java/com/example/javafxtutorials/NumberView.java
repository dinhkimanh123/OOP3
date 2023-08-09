package com.example.javafxtutorials;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.util.concurrent.ThreadLocalRandom;

public class NumberView {
    @FXML
    TextField soBatKi;
    @FXML
    TextField soNgauNhien;
    @FXML
    TextField reuslt;

    @FXML
    protected void Number(){
        int randomNum = ThreadLocalRandom.current().nextInt(1,101);
        soNgauNhien.getText();
        int anyNumber = Integer.parseInt(soBatKi.getText());
        if (anyNumber == randomNum ){
            reuslt.setText("ok");
        }else {
            reuslt.setText("false");
        }


    }



}
