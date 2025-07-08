package com.example.login;

import java.applet.Applet;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class pass extends Application{

    @Override
    public void start(Stage arg0) throws Exception {
       Text text = new Text();
       PasswordField passwordField = new PasswordField();

       Button bt = new Button("Print Password");
       bt.setStyle("-fx-background-color: blue; -fx-text-fill: black; -fx-font-weight: bold;");
       bt.setOnAction(new EventHandler<ActionEvent>() {

        @Override
        public void handle(ActionEvent arg0) {
           text.setText("Password: " + passwordField.getText());
        }
        
       });

       VBox vb = new VBox(10, passwordField, bt, text);
       vb.setAlignment(javafx.geometry.Pos.CENTER);
       vb.setPadding(new Insets(50, 50, 50, 50));
       vb.setStyle("-fx-background-color: yellow");
       Scene scene = new Scene(vb, 400, 200);
       arg0.setTitle("Password Field Example");
       arg0.setScene(scene);
       arg0.show();
    }
    
}
