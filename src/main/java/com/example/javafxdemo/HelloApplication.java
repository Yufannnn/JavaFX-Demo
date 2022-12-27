package com.example.javafxdemo;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Stack;

public class HelloApplication extends Application implements EventHandler<ActionEvent> {
    public static void main(String[] args) {
        launch(args);
    }

    Button button;

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));

        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Faq Leather man");
        stage.setScene(scene);
        stage.show();

        button = new Button();
        button.setText("Ah, thank you, sir");
        // just looking for the handle method in the current class
        button.setOnAction(this);

        StackPane layout = new StackPane();
        layout.getChildren().add(button);
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        if(actionEvent.getSource()==button) {
            System.out.println("Don't touch me there");
        }
    }
}