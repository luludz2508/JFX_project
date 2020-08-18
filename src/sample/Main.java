package sample;

import javafx.scene.*;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import org.w3c.dom.Text;

import javax.swing.*;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        /*
        primaryStage.setTitle("Hello World");
        primaryStage.setWidth(420);
        primaryStage.setHeight(300);
//        // Label First
//        Label label= new Label("Hello World");
//        label.setAlignment(Pos.BASELINE_CENTER);
//        Scene scene= new Scene(label);
//        primaryStage.setScene(scene);
//        primaryStage.show();
        // Create a label with image and a text field then put them to an hbox
        ImageView i = new ImageView("file:src/download.jfif");
        i.setFitWidth(220);
        i.setPreserveRatio(true);
        i.setSmooth(true);
        Label label2 = new Label("", i);
        label2.setAlignment(Pos.TOP_RIGHT);
        //
        ImageView ii = new ImageView("file:src/1024px-Flag_of_Vietnam.svg.png");
        ii.setFitWidth(200);
        ii.setPreserveRatio(true);
        ii.setSmooth(true);
        Label label3 = new Label("", ii);
        label3.setAlignment(Pos.BOTTOM_LEFT);
        //
        ImageView iii = new ImageView("1200px-Flag_of_the_United_States.svg.png");
        iii.setFitWidth(220);
        iii.setPreserveRatio(true);
        iii.setSmooth(true);
        Label label4 = new Label("", iii);
        label4.setAlignment(Pos.BOTTOM_RIGHT);
        //
        ImageView iv = new ImageView("file:src/flag-uk.png");
        iv.setFitWidth(200);
        iv.setPreserveRatio(true);
        iv.setSmooth(true);
        Label label = new Label("", iv);
        label.setAlignment(Pos.TOP_LEFT);

        GridPane pane = new GridPane();
        pane.add(label, 1, 1);
        pane.add(label3, 1, 2);
        pane.add(label2,2,1);
        pane.add(label4,2,2);

        Scene scene=new  Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.show();
        */

        // ==================================================================== Traffic Light
        VBox boxOut = new VBox();
        VBox bocIN = new VBox();
        StackPane pane = new StackPane(); //overlays elements
        primaryStage.setTitle("Hello World");
        primaryStage.setWidth(400);
        primaryStage.setHeight(1000);
        Label label = new Label("Traffic Light");
        label.setFont(Font.font("Times New Roman", FontWeight.BOLD, 30));
        label.setTextFill(Paint.valueOf("Red"));

        Circle circle1 = new Circle(200, 200,50);
        circle1.setFill(Paint.valueOf("Red"));
        Circle circle2 = new Circle(200, 200,50);
        circle2.setFill(Paint.valueOf("Grey"));
        Circle circle3 = new Circle(200, 200,50);
        circle3.setFill(Paint.valueOf("Grey"));
        Rectangle rectangle= new Rectangle(130, 600);
        rectangle.setFill(Paint.valueOf("Black"));
        //
        bocIN.getChildren().addAll(circle1,circle2,circle3);
        pane.getChildren().addAll(rectangle,bocIN);
        //


        Scene scene = new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
