package unit10;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class day3_chess extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();

        //Background
        Rectangle bg = new Rectangle(0, 0, 800, 800);
        bg.setFill(Color.web("#575757"));
        pane.getChildren().add(bg);
        Rectangle rim = new Rectangle(80, 80, 640, 640);
        rim.setFill(Color.BLACK);
        pane.getChildren().add(rim);

        //Board
        boolean color = true;
        int tile = 75;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                Rectangle r = new Rectangle(tile * i + 100, tile * j + 100, tile, tile);
                if (color) {
                    r.setFill(Color.CORNSILK);
                } else {
                    r.setFill(Color.SADDLEBROWN);
                }
                pane.getChildren().add(r);
                color = !color;
            }
            color = !color;
        }

        //Window Setup
        Scene scene = new Scene(pane, 800, 800);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Polygons");
        primaryStage.show();
    }
}
