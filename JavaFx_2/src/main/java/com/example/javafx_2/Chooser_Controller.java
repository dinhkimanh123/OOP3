package com.example.javafx_2;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class Chooser_Controller {
    @FXML
    protected ImageView imageView;
    @FXML
    protected AnchorPane anchorPane;

    public void chooserImg(ActionEvent event){
        Stage stage = (Stage) anchorPane.getScene().getWindow();
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("choose a img");
        FileChooser.ExtensionFilter extensionFilter = new FileChooser.ExtensionFilter("Img file", "*jpeg","*.jpg","*.png");
        fileChooser.getExtensionFilters().add(extensionFilter);


    }





}
