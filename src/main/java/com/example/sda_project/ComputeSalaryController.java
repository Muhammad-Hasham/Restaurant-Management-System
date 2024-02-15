package com.example.sda_project;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
public class ComputeSalaryController {

    @FXML
    public Button logOutButton;

    @FXML
    public Button CalculateButton;

    @FXML
    public Button BackButton;

    @FXML
    public TextField TxtF_EmpID;

    @FXML
    public void CalculateSalary(ActionEvent event) throws IOException {

        if (Main.restaurant.computeSalary(Integer.parseInt(TxtF_EmpID.getText()))) {
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            new Main().changeSceneSalaryDetails(stage);
        }
    }

    @FXML
    public void goToLoginScreen(ActionEvent event) throws IOException {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        new Main().changeSceneToLoginScreen(stage);
    }

    @FXML
    public void goToManagerScreen(ActionEvent event)throws IOException {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        new Main().changeSceneToManagerScreen(stage);
    }
}
