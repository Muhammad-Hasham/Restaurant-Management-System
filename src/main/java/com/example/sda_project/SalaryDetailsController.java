package com.example.sda_project;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class    SalaryDetailsController {

        @FXML
        public Button logOutButton;

    @FXML
    public Button Print;

    @FXML
    public Label Label_EmpID;

    @FXML
    public Label Label_EmpName;

    @FXML
    public Label Label_TotalHoursW;

    @FXML
    public Label Label_Salary;

    @FXML
    public Label Label_Month;

    @FXML
    public Button BackButton;

        @FXML
        public void goToLoginScreen(ActionEvent event) throws IOException {
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            new Main().changeSceneToLoginScreen(stage);
        }

        @FXML
        public void goToManagerScreen(ActionEvent event) throws IOException {
            //shifted from here
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            new Main().changeSceneToManagerScreen(stage);
        }
    @FXML
    void PrintSalaryDetails(ActionEvent event) {
            //shifted this part from the above function so do check it again-
        Employee E = Main.restaurant.employeeData();
        Label_EmpID.setText(String.valueOf(E.getEmployeeId()));
        Label_EmpName.setText(String.valueOf(E.getName()));
        Label_TotalHoursW.setText(String.valueOf(E.getTotalHoursWorked()));
        Label_Salary.setText(String.valueOf(E.getSalary()));
        Label_Month.setText(String.valueOf(E.getMonth()));
    }
}
