package tictactoe;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Game extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("tictactoe.fxml"));

        Scene scene = new Scene(root);
        stage.setTitle("Tic Tac Toe");
        stage.setScene(scene);
        stage.show();
    }
    
}
