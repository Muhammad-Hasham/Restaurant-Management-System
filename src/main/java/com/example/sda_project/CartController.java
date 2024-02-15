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

public class CartController {

    @FXML
    public Button logOutButton;

    @FXML
    public Button BackButton;

    @FXML
    public TableView<?> CartTable;

    @FXML
    public TableColumn<?, ?> col_ItemID;

    @FXML
    public TableColumn<?, ?> col_ItemName;

    @FXML
    public TextField txt_F_ID;

    @FXML
    public TextField txt_F_quantity;

    @FXML
    public Button Removebtn;

    @FXML
    public void RemoveItem(ActionEvent event) {
        Main.restaurant.removeFromCart(Integer.parseInt(txt_F_ID.getText())
                , Integer.parseInt(txt_F_quantity.getText()));

    }

    @FXML
    public void goToLoginScreen(ActionEvent event) throws IOException {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        new Main().changeSceneToLoginScreen(stage);
    }

    @FXML
    public void goToPlaceOrderScreen(ActionEvent event) throws IOException {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        new Main().changeSceneToPlaceOrder(stage);
    }


}
