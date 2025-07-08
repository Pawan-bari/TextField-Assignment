package com.example.login;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class login extends Application {

    @Override
    public void start(Stage Mystage) throws Exception {
        Text text = new Text();
        TextField textField = new TextField();
        Button bt = new Button("Print Text");
        
        textField.setPromptText("Enter your text here");

        bt.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                text.setText(textField.getText());
                
            }
        });
        bt.setStyle("-fx-background-color: blue; -fx-text-fill: black; -fx-font-weight: bold;");
        bt.setMaxWidth(200);
        VBox vb = new VBox(10,textField,bt,text);
        vb.setPadding(new Insets(40, 10, 10, 10));
        vb.setStyle("-fx-background-color: yellow");        
        Scene scene = new Scene(vb, 1280, 720);
        scene.setFill(Color.YELLOW);
        Mystage.setTitle("Login");
        Mystage.setScene(scene);
        Mystage.show();
    }
    
}
