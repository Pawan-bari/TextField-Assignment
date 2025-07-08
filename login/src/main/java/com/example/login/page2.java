package com.example.login;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class page2 {
    Scene p2scene;
    Stage p2stage;

    public void setP2scene(Scene scene) {
        this.p2scene = scene;
    }
    public void setP2stage(Stage stage) {
        this.p2stage = stage;
    }

    public VBox p2vbox(Runnable back){
        Text text = new Text("Welcome to Page 2");
        Button backButton = new Button("Back to Page 1");
        backButton.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent arg0) {
                back.run();
            }
            
        });
        VBox vbox = new VBox(text, backButton);
        vbox.setSpacing(20);
        vbox.setStyle("-fx-background-color: lightblue; -fx-padding: 20; -fx-alignment: center;");
        return vbox;

    }


}
