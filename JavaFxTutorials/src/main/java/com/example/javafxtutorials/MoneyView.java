package com.example.javafxtutorials;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class MoneyView {
    @FXML
    private TextField price; // ti gia
    @FXML
    private TextField usd;
    @FXML
    private Label result; // kqua
    @FXML
    protected void money(){
        int priceInl = Integer.parseInt(price.getText());
        int usdInl = Integer.parseInt(usd.getText());
        int vnd = usdInl*priceInl;
        result.setText("" + vnd);
    }
}
