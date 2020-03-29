package ui;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONObject;

import games.Game;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {

	@Override
	public void start(Stage stage) {

		BorderPane root = new BorderPane();
		Scene scene = new Scene(root);
		
		
		Text text = new Text(10, 40, "Hello World!");
		text.setFont(new Font(40));
		root.setCenter(text);
		
		MenuBar menuBar = new MenuBar();
		root.setTop(menuBar);
		Menu fileMenu = new Menu("File");
		menuBar.getMenus().add(fileMenu);
		
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