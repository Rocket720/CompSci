package unit10;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class day2_circle extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();
        Scene s = new Scene(pane, 800, 800);

        int height = 600, width = 600, divisions = 360;
        for (int i = 0; i < 360; i += 360 / divisions) {
            Rectangle r = new Rectangle((s.getWidth() - width) / 2, (s.getHeight() - height) / 2, width, height);
            r.setStroke(Color.color(Math.random(), Math.random(), Math.random()));
            r.setFill(Color.TRANSPARENT);
            r.setRotate(i);
            pane.getChildren().add(r);
        }


        //Window Setup
        primaryStage.setScene(s);
        primaryStage.setTitle("Iris");
        primaryStage.show();
    }
}
