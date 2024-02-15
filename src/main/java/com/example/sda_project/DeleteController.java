package com.example.sda_project;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class DeleteController {

    @FXML
    public Button logOutButton;

    @FXML
    public Button DeleteButton;

    @FXML
    public Button BackButton;

    @FXML
    public TextField TxtF_FoodItemID;

    @FXML
    public void DeleteMenuItem(ActionEvent event) throws IOException {
        if (Main.restaurant.DeleteItem(Integer.parseInt(TxtF_FoodItemID.getText()))) {
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
    void GoToManageMenu(ActionEvent event)throws IOException {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        new Main().changeSceneToManageMenuScreen(stage);
    }

}
