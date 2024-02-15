package com.example.sda_project;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class CustomerController {

    @FXML
    public Button bookTableButton;

    @FXML
    public Button placeOrder;

    @FXML
    public Button logOutButton;

    @FXML
    public Button CancelOrderButton;

    @FXML
    public Button GiveFeedbackButton;

    @FXML
    public Button CancelReservationButton;

    @FXML
    public void goToBookTable(ActionEvent event) throws IOException {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        new Main().changeSceneToBookTableScreen(stage);
    }

    @FXML
    public void goToLoginScreen(ActionEvent event) throws IOException {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        new Main().changeSceneToLoginScreen(stage);
    }

    @FXML

    public void goToPlaceOrder(ActionEvent event) throws IOException {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        new Main().changeSceneToPlaceOrder(stage);
    }

    @FXML
    public void goToCancelOrder(ActionEvent event) throws IOException {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        new Main().changeSceneToCancelOrder(stage);

    }

    @FXML
    public void goToCancelReservation(ActionEvent event) throws IOException {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        new Main().changeSceneToCancelReservation(stage);
    }

    @FXML
    public void goToGiveFeedback(ActionEvent event) throws IOException {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        new Main().changeSceneGiveFeedback(stage);
    }
}

