package com.example.sda_project;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class ManagerController {

    @FXML
    public Button generateBillButton;

    @FXML
    public Button RestockButton;

    @FXML
    public Button logOutButton;

    @FXML
    public Button ManageMenuButton;

    @FXML
    public Button ComputeSalaryButton;

    @FXML
    public void goToComputeSalary(ActionEvent event) throws IOException {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        new Main().changeSceneToComputeSalary(stage);
    }

    @FXML
    public void goToGenerateBill(ActionEvent event) throws IOException {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        new Main().changeSceneToGenerateBill(stage);
    }

    @FXML
    public void goToLoginScreen(ActionEvent event) throws IOException {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        new Main().changeSceneToLoginScreen(stage);
    }

    @FXML
    public void goToManageMenu(ActionEvent event) throws IOException{
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        new Main().changeSceneToManageMenuScreen(stage);
    }

    @FXML
    public void goToRestockScreen(ActionEvent event) throws IOException{
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        new Main().changeSceneToRestockScreen(stage);
    }

}
