package com.example.sda_project;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class OrderConfirmationController {

    @FXML
    public Button logOutButton;

    @FXML
    public Button BackToCustomerS;

    @FXML
    public Button Print;

    @FXML
    public Label Label_OrderID;

    @FXML
    public Label Label_Price;

    @FXML
    public Label Label_TotalItemsOrdered;

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
    public void PrintOrderConfirmation(ActionEvent event)  {
    int [] Details = Main.restaurant.getOrderDetails();
    Label_TotalItemsOrdered.setText(String.valueOf(Details[0]));
    Label_OrderID.setText(String.valueOf(Details[1]));

    }

}
