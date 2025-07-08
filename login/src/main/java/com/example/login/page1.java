package com.example.login;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class page1 extends Application{
Scene page1Scene, page2Scene;
            Stage PrimaryStage;
    @Override
    public void start(Stage arg0) throws Exception {
            
        Text text = new Text("Welcome to Page 1");
        text.setStyle("-fx-font-size: 24px; -fx-fill: black;"); 
        Button nextButton = new Button("Go to Page 2");
        nextButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                initializePage2();
                PrimaryStage.setScene(page2Scene);
            }
        });

        VBox vb = new VBox(50, text, nextButton);
        vb.setAlignment(javafx.geometry.Pos.CENTER);
        Scene sc = new Scene(vb, 1280, 720);
        page1Scene = sc; 
        arg0.setTitle("Page 1");
        arg0.setScene(sc);
        PrimaryStage = arg0;
        arg0.show();
    }
    private void initializePage2(){
        page2 page2 = new page2();
                page2.setP2stage(PrimaryStage);
        page2Scene = new Scene(page2.p2vbox(this::handleBack), 1280, 720);
        page2.setP2scene(page2Scene);

    }
    private void handleBack(){
        PrimaryStage.setScene(page1Scene);
    }

}


