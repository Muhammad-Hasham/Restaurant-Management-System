package com.example.sda_project;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class RestockIngredientsController {

    @FXML
    public Button logOutButton;

    @FXML
    public Button confirmButton;

    @FXML
    public Button BackButton;

    @FXML
    public TextField txt_F_ItemID;

    @FXML
    public TextField Txt_F_Quantity;

    @FXML
    public void goToManagerScreen(ActionEvent event) throws IOException {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        new Main().changeSceneToManagerScreen(stage);
    }

    @FXML
    public void goToLoginScreen(ActionEvent event) throws IOException {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        new Main().changeSceneToLoginScreen(stage);
    }

    @FXML
    public void AddToInventory(ActionEvent event) throws IOException {

        if(Main.restaurant.RestockIngredient(Integer.parseInt(txt_F_ItemID.getText())
                , Integer.parseInt(Txt_F_Quantity.getText()))){
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            new Main().changeSceneToROConfirmation(stage);
        }
    }
}