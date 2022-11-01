package com.example.simplecalculator_syed;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


import java.io.IOException;

import static javafx.application.Application.launch;

public class HelloApplication extends Application {
    public GridPane gp = new GridPane();

    public Label labelOne = new Label("Number 1: ");
    public static TextField fieldOne = new TextField();

    public Label labelTwo = new Label("Number 2: ");
    public static TextField fieldTwo = new TextField();

    public static Label labelThree = new Label("Result: ");
    public static TextField fieldThree = new TextField();

    @Override
    public void start(Stage stage) throws IOException {
        gp.setAlignment(Pos.CENTER);
        gp.setPadding(new Insets(10, 10, 10, 10));
        gp.setHgap(10);
        gp.setVgap(10);
        gp.setStyle("-fx-background-color: white");
        Scene scene = new Scene(gp, 900, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
        buildUI();
    }

    public void buildUI() {


        Button add = new Button("Add");
        add.setOnAction(new addEvent());
        Button subtract = new Button("Subtract");
        subtract.setOnAction(new subtractEvent());
        Button multiply = new Button("Multiply");
        multiply.setOnAction(new multiplyEvent());
        Button divide = new Button("Divide");
        divide.setOnAction(new divideEvent());

        gp.add(labelOne, 0, 0);
        gp.add(fieldOne, 1, 0);
        gp.add(labelTwo, 2, 0);
        gp.add(fieldTwo, 3, 0);
        gp.add(labelThree, 4, 0);
        gp.add(fieldThree, 5, 0);
        gp.add(add, 0, 1);
        gp.add(subtract, 1, 1);
        gp.add(multiply, 2, 1);
        gp.add(divide, 3, 1);


    }




    public static void main(String[] args) {
        launch();
    }
}

class addEvent implements EventHandler<ActionEvent> {
    @Override
    public void handle(ActionEvent e) {
        double sum = Double.parseDouble(HelloApplication.fieldOne.getText()) + Double.parseDouble(HelloApplication.fieldTwo.getText());
        HelloApplication.fieldThree.setText(String.valueOf(sum));
    }
}
class subtractEvent implements EventHandler<ActionEvent> {
    @Override
    public void handle(ActionEvent e) {
        double difference = Double.parseDouble(HelloApplication.fieldOne.getText()) - Double.parseDouble(HelloApplication.fieldTwo.getText());
        HelloApplication.fieldThree.setText(String.valueOf(difference));
    }
}
class multiplyEvent implements EventHandler<ActionEvent> {
    @Override
    public void handle(ActionEvent e) {
        double product = Double.parseDouble(HelloApplication.fieldOne.getText()) * Double.parseDouble(HelloApplication.fieldTwo.getText());
        HelloApplication.fieldThree.setText(String.valueOf(product));
    }
}
class divideEvent implements EventHandler<ActionEvent> {
    @Override
    public void handle(ActionEvent e) {
        double quotient = Double.parseDouble(HelloApplication.fieldOne.getText()) / Double.parseDouble(HelloApplication.fieldTwo.getText());
        HelloApplication.fieldThree.setText(String.valueOf(quotient));
    }
}
