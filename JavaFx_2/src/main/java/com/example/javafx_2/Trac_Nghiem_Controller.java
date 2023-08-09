package com.example.javafx_2;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;

public class Trac_Nghiem_Controller {
    @FXML
    protected RadioButton radioButton1, radioButton2, radioButton3;
    @FXML
    private ToggleGroup ToggleGroup1;
    public void click(ActionEvent event){
        radioButton1.setToggleGroup(ToggleGroup1);
        radioButton2.setToggleGroup(ToggleGroup1);
        radioButton3.setToggleGroup(ToggleGroup1);

        if (radioButton1.isSelected()) {
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle(" Khanh co phai sv khong ");
            alert.setContentText("A : Dung");
            alert.show();
        } else {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle(" Khanh co phai sv khong ");
            alert.setContentText("sai");
            alert.show();
        }
    }

}
