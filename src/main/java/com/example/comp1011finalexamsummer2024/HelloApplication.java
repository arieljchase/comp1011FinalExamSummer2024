//Ariel Chase - 200566592

package com.example.comp1011finalexamsummer2024;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("table-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();

        //Question 6: Creating our TableView
        TableView<Customer> table = new TableView<>();

        TableColumn<Customer, Integer> idCol = new TableColumn<>("Id");
        TableColumn<Customer, String> firstnameCol = new TableColumn<>("First Name");
        TableColumn<Customer, String> lastnameCol = new TableColumn<>("Last Name");
        TableColumn<Customer, String> phoneCol = new TableColumn<>("Phone Number");
        TableColumn<Customer, String> purchaseCol = new TableColumn<>("Total Purchases");

        idCol.setCellValueFactory(new PropertyValueFactory<>("id"));
        firstnameCol.setCellValueFactory(new PropertyValueFactory<>("firstName"));
        lastnameCol.setCellValueFactory(new PropertyValueFactory<>("lastName"));
        phoneCol.setCellValueFactory(new PropertyValueFactory<>("phoneNumber"));
        purchaseCol.setCellValueFactory(new PropertyValueFactory<>("totalPurchases"));

        table.getColumns().addAll(idCol, firstnameCol, lastnameCol, phoneCol, purchaseCol);
    }

    public static void main(String[] args) {
        launch();
    }
}

