package busyPointGui;

import javafx.application.Application;
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

public class BpSystem extends Application
{
	// Designing the GUI here
	@Override
	public void start(Stage primaryStage) throws Exception 
	{
		////////// GRID //////////S
		
		// Setting up the grid
		GridPane grid = new GridPane();
		grid.setHgap(15);
		grid.setVgap(15);
		grid.setAlignment(Pos.CENTER);
		// Show grid lines for testing purposes
		//grid.setGridLinesVisible(true);
		
		// Welcome
		Text welcome = new Text("Welcome To BusyPoint!");
		welcome.setFont(Font.font("Arial", FontWeight.BOLD, 20));
		// Add to grid, c1, r1, span 1 column and 1 row
		grid.add(welcome, 1, 1, 3, 1);
		
		// Introduction
		Text intro = new Text("Here is your chance to join BusyPoint hosting. Become a client today and be"
				+" \nhandled by one of our dedicated staff memebers.");
		intro.setFont(Font.font("Arial", FontWeight.SEMI_BOLD, 14));
		grid.add(intro, 1, 2, 5, 1);
		
		// Clients label and ListView
		Text client = new Text("Our clients:");
		client.setFont(Font.font("Arial", FontWeight.SEMI_BOLD, 14));
		grid.add(client, 1, 3);
		
		ListView<String> clientList = new ListView<>();
		clientList.setPrefWidth(500);
		clientList.setPrefHeight(100);
		// Add it to the grid
		grid.add(clientList, 1, 4);
		
		// Staff label and ListView
		Text staff = new Text("Our dedicated staff:");
		staff.setFont(Font.font("Arial", FontWeight.SEMI_BOLD, 14));
		grid.add(staff, 1, 5);
		ListView<String> staffList = new ListView<>();
		staffList.setPrefWidth(500);
		staffList.setPrefHeight(100);
		// Add it to the grid
		grid.add(staffList, 1, 6);
		
		// Client detail entry
		Text enter = new Text("Enter your details and become a BusyPoint client");
		enter.setFont(Font.font("Arial", FontWeight.SEMI_BOLD, 14));
		grid.add(enter, 1, 7);
		
		// Company name	
		HBox companyNameBox = new HBox();
		companyNameBox.setSpacing(13);
		Label companyName = new Label("Company Name");
		TextField companyNameField = new TextField();
		companyNameField.setPrefWidth(400);;
		companyNameBox.getChildren().addAll(companyName, companyNameField);
		grid.add(companyNameBox, 1, 8);
		
		// Address
		// Building Number
		HBox buildingNumberBox = new HBox();
		buildingNumberBox.setSpacing(9);
		Label buildingNumber = new Label("Building Number");
		TextField buildingNumberField = new TextField();
		buildingNumberField.setPrefWidth(200);;
		buildingNumberBox.getChildren().addAll(buildingNumber, buildingNumberField);
		grid.add(buildingNumberBox, 1, 9);
		
		// Building Name
		HBox buildingNameBox = new HBox();
		buildingNameBox.setSpacing(22);
		Label buildingName = new Label("Building Name");
		TextField buildingNameField = new TextField();
		buildingNameField.setPrefWidth(400);;
		buildingNameBox.getChildren().addAll(buildingName, buildingNameField);
		grid.add(buildingNameBox, 1, 10);
		
		// Building Post Code
		HBox buildingPostCodeBox = new HBox();
		buildingPostCodeBox.setSpacing(51);
		Label buildingPostCode = new Label("Post Code");
		TextField buildingPostCodeField = new TextField();
		buildingPostCodeField.setPrefWidth(200);;
		buildingPostCodeBox.getChildren().addAll(buildingPostCode, buildingPostCodeField);
		grid.add(buildingPostCodeBox, 1, 11);
		
		// Email 
		HBox emailBox = new HBox();
		emailBox.setSpacing(80);
		Label email = new Label ("Email");
		TextField emailField = new TextField();
		emailField.setPrefWidth(400);
		emailBox.getChildren().addAll(email, emailField);
		grid.add(emailBox, 1, 12);
		
		
		// Buttons for Client
		HBox buttons = new HBox();
		buttons.setSpacing(50);
		Button save = new Button("Save");
		Button clear = new Button("Clear");
		buttons.setAlignment(Pos.CENTER);
		buttons.getChildren().addAll(save, clear);
		grid.add(buttons, 1, 13);
		
		// Notification for client
		HBox notificationBox = new HBox();
		Text notification = new Text("CLIENT WILL GET NOTIFICATION");
		notification.setFont(Font.font("Arial", FontWeight.SEMI_BOLD, 14));
		notification.setFill(Color.GREEN);
		notificationBox.getChildren().addAll(notification);
		notificationBox.setAlignment(Pos.CENTER);
		grid.add(notificationBox, 1, 14);
		
		
		////////// SCENE //////////
		
		// Making a scene and adding the grid and setting the width and height
		Scene scene = new Scene(grid, 600, 700);
		
		// Adding scene to a stage
		primaryStage.setScene(scene);
		
		// Giving the stage a title
		primaryStage.setTitle("BusyPoint: Record Client Details");
		
		// Show the stage
		primaryStage.show();
	}
	
	// The main method will launch the GUI
	public static void main(String[] args) 
	{
		try 
		{
			launch(args);
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

}
