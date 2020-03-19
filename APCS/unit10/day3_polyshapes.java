package unit10;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

public class day3_polyshapes extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        StackPane pane = new StackPane();

        int sides = 50, radius = 350;
        Polygon p = new Polygon();
        for (int i = 0; i < sides; i++) {
            double x = 400 + (radius * Math.cos(Math.toRadians(i * 360 / sides + 180 / sides)));
            double y = 400 + (radius * Math.sin(Math.toRadians(i * 360 / sides + 180 / sides)));
            p.getPoints().add(x);
            p.getPoints().add(y);
            //System.out.println(x + " " + y);
        }
        p.setStroke(Color.BLACK);
        p.setFill(Color.DARKRED);
        pane.getChildren().add(p);

        Text stop = new Text(400, 400, "stop");
        stop.setFont(Font.font("Lato", 150));
        stop.setFill(Color.WHITE);
        stop.setTextAlignment(TextAlignment.CENTER);
        pane.getChildren().add(stop);
        pane.setAlignment(Pos.CENTER);

        //Window Setup
        Scene scene = new Scene(pane, 800, 800);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Polygons");
        primaryStage.show();
    }
}
