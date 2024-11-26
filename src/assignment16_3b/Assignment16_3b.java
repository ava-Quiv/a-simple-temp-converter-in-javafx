/*
(Create a Celsius/Fahrenheit converter) Write a program that converts Celsius 
and Fahrenheit, as shown in Figure 16.37b. If you enter a value in the Celsius 
text field and press the Enter key, the corresponding Fahrenheit measurement is 
displayed in the Fahrenheit text field. Likewise, if you enter a value in the 
Fahrenheit text field and press the Enter key, the corresponding Celsius measurement 
is displayed in the Celsius text field.
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package assignment16_3b;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

/**
 *
 * @author areba
 */
public class Assignment16_3b extends Application {
    
    @Override
    public void start(Stage primaryStage) {
     //labels
     
     Label degree = new Label("degrees");
     Label feh = new Label("fehrenhant");
     
     //textfields
     TextField tf1 =new TextField();
      TextField tf2 = new TextField();
     tf1.setOnAction(e -> {
            try {
                double celsius = Double.parseDouble(tf1.getText());
                double fahrenheit = (celsius * 9 / 5) + 32;
                //tf2.setText(String.format("%.2f", fahrenheit));
            } catch (NumberFormatException ex) {
                tf2.setText("Invalid input");
            }
        });
     tf2.setOnAction(e -> {
            try {
                double fahrenheit = Double.parseDouble(tf2.getText());
                double celsius = (fahrenheit - 32) * 5 / 9;
                tf1.setText(String.format("%.2f", celsius));
            } catch (NumberFormatException ex) {
                tf1.setText("Invalid input");
            }
        });
    
     
      //my layouts
      
     HBox h1 = new HBox();
     h1.setSpacing(10);
     h1.getChildren().addAll(degree,tf1);
     
    
     HBox h2  =new HBox();
     h2.getChildren().addAll(feh,tf2);
     
        
        VBox v1= new VBox();
        v1.setSpacing(11);
        v1.getChildren().addAll(h1,h2);
        
        
        Scene scene = new Scene(v1, 300, 250);
        
        primaryStage.setTitle("assignment 16_3b");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
