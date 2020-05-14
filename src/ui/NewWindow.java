package ui;


import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class NewWindow extends BorderPane{

	
	public NewWindow() {
		super();
		
		Group gr = new Group();
		setCenter(gr);
		
		HBox h = new HBox();
		Text txt = new Text(10, 10, "File Name :");
		TextField tf = new TextField();
		txt.setFont(new Font(24));
		Button b1 = new Button("Enter");

		h.getChildren().addAll(txt,tf,b1);
		gr.getChildren().addAll(h);


	//	b1.setOnAction(eventNew);
	//	b2.setOnAction(eventOpen);

	}
}
