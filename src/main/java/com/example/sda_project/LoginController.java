package com.example.sda_project;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController {

        @FXML
        public Button managerButton;

        @FXML
        public Button customerButton;

        @FXML
        public TextField TxtF_LoginID;

        @FXML
        public PasswordField PassF_Password;

        @FXML
        public Button LoginButton;

        @FXML
        public void goToCustomerScreen(ActionEvent event) throws IOException {

                int id = Integer.parseInt(TxtF_LoginID.getText());
                if(Main.restaurant.LoginCustomer( id, PassF_Password.getText())) {
                        Main.restaurant.setCusID(id);

                        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                        new Main().changeSceneToCustomerScreen(stage);
                }
        }
        @FXML
        public void goToManagerScreen(ActionEvent event) throws IOException {
                int id = Integer.parseInt(TxtF_LoginID.getText());
                if(Main.restaurant.LoginEmployee(id, PassF_Password.getText())) {
                        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                        new Main().changeSceneToManagerScreen(stage);
                }
        }
        }


