package com.example.javafxdemo;
import javafx.application.Application;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    Button button;
    Stage window;

    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));

        window = primaryStage;
        Label label1 = new Label("Welcome to the Lords of the Locker Room");
        Scene scene1 = new Scene(fxmlLoader.load(), 320, 240);
        primaryStage.setTitle("Faq Leather man");
        primaryStage.setScene(scene1);
        button = new Button();
        button.setText("Ah, thank you, sir");

        // actionEvent is a functional interface which can be replaced by a lambda expression
        button.setOnAction(actionEvent -> System.out.println("Don't touch me there ~"));
        primaryStage.show();

        StackPane layout = new StackPane();
        layout.getChildren().add(button);
    }
}