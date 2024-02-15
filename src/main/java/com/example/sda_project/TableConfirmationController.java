package com.example.sda_project;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class TableConfirmationController {

    @FXML
    public Button logOutButton;

    @FXML
    public Button BackToCustomerS1;


    @FXML
    public Label Label_ReservationID;

    @FXML
    public Button BackButton;

    @FXML
    public Button PrintButton;

    @FXML
    public void PrintReservationID(ActionEvent event) {
     int R = Main.restaurant.returnID();
        Label_ReservationID.setText(String.valueOf(R));

    }


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
}