package com.example.login;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class changecolor extends Application{

    @Override
    public void start(Stage arg0) throws Exception {
        
        Button bt = new Button("Click Me");
        VBox vBox = new VBox(10, bt);
        vBox.setAlignment(javafx.geometry.Pos.CENTER);
        vBox.setStyle("-fx-background-color: yellow; -fx-padding: 50; -fx-alignment: center;");
        bt.setStyle("-fx-background-color: Green; -fx-font-weight: bold;");
        
        bt.setOnAction(new EventHandler<ActionEvent>() {
            

            @Override
            public void handle(ActionEvent arg0) {
               
              
               vBox.setStyle("-fx-background-color: lightblue; -fx-padding: 50; -fx-alignment: center;");

        }});

        
        Scene scene = new Scene(vBox, 1280, 720);
        scene.setFill(javafx.scene.paint.Color.LIGHTBLUE);
        arg0.setTitle("Change Color");

        arg0.setScene(scene);
        arg0.show();
    }
    
}
