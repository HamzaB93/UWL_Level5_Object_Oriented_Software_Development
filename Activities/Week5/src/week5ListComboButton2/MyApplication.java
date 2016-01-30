package week5ListComboButton2;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.SelectionMode;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class MyApplication extends Application {
	
	// Declaring paneWidth and height values
	private double paneWidth = 480;
	private double paneHeight = 250;
	
	// Making a new label 
	private Label label = new Label("No items selected");
	
	// Constructing a combo box 
	private ComboBox<String> cboSelectionMode = new ComboBox<>();
	
	// Constructing a new listView
	private ListView<String> lv = new ListView();

	// Override the start method in the Application class
	@Override 
	public void start(Stage primaryStage) {
		
		// Creating a borderpane
		BorderPane pane = new BorderPane();

		// Adding strings to the list view
		lv.getItems().addAll("China", "Japan", "Korea", "India",
				"Malaysia", "Vitnam");

		// Adding options to the combo box
		cboSelectionMode.getItems().addAll("SINGLE", "MULTIPLE");
		// Setting a default value for the combobox
		cboSelectionMode.setValue("SINGLE");

		// Creating a horizontal box
		HBox hBox = new HBox(10);
		// Adding a string label and the combobox
		hBox.getChildren().addAll(new Label("Choose Selection Mode:"),
				cboSelectionMode);
		// Set their position
		hBox.setAlignment(Pos.CENTER);
		// Put the hbox at the top of the pane
		pane.setTop(hBox);
		// Put the listview in the centre of the pane
		pane.setCenter(new ScrollPane(lv));
		// Put the label at the bottom of the pane
		pane.setBottom(label);
		
		// Create a scene and place it in the stage
		Scene scene = new Scene(pane, paneWidth, paneHeight);
		// Set the stage title
		primaryStage.setTitle("Exercise16_16"); 
		// Place the scene in the stage
		primaryStage.setScene(scene); 
		// Display the stage
		primaryStage.show();
		
		// Set what should happen in the combo box
		cboSelectionMode.setOnAction(e -> {
			// If the value Single is selected
			if (cboSelectionMode.getValue().equals("SINGLE")) {
				// Set a selection mode of single 
				lv.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
			}
			else {
				// Otherwise set it to multiple selection mode
				lv.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
			}
		});

		// Making a listener in the list view when a selction is made
		lv.getSelectionModel().selectedItemProperty().addListener(ov ->
		{
			// items is a string which is empty
			String items = "";
			for (String s: lv.getSelectionModel().getSelectedItems()) {
				items += s + " ";
			}
			// When something is selected, set text to that item
			label.setText("Selected items are " + items);
		});
	}
	/**
	 * The main method is only needed for the IDE with limited
	 * JavaFX support. Not needed for running from the command line.
	 */
	public static void main(String[] args) {
		// launch 
		launch(args);
	}
}
