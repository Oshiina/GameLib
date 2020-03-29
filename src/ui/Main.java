package ui;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONObject;

import games.Game;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {

	@Override
	public void start(Stage stage) {

		BorderPane root = new BorderPane();
		Scene scene = new Scene(root);
		
		Group gr = new Group();
		root.setCenter(gr);

		VBox vb = new VBox();
		Text txt = new Text(10,40,"Create a new or open an existing one");
		txt.setFont(new Font(40));
		HBox hb = new HBox();
		Button b1 = new Button("New");
		Button b2 = new Button("Open");
		
		vb.getChildren().addAll(txt,hb);
		hb.getChildren().addAll(b1,b2);
		gr.getChildren().addAll(vb);
		

		MenuBar menuBar = new MenuBar();
		root.setTop(menuBar);
		Menu fileMenu = new Menu("File");
		menuBar.getMenus().addAll(fileMenu);

		MenuItem newItem = new MenuItem("New");
		MenuItem openItem = new MenuItem("Open");
		
		EventHandler<ActionEvent> eventOpen = new EventHandler<ActionEvent>() { 
            public void handle(ActionEvent e) 
            { 
               System.out.println("cc");
            } 
        }; 
        
        b2.setOnAction(eventOpen);
        openItem.setOnAction(eventOpen);

		fileMenu.getItems().addAll(newItem, openItem);

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