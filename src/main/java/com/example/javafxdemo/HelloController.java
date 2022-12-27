package com.example.javafxdemo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Maybe you and I should settle it \n right here on the ring");
    }

    @FXML
    protected void onThankYouButtonClick() {
        System.out.printf("Don't touch me there ~");
    }
}