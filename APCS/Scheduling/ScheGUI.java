package Scheduling;

import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class ScheGUI extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {


        HBox parent = new HBox();
        Button b = new Button("ok");
        parent.getChildren().add(b);


        primaryStage.setTitle("Die");
        primaryStage.show();
    }
}
