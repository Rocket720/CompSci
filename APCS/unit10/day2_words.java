package unit10;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class day2_words extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();
        Scene s = new Scene(pane, 800, 800);

        int radius = 100, index = 0;
        String phrase = "this program is bad";

        double iterator = (360.0 / phrase.length());
        iterator = ((int) (iterator) + 1);
//        while (iterator != (int) iterator){
//            phrase += " ";
//            iterator = (360 / phrase.length());
//        }
        System.out.println(phrase.length() + " " + iterator);

        for (int i = 0; i < 360; i += iterator) {
            int x = (int) (400 + radius * Math.cos(Math.toRadians(i))), y = (int) (400 + radius * Math.sin(Math.toRadians(i)));
            Text t = new Text(x, y, Character.toString(phrase.charAt(index)));
            t.setRotate(i + 90);
            pane.getChildren().add(t);
            index++;
        }

        //Window Setup
        primaryStage.setScene(s);
        primaryStage.setTitle("Don't Dead Open Inside");
        primaryStage.show();
    }
}
