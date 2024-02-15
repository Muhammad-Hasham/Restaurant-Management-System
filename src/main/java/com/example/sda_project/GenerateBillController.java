package com.example.sda_project;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class GenerateBillController {
    @FXML
    public Button logOutButton;

    @FXML
    public Button CalculateButton;

    @FXML
    public TextField TxtF_OrderID;

    @FXML
    public Button BackButton;

    @FXML
    public TableView<?> OrderTable;

    @FXML
    public TableColumn<?, ?> col_TableID;

    @FXML
    public TableColumn<?, ?> col_OrderID;

    @FXML
    public void GenerateBill(ActionEvent event) throws IOException {
        Main.restaurant.GenerateBill(Integer.parseInt(TxtF_OrderID.getText()));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        new Main().changeSceneBillDetails(stage);
    }

    @FXML
    public void goToLoginScreen(ActionEvent event) throws IOException {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        new Main().changeSceneToLoginScreen(stage);
    }

    @FXML
    void goToManagerScreen(ActionEvent event) throws IOException {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        new Main().changeSceneToManagerScreen(stage);
    }
}
