package unit10;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;

public class day3_pie extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();

        double fraction = 0.875, radius = 350;
        Polygon p = new Polygon();
        p.getPoints().addAll(400.0, 400.0);
        for (double i = -fraction * 180; i < fraction * 180; i++) {
            double x = 400 + (radius * Math.cos(Math.toRadians(i + 90)));
            double y = 400 + (radius * Math.sin(Math.toRadians(i + 90)));
            p.getPoints().add(x);
            p.getPoints().add(y);
        }
        p.setFill(Color.web("#f2d36b"));
        pane.getChildren().add(p);

        //Window Setup
        Scene scene = new Scene(pane, 800, 800);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Polygons");
        primaryStage.show();
    }
}
