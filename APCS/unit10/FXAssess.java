package unit10;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class FXAssess extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();

        //Diagonals
        Line l1 = new Line(0, 0, 1000, 1000);
        Line l2 = new Line(0, 1000, 1000, 0);
        pane.getChildren().addAll(l1, l2);

        //Right Quad
        for (double i = 0; i < 360; i += 22.5) {
            Circle c = new Circle(750 + 120 * Math.cos(Math.toRadians(i)), 500 + 120 * Math.sin(Math.toRadians(i)), 20);
            if (Math.random() > 0.5) {
                c.setStroke(Color.TRANSPARENT);
                c.setFill(Color.color(Math.random(), Math.random(), Math.random()));
            } else {
                c.setStroke(Color.color(Math.random(), Math.random(), Math.random()));
                c.setFill(Color.TRANSPARENT);
            }
            pane.getChildren().add(c);
        }

        //Bottom Quad
        for (int i = 0; i < 500; i += 20) {
            Line l = new Line(i, 1000 - i, 1000 - i, 1000 - i);
            pane.getChildren().add(l);
        }

        //Parabola
        Polygon p = new Polygon();
        for (double i = 0; i <= 500; i++) {
            p.getPoints().addAll(i, f(i));
        }
        for (double i = 0; i <= 500; i++) {
            p.getPoints().addAll(f(i), i);
        }
        p.setFill(Color.CORAL);
        pane.getChildren().add(p);

        //Top Quad Text
        Text t = new Text(580, 240, "This part is sooooooooooooooooooooooooooooooooooo easy");
        t.setRotate(315);
        pane.getChildren().add(t);

        //Window Setup
        Scene scene = new Scene(pane, 1000, 1000);
        primaryStage.setScene(scene);
        primaryStage.setTitle("FXAssess");
        primaryStage.show();
    }

    double f(double x) {
        return 0.002 * Math.pow(x, 2);
    }
}
