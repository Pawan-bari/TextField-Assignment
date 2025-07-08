package com.example.login;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class auth extends Application{

    @Override
    public void start(Stage arg0) throws Exception {
       Text text = new Text();
        TextField textField = new TextField();
        PasswordField passwordField = new PasswordField();
        Button bt = new Button("Login");
        
        textField.setPromptText("Username");
        passwordField.setPromptText("Password");
        textField.setFocusTraversable(false);
        passwordField.setFocusTraversable(false);
        bt.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (textField.getText().equals("password") && passwordField.getText().equals("password")) {
                    text.setText("Login successful");
                } else {
                    text.setText("Login failed");
                }   
            }
        });
        bt.setStyle("-fx-background-color: blue; -fx-text-fill: black; -fx-font-weight: bold;");
        bt.setMaxWidth(200);
        VBox vb = new VBox(10,textField,passwordField,bt,text);
        vb.setPadding(new Insets(40, 10, 10, 10));
        vb.setStyle("-fx-background-color: yellow");        
        Scene scene = new Scene(vb, 1280, 720);
        scene.setFill(Color.YELLOW);
        arg0.setTitle("Login");
        arg0.setScene(scene);
        arg0.show();
    }
    }
    

