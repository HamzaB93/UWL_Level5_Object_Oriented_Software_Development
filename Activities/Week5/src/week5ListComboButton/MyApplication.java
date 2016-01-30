package week5ListComboButton;

import java.util.ArrayList;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class MyApplication extends Application{
	
	// Override parent class
	@Override
	public void start(Stage primaryStage) throws Exception {

		// Making a new grid layout
		GridPane grid = new GridPane();
		// Setting the alignment for the contents in the grid
		grid.setAlignment(Pos.BASELINE_CENTER);
		// Setting the vertical and horizontal space for the elements
		grid.setHgap(10);
		grid.setVgap(10);
		// Setting the padding between the elements
		grid.setPadding(new Insets(25, 25, 25, 25));
		
		// Making a title for the GUI
		Text scenetitle = new Text("Welcome");
		// Setting up the font for the welcome text
		scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
		// Adding it to the grid 
		grid.add(scenetitle, 0, 0, 2, 1);
		
		// Label for text entry called user name
		Label userName = new Label("User Name:");
		// Adding it to the grid in first column, second row
		grid.add(userName, 0, 1);
		
		// Make a textfield for the user name entry
		TextField userTextField = new TextField();
		// Add it to colum 2 row 2
		grid.add(userTextField, 1, 1);
		
		// New label for password
		Label pw = new Label("Password:");
		// Add it to the grid, colum 1 row 3
		grid.add(pw, 0, 2);
		
		// Make a password field
		PasswordField pwBox = new PasswordField();
		// Add it to the grid coulmn 2 row 3
		grid.add(pwBox, 1, 2);

		// Making a new button
		Button btn = new Button("Sign in");
		// Making a horizontal box to tak up space
		HBox hbBtn = new HBox(10);
		// Hbox will aligned to the bottom right
		hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
		// Add a child which is the button
		hbBtn.getChildren().add(btn);
		// Add the grid
		grid.add(hbBtn, 1, 3);

		// Action when the buttom is pressed to show text
		final Text actiontarget = new Text();
		// Position that text
		grid.add(actiontarget, 1, 4);
		// When the button is pressed make a new handler
		btn.setOnAction(new EventHandler<ActionEvent>(){
			@Override
			public void handle(ActionEvent event) {
				// Make the action target text colour FIREBRICK
				actiontarget.setFill(Color.FIREBRICK);
				// Set what the text should be
				actiontarget.setText("Sign in button pressed");
			}});

		// Make a list view that contains strings
		ListView<String> listView = new ListView<>();
		// Set the width and height
		listView.setPrefWidth(400);
		listView.setPrefHeight(400);
		// Add it to the grid
		grid.add(listView, 1, 5);

		// Make a new arrayList of strings called flags
		ArrayList<String> flags = new ArrayList<String> ();
		// Adding the strings to the flags arrayList, automatically scroll
		flags.add("England");
		flags.add("Canada");
		flags.add("USA");
		flags.add("Japan");
		flags.add("England");
		flags.add("Canada");
		flags.add("USA");
		flags.add("Japan");
		flags.add("England");
		flags.add("Canada");
		flags.add("USA");
		flags.add("Japan");
		// Adding the flags to the list view
		listView.getItems().addAll(flags);
		// Allows a flag to be selected?
		listView.getSelectionModel().select(0);

		// Make a combo box, like a dropdown
		ComboBox<String> cbo = new ComboBox<>();
		// Making a string array of flag titles
		String[] flagTitles = {"Canada", "China", "Denmark",
				"France", "Germany", "India", "Norway", "United Kingdom",
		"United States of America"};
		
		// Adding the flag titles to the combo box
		cbo.getItems().addAll(flagTitles);
		// Set a default value to for the dropbox
		cbo.setValue("Denmark");
		// Add to the grid
		grid.add(cbo, 1, 6);

		// Make a scene
		Scene scene = new Scene(grid, 600, 500);
		// Title of the scene
		primaryStage.setTitle("My Application"); // Set the stage title
		// Setting scene to the stage
		primaryStage.setScene(scene);
		// Display the stage
		primaryStage.show(); 
	}
	
	public static void main(String[] args) {
		try{
			// Launch the application GUI
			launch(args);
		}catch(Exception ex){
			// Show an exception if it didnt work
			ex.printStackTrace();
		}
	}
}