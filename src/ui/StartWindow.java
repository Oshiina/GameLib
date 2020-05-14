package ui;

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
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class StartWindow extends BorderPane {

	Stage stage;

	public StartWindow(Stage s) {
		super();
		stage = s;

		Group gr = new Group();
		setCenter(gr);

		VBox vb = new VBox();
		Text txt = new Text(10, 40, "Create a new or open an existing one");
		txt.setFont(new Font(40));
		HBox hb = new HBox();
		Button b1 = new Button("New");
		Button b2 = new Button("Open");

		vb.getChildren().addAll(txt, hb);
		hb.getChildren().addAll(b1, b2);
		gr.getChildren().addAll(vb);

		MenuBar menuBar = new MenuBar();
		setTop(menuBar);
		Menu fileMenu = new Menu("File");
		menuBar.getMenus().addAll(fileMenu);

		MenuItem newItem = new MenuItem("New");
		MenuItem openItem = new MenuItem("Open");

		b1.setOnAction(eventNew);
		newItem.setOnAction(eventNew);

		b2.setOnAction(eventOpen);
		openItem.setOnAction(eventOpen);

		fileMenu.getItems().addAll(newItem, openItem);
	}

	EventHandler<ActionEvent> eventNew = new EventHandler<ActionEvent>() {
		public void handle(ActionEvent e) {
			NewWindow nwindow = new NewWindow();
			Scene newScene = new Scene(nwindow,400,100);
			Stage newStage = new Stage();
			newStage.setScene(newScene);
			newStage.show();
		}
	};

	EventHandler<ActionEvent> eventOpen = new EventHandler<ActionEvent>() {
		public void handle(ActionEvent e) {

		}
	};

}
