package teastorm;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.stage.Stage;

import static java.lang.System.nanoTime;


public class Main extends Application {
    private final static int n = 96;
    private final static int m = 10;
    private final static int w = n * m;
    private final static int h = n * m;
    private final static int u = Math.min(w, h) / n;

    @Override
    public void start(Stage primaryStage) {
        final long t0 = nanoTime();

        Canvas c = new Canvas(w, h);
        Scene s = new Scene(new Group(c));

        AnimationLoop loop = new AnimationLoop(c, t0, n, u, m);
        loop.start();

        primaryStage.setTitle("Ray Marching");
        primaryStage.setScene(s);
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }

}
