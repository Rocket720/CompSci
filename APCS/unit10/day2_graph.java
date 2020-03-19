package unit10;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;


public class
day2_graph extends Application {

    public double a = 0.125, b = 0, c = -8;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();

        //Gridlines
        for (int i = 0; i < 800; i += 20) {
            //X Lines
            Line gridLine = new Line(0 + i, 0, 0 + i, 800);
            gridLine.setStroke(Color.web("#f0f0f0"));
            pane.getChildren().add(gridLine);

            //Y Lines
            gridLine = new Line(0, 0 + i, 800, 0 + i);
            gridLine.setStroke(Color.web("#f0f0f0"));
            pane.getChildren().add(gridLine);
        }

        //Axis Lines
        {
            Line yAxis = new Line(400, 0, 400, 800);
            Line xAxis = new Line(0, 400, 800, 400);
            pane.getChildren().add(xAxis);
            pane.getChildren().add(yAxis);
        }

        //Graphed Derivative Line

//        Line graph = new Line( 0, fTan(0, 3, 2), 800, fTan(800, 3, 2));
//        pane.getChildren().add(graph);

        //Graphed Curve
        for (double i = -45; i < 45; i += 0.5) {
            double m = fDeriv(i), b1 = f(i) - m * i;
            //System.out.println("i: " + i + " f(i): " + f(i) + " m: " + m + " b:" + b1 + " fT(0): " + fTan(0, m, b) + " fT(800): " + fTan(800, m, b));
            Line tangent = new Line(0, fTan(0, m, b1), 800, fTan(800, m, b1));
            tangent.setStroke(Color.color(Math.random(), Math.random(), Math.random()));
            pane.getChildren().add(tangent);
        }

        //Window Setup
        Scene s = new Scene(pane, 800, 800);
        primaryStage.setScene(s);
        primaryStage.setTitle("Graphing");
        primaryStage.show();
    }

    /*
    Input: x and b must be real x values
    Output: y position in pixels
     */
    int fTan(double x, double m, double b) {
        x -= 400;
        return 400 - (int) (m * x + (20 * b));
    }

    double f(double x) {
        //x-=400;
        return (a * Math.pow(x, 2) + b * x + (c));
    }

    double fDeriv(double x) {
        //x-=400;
        return (2 * a * x + b);
    }
}
