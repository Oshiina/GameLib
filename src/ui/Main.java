package ui;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONObject;

import games.Game;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class Main extends Application {

    @Override public void start(Stage stage) {
        Text text = new Text(10, 40, "Hello World!");
        text.setFont(new Font(40));
        Scene scene = new Scene(new Group(text));

        stage.setTitle("Welcome to JavaFX!"); 
        stage.setScene(scene); 
        stage.sizeToScene(); 
        stage.show(); 
    }

    public static void main(String[] args) {
        Application.launch(args);
        
        Game j = new Game("Pokemon");
		JSONObject gameList = new JSONObject();
		j.addJsonGame(gameList);
		try (FileWriter file = new FileWriter("games.json")) {
			 
            file.write(gameList.toJSONString());
            file.flush();
 
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}