package com.example.sda_project;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

import java.io.IOException;

public class FeedbackController {

    @FXML
    public Button logOutButton;

    @FXML
    public Button Send;

    @FXML
    public TextArea TxtA_feedback;

    @FXML
    public Button BackButton;

    @FXML
    void Savefeedback(ActionEvent event) throws IOException {
        if(Main.restaurant.Feedback(TxtA_feedback.getText())) {
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            new Main().changeSceneToCusSuccess(stage);
        }
    }

    @FXML
    public void goToLoginScreen(ActionEvent event) throws IOException {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        new Main().changeSceneToLoginScreen(stage);
    }

    public void goToCustomerScreen(ActionEvent event) throws IOException {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        new Main().changeSceneToCustomerScreen(stage);
    }


}
