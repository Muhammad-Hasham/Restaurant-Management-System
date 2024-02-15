package com.example.sda_project;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class UpdateController {
    @FXML
    public Button logOutButton;

    @FXML
    public Button UpdateButton;

    @FXML
    public TextField TxtF_NewName;

    @FXML
    public TextField TxtF_NewDescription;

    @FXML
    public TextField TxtF_NewPrice;

    @FXML
    public TextField TxtF_FoodItemID;

    @FXML
    public Button BackButton;

    @FXML
    public void UpdateMenuItem(ActionEvent event) throws IOException {

        if (Main.restaurant.EditItem(Integer.parseInt(TxtF_FoodItemID.getText()), TxtF_NewName.getText(), TxtF_NewDescription.getText(), Double.parseDouble(TxtF_NewPrice.getText()))){
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
