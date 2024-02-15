package com.example.sda_project;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class AddController {

    @FXML
    public ResourceBundle resources;

    @FXML
    public URL location;

    @FXML
    public Button logOutButton;

    @FXML
    public Button AddButton;

    @FXML
    public Button BackButton;

    @FXML
    public TextField TxtF_ItemName;

    @FXML
    public TextField TxtF_ItemDescription;

    @FXML
    public TextField TxtF_ItemPrice;

    @FXML
    public void AddNewMenuItem(ActionEvent event) throws IOException {

        if (Main.restaurant.AddItem(TxtF_ItemName.getText(),
                TxtF_ItemDescription.getText(),
                Double.parseDouble(TxtF_ItemPrice.getText()))) {
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            new Main().changeSceneToManagerSuccess(stage);

        }
    }

    @FXML
    public void goToLoginScreen(ActionEvent event) throws IOException {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        new Main().changeSceneToLoginScreen(stage);
    }

    @FXML
    public void GoToManageMenu(ActionEvent event) throws IOException {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        new Main().changeSceneToManageMenuScreen(stage);
    }

}
