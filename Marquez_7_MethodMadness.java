package com.marquez_7_methodmadness;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Marquez_7_MethodMadness extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override

    public void start(Stage primaryStage) {
        primaryStage.setTitle("Drawing Operations Test");
        Group root = new Group();
        Canvas canvas = new Canvas(835, 500);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        int a = 0;
        int b = 205;
        int c = 500;
        for (int i = 0; i < 1000; i++) {
            if (i == 0) {
                drawShape0(gc, a, b, c);
            } else if (i == 1) {
                drawShape1(gc, a, b, c);
            } else if (i == 2) {
                drawShape2(gc, a, b, c);
            } else if (i == 3) {
                drawShape3(gc, a, b, c);
            } else if (i == 4) {
                drawShape4(gc, a, b, c);
            } else if (i == 5) {
                drawShape5(gc, a, b, c);
            } else if (i == 6) {
                drawShape6(gc, a, b, c);
            } else if (i == 7) {
                drawShape7(gc, a, b, c);
            } else if (i == 8) {
                drawShape8(gc, a, b, c);
            } else if (i == 9) {
                drawShape9(gc, a, b, c);
            }
            a = a + 50;
            b = b + 20;
            c = c - 50;

        }
        root.getChildren().add(canvas);
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    private void drawShape0(GraphicsContext gc, int x, int y, int z) {
        gc.setFill(Color.AQUA);
        gc.fillRect(0, x, y, z);
    }

    private void drawShape1(GraphicsContext gc, int x, int y, int z) {
        gc.setFill(Color.CORNFLOWERBLUE);
        gc.fillRect(50, x, y, z);
    }

    private void drawShape2(GraphicsContext gc, int x, int y, int z) {
        gc.setFill(Color.AQUAMARINE);
        gc.fillRect(100, x, y, z);
    }

    private void drawShape3(GraphicsContext gc, int x, int y, int z) {
        gc.setFill(Color.YELLOW);
        gc.fillRect(150, x, y, z);
    }

    private void drawShape4(GraphicsContext gc, int x, int y, int z) {
        gc.setFill(Color.FUCHSIA);
        gc.fillRect(200, x, y, z);
    }

    private void drawShape5(GraphicsContext gc, int x, int y, int z) {
        gc.setFill(Color.HOTPINK);
        gc.fillRect(250, x, y, z);
    }

    private void drawShape6(GraphicsContext gc, int x, int y, int z) {
        gc.setFill(Color.AQUA);
        gc.fillRect(300, x, y, z);
    }

    private void drawShape7(GraphicsContext gc, int x, int y, int z) {
        gc.setFill(Color.CORNFLOWERBLUE);
        gc.fillRect(350, x, y, z);
    }

    private void drawShape8(GraphicsContext gc, int x, int y, int z) {
        gc.setFill(Color.AQUAMARINE);
        gc.fillRect(400, x, y, z);
    }

    private void drawShape9(GraphicsContext gc, int x, int y, int z) {
        gc.setFill(Color.YELLOW);
        gc.fillRect(450, x, y, z);
    }

}
