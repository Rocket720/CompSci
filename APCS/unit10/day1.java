package unit10;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.Scanner;


public class day1 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        Scanner input = new Scanner(System.in);

        Pane pane = new Pane();
        //System.out.println("How many across");
        int ac = 10/*input.nextInt()*/;
        //System.out.println("How many across");
        int dn = 10/*input.nextInt()*/;

        Color[] c = {Color.RED, Color.BLUE, Color.WHITE, Color.MAGENTA, Color.GOLD, Color.GREY, Color.GREEN, Color.PINK};

        int counter = 0;
        for (int i = 0; i < ac; i++) {
            int miss = 0;
            if (Math.random() > 0.5)
                miss = (int) (Math.random() * 10);
            for (int j = 0; j < dn; j++) {


                Circle circle = new Circle();

                if (j == miss) {
                    circle.setStroke(c[(int) (Math.random() * 8)]);
                    circle.setFill(c[(int) (Math.random() * 8)]);
                    counter++;
                }

                circle.setCenterY(40 + i * 50);
                circle.setCenterX(40 + j * 50);
                circle.setRadius(20);

                pane.getChildren().add(circle);//adds circle to pane
            }
        }

        Text diversity = new Text(10, 600, "There are " + counter + " diverse people, and of course you asked me to single them out. WOW you woooouuullddd");
        pane.getChildren().add(diversity);

        Scene scene = new Scene(pane, 900, 900);//creates a scene, 900 pixels by 900 pixels, with pane in it
        primaryStage.setTitle("Testing");//Gives the Stage a title
        primaryStage.setScene(scene);//Places the scene onto the Stage
        primaryStage.show();//Shows the Stage

    }
}
