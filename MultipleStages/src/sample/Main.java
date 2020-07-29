package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        // kreiranje scene i postavljanje dugmeta u nju

       Scene scene = new Scene(new Button("OK"), 200, 200);
        primaryStage.setTitle("My JavaFX Application"); // unos naslova pozornice
        primaryStage.setScene(scene);
        primaryStage.show();

        Stage stage = new Stage(); // kreiranje pozornice
        stage.setTitle("Second stage");// unos naslova pozornice
        // Postavljanje scene sa dugmetom na pozornici
        stage.setScene(new Scene(new Button("New Stage"), 100, 100));
        stage.show();// prikaz pozornice
    }


    public static void main(String[] args) {

       Application.launch(args);    }
}
