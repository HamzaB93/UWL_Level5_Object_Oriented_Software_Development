package week5LabelWithGraphic;

import javax.swing.plaf.synth.SynthSeparatorUI;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;

public class ButtonDemo extends Application
{
	// New text object
	protected Text text = new Text(50, 50, "JavaFX Programming");
	
	protected BorderPane getPane()
	{
		// Making a new HBox
		HBox paneForButtons = new HBox(20);
		
		// Making new buttons
		Button btLeft = new Button("Left");
		Button btRight = new Button("Right");
		
		// Putting the buttons in the pane
		paneForButtons.getChildren().addAll(btLeft, btRight);
		// Setting the pane position and style
		paneForButtons.setAlignment(Pos.CENTER);
		// Setting a style for the pane
		paneForButtons.setStyle("-fx-border-color: green");
		
		// BorderPane lays out children in left, right, centre, top and bottom positions
		BorderPane pane = new BorderPane();
		// Set the paneoForButtons to the bottom
		pane.setBottom(paneForButtons);
		
		// Pane for the text
		Pane paneForText = new Pane();
		// Add the text to the paneForText
		paneForText.getChildren().add(text);
		// Set the property
		pane.setCenter(paneForText);
		
		// Creating an event Handler to respond to the click action
		// When the left button is pressed
		btLeft.setOnAction(new EventHandler<ActionEvent>()
		{
			@Override
			public void handle(ActionEvent event)
			{
				text.setX(text.getX() - 10);
			}
		});
		
		
		// Alternative, using java 8 lambda expression
		btRight.setOnAction(e -> text.setX(text.getX() + 10));
		
		return pane;
	}
	
	// Override the start method in the Application class
	public void start(Stage primaryStage)
	{
		// Creating a scene and place it in the stage
		// Scene will allow us to see the buttons etc
		Scene scene = new Scene(getPane(), 450, 200);
		
		// Putting the scene in the stage
		// Setting the title of the stage
		primaryStage.setTitle("ButtonDemo");
		// Getting the scene 
		primaryStage.setScene(scene);
		// Show it
		primaryStage.show();
	}
	
	public static void main(String[] args) 
	{
		launch(args);
	}

}
