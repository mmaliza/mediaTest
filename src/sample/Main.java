package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.media.*;

import javax.swing.*;
import java.awt.*;

public class Main extends Application {

    @Override
    public void start(Stage s) throws Exception{
        MediaPlayer player = new MediaPlayer( new Media("test.mp3"));
        MediaView mediaView = new MediaView(player);
        Group root = new Group(mediaView);
        Scene scene = new Scene(root, 500, 500);
        s.setScene(scene);
        s.show();
        player.play();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
