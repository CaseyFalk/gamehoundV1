package gamehound;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.*;
import java.nio.charset.Charset;

public class Main extends Application {

    public static void main(String[] args) throws IOException {

        //Launch JavaFX.
        launch(args);
    }

    //The start method for JFX. Determines the stage, scene, title, dimensions of the window, etc.
    @Override
    public void start(Stage primaryStage) throws Exception{

        Parent root = FXMLLoader.load(getClass().getResource("menu.fxml"));
        primaryStage.setTitle("Gamehound");
        primaryStage.setScene(new Scene(root, 692.7, 448));
        primaryStage.show();
    }

}
