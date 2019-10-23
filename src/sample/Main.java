package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

        @Override
        public void start(Stage stage) throws Exception {

            Parent root = FXMLLoader.load(getClass().getResource("/sample/listview.fxml"));

            Scene scene = new Scene(root);
            //scene.getStylesheets().add("/styles/Styles.css");

            stage.setTitle("CustomList");
            stage.setScene(scene);
            stage.show();
        }


    public static void main(String[] args) {
        launch(args);
    }
}
