package com.example.sda_project;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class BookTableController {

    @FXML
    public Button logOutButton;

    @FXML
    public Button confirmButton;


    @FXML
    public TextField TxtF_TableID;

    @FXML
    public TextField TxtF_Date;

    @FXML
    public TextField TxtF_Time;

    @FXML
    public Button BackButton;

    @FXML
    private TableView<?> Tables;

    @FXML
    public void goToCustomerScreen(ActionEvent event) throws IOException {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        new Main().changeSceneToCustomerScreen(stage);
    }

    @FXML
    public void goToLoginScreen(ActionEvent event) throws IOException {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        new Main().changeSceneToLoginScreen(stage);
    }
    @FXML
    public void goToTableConfirmation(ActionEvent event) throws IOException {
        if(Main.restaurant.makeReservation(Integer.parseInt(TxtF_TableID.getText()),Integer.parseInt(TxtF_TableID.getText()),TxtF_Date.getText(),TxtF_Time.getText())){
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        new Main().changeSceneToTableConfirmation(stage);
    }
    }
}

