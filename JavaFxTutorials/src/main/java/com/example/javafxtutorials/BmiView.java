package com.example.javafxtutorials;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class BmiView {
   @FXML
    TextField height;
   @FXML
    TextField weight;
   @FXML
   Label result;

   public void BMI(){
       double height1 = Double.parseDouble(height.getText());
       double weight1 = Double.parseDouble(weight.getText());
       double BMI = weight1/(height1 * 2);
       result.setText("" + BMI);

   }



}
