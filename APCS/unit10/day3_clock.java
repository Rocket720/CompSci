package unit10;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class day3_clock extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();

        //Set Time
        double s = 59, m = 55 + s / 60, h = 11 + m / 60;

        //Clock Face
        Circle clock = new Circle(400, 400, 350);
        clock.setFill(Color.TRANSPARENT);
        clock.setStroke(Color.BLACK);
        pane.getChildren().add(clock);

        //Times
        for (int i = 30; i < 390; i += 30) {
            int x = (int) (400 + 325 * Math.cos(Math.toRadians(i - 90))) - 5, y = (int) (400 + 325 * Math.sin(Math.toRadians(i - 90))) + 5;
            Text num = new Text(x, y, "" + (i / 30));
            pane.getChildren().add(num);
        }

        //Second Hand
        int x = (int) (300 * Math.cos(Math.toRadians(360.0 * (s / 60.0) - 90.0))),
                y = (int) (300 * Math.sin(Math.toRadians(360.0 * (s / 60.0) - 90.0)));
        Line second = new Line(400, 400, 400 + x, 400 + y);
        second.setStroke(Color.RED);
        pane.getChildren().add(second);

        //Minute Hand
        x = (int) (300 * Math.cos(Math.toRadians(360.0 * (m / 60.0) - 90.0)));
        y = (int) (300 * Math.sin(Math.toRadians(360.0 * (m / 60.0) - 90.0)));
        Line minute = new Line(400, 400, 400 + x, 400 + y);
        minute.setStroke(Color.BLACK);
        pane.getChildren().add(minute);

        //Hour Hand
        x = (int) (200 * Math.cos(Math.toRadians(360.0 * (h / 12.0) - 90.0)));
        y = (int) (200 * Math.sin(Math.toRadians(360.0 * (h / 12.0) - 90.0)));
        Line hour = new Line(400, 400, 400 + x, 400 + y);
        minute.setStroke(Color.BLACK);
        pane.getChildren().add(hour);

        //Window Setup
        Scene scene = new Scene(pane, 800, 800);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Clock");
        primaryStage.show();
    }
}
