//package com.example.javafx_2;
//
//import javafx.application.Application;
//import javafx.fxml.FXML;
//import javafx.fxml.Initializable;
//import javafx.scene.control.ListView;
//import javafx.stage.Stage;
//
//import java.net.URL;
//import java.util.ResourceBundle;
//
//public class Student_Controller implements Initializable {
//    private Integer id;
//    private String name;
//    private int age;
//
//    public Student_Controller(Integer id, String name, int age) {
//        this.id = id;
//        this.name = name;
//        this.age = age;
//    }
//
//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    @FXML
//    private ListView<Student> listView;
//    public ListView<Student> getListView(){
//        return listView;
//    }
//    @Override
//    public void initialize(URL url, ResourceBundle resourceBundle) {
//        listView.setCellFactory(param -> new );
//    }
//
//}
