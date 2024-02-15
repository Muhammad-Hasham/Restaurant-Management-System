package com.example.sda_project;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class Main extends Application {
    static Restaurant restaurant = new Restaurant();
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("LoginScreen.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 750, 500);
        //stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        restaurant.loadFiles();
        launch();
    }

    public void changeSceneToLoginScreen(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("LoginScreen.fxml"));
        stage.setScene(new Scene(fxmlLoader.load(), 750, 500));
        stage.show();
    }

    public void changeSceneToCustomerScreen(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("Customer.fxml"));
        stage.setScene(new Scene(fxmlLoader.load(), 750, 500));
        stage.show();
    }

    public void changeSceneToManagerScreen(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("Manager.fxml"));
        stage.setScene(new Scene(fxmlLoader.load(), 750, 500));
        stage.show();
    }

    public void changeSceneToBookTableScreen(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("BookTable.fxml"));
        stage.setScene(new Scene(fxmlLoader.load(), 750, 500));
        stage.show();
    }

    public void changeSceneToShowTables(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("ShowTables.fxml"));
        stage.setScene(new Scene(fxmlLoader.load(), 750, 500));
        stage.show();
    }

    public void changeSceneToTableConfirmation(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("TableConfirmation.fxml"));
        stage.setScene(new Scene(fxmlLoader.load(), 750, 500));
        stage.show();
    }

    public void changeSceneToPlaceOrder(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("PlaceOrder.fxml"));
        stage.setScene(new Scene(fxmlLoader.load(), 750, 500));
        stage.show();
    }

    public void changeSceneToOrderConfirmation(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("OrderConfirmation.fxml"));
        stage.setScene(new Scene(fxmlLoader.load(), 750, 500));
        stage.show();
    }

    public void changeSceneToRestockScreen(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("RestockIngredients.fxml"));
        stage.setScene(new Scene(fxmlLoader.load(), 750, 500));
        stage.show();
    }

    public void changeSceneToSelectSupplier(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("SelectSupplier.fxml"));
        stage.setScene(new Scene(fxmlLoader.load(), 750, 500));
        stage.show();
    }

    public void changeSceneToROConfirmation(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("ROConfirmation.fxml"));
        stage.setScene(new Scene(fxmlLoader.load(), 750, 500));
        stage.show();
    }

    public void changeSceneGiveFeedback(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("Feedback.fxml"));
        stage.setScene(new Scene(fxmlLoader.load(), 750, 500));
        stage.show();
    }

    public void changeSceneSalaryDetails(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("SalaryDetails.fxml"));
        stage.setScene(new Scene(fxmlLoader.load(), 750, 500));
        stage.show();
    }

    public void changeSceneBillDetails(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("BillDetails.fxml"));
        stage.setScene(new Scene(fxmlLoader.load(), 750, 500));
        stage.show();
    }

    public void changeSceneToManageMenuScreen(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("ManageMenuScreen.fxml"));
        stage.setScene(new Scene(fxmlLoader.load(), 750, 500));
        stage.show();
    }

    public void changeSceneToAddScreen(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("AddScreen.fxml"));
        stage.setScene(new Scene(fxmlLoader.load(), 750, 500));
        stage.show();
    }

    public void changeSceneToDeleteScreen(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("DeleteScreen.fxml"));
        stage.setScene(new Scene(fxmlLoader.load(), 750, 500));
        stage.show();
    }

    public void changeSceneToUpdateScreen(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("UpdateScreen.fxml"));
        stage.setScene(new Scene(fxmlLoader.load(), 750, 500));
        stage.show();
    }

    public void changeSceneToCancelOrder(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("CancelOrder.fxml"));
        stage.setScene(new Scene(fxmlLoader.load(), 750, 500));
        stage.show();
    }

    public void changeSceneToCancelReservation(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("CancelReservation.fxml"));
        stage.setScene(new Scene(fxmlLoader.load(), 750, 500));
        stage.show();
    }

    public void changeSceneToGenerateBill(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("GenerateBill.fxml"));
        stage.setScene(new Scene(fxmlLoader.load(), 750, 500));
        stage.show();
    }

    public void changeSceneToComputeSalary(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("ComputeSalary.fxml"));
        stage.setScene(new Scene(fxmlLoader.load(), 750, 500));
        stage.show();
    }

  public void changeSceneToCartScreen(Stage stage) throws IOException {
      FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("ViewCart.fxml"));
      stage.setScene(new Scene(fxmlLoader.load(), 750, 500));
      stage.show();
  }

    public void changeSceneToCusSuccess(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("CusSuccess.fxml"));
        stage.setScene(new Scene(fxmlLoader.load(), 750, 500));
        stage.show();
    }
    public void changeSceneToManagerSuccess(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("ManagerSuccess.fxml"));
        stage.setScene(new Scene(fxmlLoader.load(), 750, 500));
        stage.show();
    }

}

