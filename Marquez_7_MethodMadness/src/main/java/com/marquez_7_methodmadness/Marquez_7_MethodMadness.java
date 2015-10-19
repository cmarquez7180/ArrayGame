package com.marquez_7_methodmadness;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;
import javafx.stage.Stage;

public class Marquez_7_MethodMadness extends Application {

    public static void main(String[] args) {
        launch(args);
    }
    

    @Override
    
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Drawing Operations Test");
        Group root = new Group();
        Canvas canvas = new Canvas(300, 300);

        GraphicsContext gc = canvas.getGraphicsContext2D();
        //drawSomeShape(gc,47,52,84);
        drawLotsOfCircles(gc, 900);
        drawLotsOfRect(gc, 50);
        drawLotsOfOvals(gc,900);
        
        root.getChildren().add(canvas);
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
    

    private void drawSomeShape(GraphicsContext gc, int x, int y, int d) {
        gc.setFill(Color.AQUA);
        gc.fillOval(x, y, d, d);
    }

    private void drawLotsOfCircles(GraphicsContext gc, int num) {
        for (int i = 0; i < 300; i++) {

                   
                        if (i % 55 == 0) {
                            gc.setFill(Color.AQUA);
                            gc.fillOval(225, 200, 50, 50);
                        } else {
                            
                                if (i % 22 == 0) {
                                    gc.setFill(Color.HOTPINK);
                                    gc.fillOval(175, 150, 50, 50);
                                    }else{
                                    
                                        if ( isDivisiblebythree(i)) {
                                            gc.setFill(Color.FUCHSIA);
                                            gc.fillOval(125, 100, 50, 50);
                                        }else{
                                            
                                                if (isARect(i)) {
                                                    gc.setFill(Color.YELLOW);
                                                    gc.fillOval(75, 50, 50, 50);
                                                    }else{
                                                if (isARect2(i)) {
                                                    gc.setFill(Color.AQUAMARINE);
                                                    gc.fillOval(50, 25, 50, 50);
                                                    }else{
                                                if (isARect3(i)) {
                                                    gc.setFill(Color.CORNFLOWERBLUE);
                                                    gc.fillOval(25, 0, 50, 50);
                                                    }else{
                                                
                                                
                                                
                                                

                                

                            
                        
                    }
                }
            }
        }
    }
            }
        }
    }
        private void drawLotsOfOvals(GraphicsContext gc, int num) {
        for (int i = 0; i < 1000; i++) {
               
                    
                        if (i % 55 == 0) {
                            gc.setFill(Color.AQUA);
                            gc.fillOval(225, 250, 50, 50);
                        } else {
                            
                                if (i % 22 == 0) {
                                    gc.setFill(Color.HOTPINK);
                                    gc.fillOval(175, 200, 50, 50);
                                    }else{
                                    
                                        if ( isDivisiblebythree(i)) {
                                            gc.setFill(Color.FUCHSIA);
                                            gc.fillOval(125, 150, 50, 50);
                                        }else{
                                            
                                                if (isARect(i)) {
                                                    gc.setFill(Color.YELLOW);
                                                    gc.fillOval(75, 100, 50, 50);
                                                    }else{
                                                if (isARect2(i)) {
                                                    gc.setFill(Color.AQUAMARINE);
                                                    gc.fillOval(50, 75, 50, 50);
                                                    }else{
                                                if (isARect3(i)) {
                                                    gc.setFill(Color.CORNFLOWERBLUE);
                                                    gc.fillOval(25, 50, 50, 50);
                                                    }else{
                                               
                                                
                                                
                                                

                                

                            
                        
                    }
                }
            }
        }
    }
            }
        }
    }
private void drawLotsOfRect(GraphicsContext gc, int num) {
        for (int i = 0; i < 1000; i++) {
                
                    
                        if (i % 55 == 0) {
                            gc.setFill(Color.AQUA);
                            gc.fillRect(225, 225, 50, 50);
                        } else {
                            
                                if (i % 22 == 0) {
                                    gc.setFill(Color.HOTPINK);
                                    gc.fillRect(175, 175, 50, 50);
                                } else {
                                    
                                        if ( isDivisiblebythree(i)) {
                                            gc.setFill(Color.FUCHSIA);
                                            gc.fillRect(125, 125, 50, 50);
                                        }else{
                                           
                                                if (isARect(i)) {
                                                    gc.setFill(Color.YELLOW);
                                                    gc.fillRect(75, 75, 50, 50);
                                                    }else{
                                                if (isARect2(i)) {
                                                    gc.setFill(Color.AQUAMARINE);
                                                    gc.fillRect(50, 50, 50, 50);
                                                    }else{
                                                if (isARect3(i)) {
                                                    gc.setFill(Color.CORNFLOWERBLUE);
                                                    gc.fillRect(25, 25, 50, 50);
                                                    }else{
                                                
                                                
                                                
                                                
                                    
                               
                            

                        }
                            }
                        }
                    }
                }
            } 
        }
    }

    
    static boolean isDivisiblebyfive(int i) {
        return (i % 5 == 0);
    }

    static boolean isDivisiblebythree(int i) {
        return (i % 3 == 0);
    }
    static boolean isDivisiblebytwo(int i) {
        return (i % 2 == 0);
    }
    static boolean isARect(int i){
        return (i % 7 == 0);
    }
    static boolean isARect2(int i){
        return (i % 9 == 0);
    }
    static boolean isARect3(int i){
        return (i % 11 == 0);
    }
    static boolean isARect4(int i){
        return (i % 13 == 0);
    }

}
