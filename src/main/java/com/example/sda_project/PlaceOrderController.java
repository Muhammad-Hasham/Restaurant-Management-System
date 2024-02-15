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
import java.util.ArrayList;

public class PlaceOrderController {
    @FXML
    public Button logOutButton;

    @FXML
    public Button confirmButton;

    @FXML
    public Button BackButton;

    @FXML
    public Button AddToCartbtn;

    @FXML
    public Button VeiwCart;
    @FXML
    public TableView<?> MenuTable;

    @FXML
    public TableColumn<?, ?> col_ID;

    @FXML
    public TableColumn<?, ?> col_MenuItems;

    @FXML
    public TextField txt_F_ItemID;

    @FXML
    public TextField txt_F_Quantity;

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
    public void goToOrderConfirmation(ActionEvent event) throws IOException {
        int quantity[] = Main.restaurant.GetQuantityArray();
        int items [] = Main.restaurant.GetItemArray();
        if (Main.restaurant.makeOrder(items, quantity,  Main.restaurant.getCusID())) {
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            new Main().changeSceneToOrderConfirmation(stage);
        }
    }
    @FXML
    public void AddToCart(ActionEvent event) {
    Main.restaurant.addToCart(Integer.parseInt(txt_F_ItemID.getText())
            ,Integer.parseInt(txt_F_Quantity.getText()));

    }
    @FXML
    public void goToCartScreen(ActionEvent event) throws IOException {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        new Main().changeSceneToCartScreen(stage);
    }
}
