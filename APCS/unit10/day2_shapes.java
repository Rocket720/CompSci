package unit10;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class day2_shapes extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();
        Scene s = new Scene(pane, 800, 800);

        int pos = 50, rad = 350;
        for (int i = 0; i < 20; i++) {
            Rectangle r = new Rectangle(pos, pos, 2 * rad, 2 * rad);
            r.setFill(Color.TRANSPARENT);
            r.setStroke(Color.RED);
            r.setRotate(i * 15);
            pane.getChildren().add(r);
            Circle c = new Circle(400, 400, rad);
            c.setFill(Color.TRANSPARENT);
            c.setStroke(Color.BLUE);
            pane.getChildren().add(c);
            rad = (int) (Math.sqrt(2) * rad / 2);
            pos = (800 - (2 * rad)) / 2;
        }

        //Window Setup
        primaryStage.setScene(s);
        primaryStage.setTitle("Shapes");
        primaryStage.show();
    }
}
