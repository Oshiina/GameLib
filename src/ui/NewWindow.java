package ui;

import java.io.FileWriter;
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class NewWindow extends BorderPane {

	TextField tf;
	Stage stage;

	public NewWindow(Stage s) {
		super();
		stage = s;

		Group gr = new Group();
		setCenter(gr);

		HBox h = new HBox();
		Text txt = new Text(10, 10, "File Name :");
		tf = new TextField();
		txt.setFont(new Font(24));
		Button b1 = new Button("Enter");

		h.getChildren().addAll(txt, tf, b1);
		gr.getChildren().addAll(h);

		b1.setOnAction(eventEnter);

	}

	EventHandler<ActionEvent> eventEnter = new EventHandler<ActionEvent>() {
		public void handle(ActionEvent e) {
			String str = tf.getText(); //doit tester si existe déja
			if (str.length() > 0) {
				try {
					FileWriter file = new FileWriter(str + "Games.json");
					MainWindow mwind = new MainWindow(stage, file);

					Scene newScene = new Scene(mwind, 1000, 800);
					stage.setScene(newScene);
					stage.show();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}

		}
	};
}
