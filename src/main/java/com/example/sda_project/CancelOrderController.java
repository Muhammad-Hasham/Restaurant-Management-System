package com.example.sda_project;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class CancelOrderController {

    @FXML
    public Button logOutButton;

    @FXML
    public Button ConfirmButton;

    @FXML
    public TextField TxtF_OrderID;

    @FXML
    public Button BackButton;


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
    public void CancelOrder(ActionEvent event) throws IOException {
        if (Main.restaurant.CancelOrder(Integer.parseInt(TxtF_OrderID.getText()))) {
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            new Main().changeSceneToCusSuccess(stage);

        }
    }
    }

