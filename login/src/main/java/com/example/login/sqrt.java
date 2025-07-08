package com.example.login;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class sqrt extends Application {

    @Override
    public void start(Stage arg0) throws Exception {
        Text text = new Text();
        TextField textField = new TextField();
        textField.setPromptText("Enter a number to find its square");
        textField.setFocusTraversable(false);
        textField.setMaxWidth(200);

        Button bt = new Button("Calculate Square");
        bt.setStyle("-fx-background-color: blue; -fx-text-fill: black; -fx-font-weight: bold;");
        bt.setMaxWidth(200);
        bt.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent arg0) {
                text.setText("Square of Given no is " + 
                             (Integer.parseInt(textField.getText()) * Integer.parseInt(textField.getText())));

                            }
            
        });

        Button bt2 = new Button("Squre root");
        bt2.setStyle("-fx-background-color: blue; -fx-text-fill: black; -fx-font-weight: bold;");
        bt2.setMaxWidth(200);
        ;
        bt2.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent arg0) {
               text.setText("Square root of Given no. is " + Integer.parseInt(textField.getText()) + " is " + 
                            Math.sqrt(Integer.parseInt(textField.getText()) ));
            }
            
        });
        
        VBox vb = new VBox(10, textField, bt,bt2, text);
        vb.setAlignment(javafx.geometry.Pos.CENTER);
        vb.setPadding(new Insets(50, 50, 50, 50));
        vb.setStyle("-fx-background-color: yellow");
        Scene scene = new Scene(vb, 1280, 720);

        arg0.setTitle("Square Calculator");

        arg0.setScene(scene);
        arg0.show();
    }
    
}
