package dev.weirdcat.jpackage;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Hello  extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        VBox root = new VBox();
        Button button = new Button("Hello");
        Label answer = new Label();
        button.addEventHandler(MouseEvent.MOUSE_CLICKED,event -> answer.setText("Yeah"));
        root.getChildren().addAll(button,answer);
        Scene scene = new Scene(root,200,200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
