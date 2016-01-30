package week5MilesToKilometers;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class MyApplication extends Application {
	private double paneWidth = 250;
	private double paneHeight = 60;
	
	// Override the start method in the Application class
	@Override 
	public void start(Stage primaryStage) {
		
		// Making text fields for Mile and Kilometer
		TextField tfMile = new TextField();
		TextField tfKilometer = new TextField();
		
		// Setting the alignements for the text fields
		tfMile.setAlignment(Pos.BOTTOM_RIGHT);
		tfKilometer.setAlignment(Pos.BOTTOM_RIGHT);
		
		// Making a new gridpane
		GridPane pane = new GridPane();
		// Setting the alignement for the pane
		pane.setAlignment(Pos.CENTER);
		
		// Adding and making a new label called mile to column 0 row 0
		pane.add(new Label("Mile"), 0, 0);
		// Adding the mile text field next to the label
		pane.add(tfMile, 1, 0);
		// Adding a new label called kilometer to the pane column 0 row 1
		pane.add(new Label("Kilometer"), 0, 1);
		// Adding the text field for kilometer next to the label at column 1 row 1
		pane.add(tfKilometer, 1, 1);
		
		// Create a scene and place it in the stage
		Scene scene = new Scene(pane, paneWidth, paneHeight);
		// Set the stage title
		primaryStage.setTitle("Exercise16_04"); 
		// Place the scene in the stage
		primaryStage.setScene(scene); 
		// Display the stage
		primaryStage.show(); 
		
		// Setting an action for the mile text field with lambda expression
		tfMile.setOnAction(e -> {
			// Have a double value called mile
			double mile = new
					// Making anew Double value, get the value from the textbox and converting the value to double
					Double(tfMile.getText().trim()).doubleValue();
			// Kilometer will be the mile/ 0,6241
			double kilometer = mile / 0.6241;
			// Set the text of kilometer text field to the kilometer value
			tfKilometer.setText(new Double(kilometer).toString());
		});
		
		// The same as when mile textfield action
		tfKilometer.setOnAction(e -> {
			double kilometer = new
					Double(tfKilometer.getText().trim()).doubleValue();
			double mile = 0.6241 * kilometer;
			tfMile.setText(new Double(mile).toString());
		});
	}
	/**
	 * The main method is only needed for the IDE with limited
	 * JavaFX support. Not needed for running from the command line.
	 */
	public static void main(String[] args) {
		launch(args);
	}
}