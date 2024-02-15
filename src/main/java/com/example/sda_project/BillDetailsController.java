package com.example.sda_project;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class BillDetailsController {
    public Button logOutButton;

    @FXML
    public Button PrintButton;

    @FXML
    public Label Label_OrderID;

    @FXML
    public Label Label_Tax;

    @FXML
    public Label Label_TotalCost;

    @FXML
    public Button BackButton;


    @FXML
    public void goToLoginScreen(ActionEvent event) throws IOException {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        new Main().changeSceneToLoginScreen(stage);
    }

    @FXML
    public void goToManagerScreen(ActionEvent event) throws IOException {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        new Main().changeSceneToManagerScreen(stage);
    }

    public void PrintBillDetails(ActionEvent event)  {
        double Bill[] = Main.restaurant.returnBill();
      Label_OrderID.setText(String.valueOf(Bill[2]));
      Label_TotalCost.setText(String.valueOf(Bill[0]));
      Label_Tax.setText(String.valueOf(Bill[1]));

    }
}
