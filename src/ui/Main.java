package ui;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONObject;

import games.Game;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

	@Override
	public void start(Stage stage) {

		StartWindow root = new StartWindow();
		Scene scene = new Scene(root);
		
		stage.setTitle("GamesLib");
		stage.setScene(scene);
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