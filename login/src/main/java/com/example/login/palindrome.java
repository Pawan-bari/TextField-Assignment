package com.example.login;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class palindrome extends Application {

    @Override
    public void start(Stage primaryStage) {
        
        TextField txField = new TextField();
        txField.setPromptText("Enter a word or phrase");

        Button Bt = new Button("Check Palindrome");

        Label Label = new Label();
        Bt.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent arg0) {
                String input = txField.getText();
            if (isPalindrome(input)) {
                Label.setText("palindrome!");
            } else {
                Label.setText("not palindrome.");
            }
            }
            
        });
        VBox vb = new VBox(10, txField, Bt, Label);
        vb.setStyle("-fx-padding: 20; -fx-alignment: center;");

        
        Scene scene = new Scene(vb, 300, 200);
        primaryStage.setTitle("Palindrome Checker");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    private boolean isPalindrome(String text) {
        if (text == null) return false;
        String cleaned = text.replaceAll("[\\W_]", "").toLowerCase();
        return cleaned.equals(new StringBuilder(cleaned).reverse().toString());
    }

}