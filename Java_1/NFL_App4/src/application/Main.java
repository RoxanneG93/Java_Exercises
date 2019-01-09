// Student Roxanne Garcia
// My Attempt at setting the UI -- Could not get the View to switch to Offense and Defense

package application;

import java.io.FileInputStream;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import java.io.FileInputStream;
import javafx.scene.control.cell.PropertyValueFactory;


public class Main extends Application{
	NFL_Player player;
	@Override
	public void start(Stage primaryStage)  throws Exception {
		
//		Creating the Panes
		HBox hbox = new HBox(30);
		VBox vbox = new VBox(10);
		VBox vbox2 = new VBox(10);
		HBox hbox2 = new HBox(30);
		StackPane stackpane = new StackPane();
		Scene scene = new Scene(hbox);
		
//		======= UI Controls ==========
		
//		===== listview ======
		ListView listView = new ListView();
		listView.getItems().add("Players");
		listView.getItems().add("OffensivePlayer");
		listView.getItems().add("DeffensivePlayer");
		listView.setPrefWidth(100);
		listView.setPrefHeight(75);
		
//		===== ChoiceBox =====
		ChoiceBox choiceBox = new ChoiceBox();
		choiceBox.getItems().add("Search by Last Name");
		choiceBox.getItems().add("Search by Team");
		choiceBox.getItems().add("TEST");
		
//		==== Labels =======
		Label label = new Label("Enter Search Value");
		TextField textField = new TextField();
		
//		===== Logo =======
		FileInputStream input = new FileInputStream("logo2.png");
		Image image = new Image(input);
		ImageView imageView = new ImageView(image);
		
//		===== Buttons ======
		Button btnSearch = new Button("Search");
		Button addOff = new Button("Offense");
		Button addDef = new Button("Defense");
		Button btnRemove = new Button("Delete");
		
	
		
//		===== Tables ========
		TableView <NFL_Player>tbleAllPlayers = new TableView<>();
		
//		**** NEED TO FIND A WAY TO LOOP AND ADD *****
		
		TableColumn colFirstName = new TableColumn("First Name");
		TableColumn colLastName = new TableColumn("Last Name");
		TableColumn colCollegeOf = new TableColumn("College of");
		
		TableView <NFL_Player>tbleOffense = new TableView<>();
		
//		**** NEED TO FIND A WAY TO LOOP AND ADD *****
		
		TableColumn colOffFirstName = new TableColumn("First Name");
		TableColumn colOffLastName = new TableColumn("Last Name");
		TableColumn colOffCollegeOf = new TableColumn("College of");
		
		TableView <NFL_Player>tbleDefense = new TableView<>();
		
//		**** NEED TO FIND A WAY TO LOOP AND ADD *****
		
		TableColumn colDefFirstName = new TableColumn("First Name");
		TableColumn colDefLastName = new TableColumn("Last Name");
		TableColumn colDefCollegeOf = new TableColumn("College of");
		
//		add all player properties to tables
		tbleAllPlayers.getColumns().addAll(colFirstName, colLastName, colCollegeOf);
		tbleOffense.getColumns().addAll(colOffFirstName, colOffLastName, colOffCollegeOf);
		tbleDefense.getColumns().addAll(colDefFirstName, colDefLastName, colDefCollegeOf);
		
//		**** NEED TO FIND A WAY TO LOOP AND ADD *****
		colFirstName.setCellValueFactory(new PropertyValueFactory<NFL_Player, String>("firstName"));
		colLastName.setCellValueFactory(new PropertyValueFactory<NFL_Player, String>("lastName"));
		colCollegeOf.setCellValueFactory(new PropertyValueFactory<NFL_Player, String>("school"));
		
		colOffFirstName.setCellValueFactory(new PropertyValueFactory<NFL_Player, String>("firstName"));
		colOffLastName.setCellValueFactory(new PropertyValueFactory<NFL_Player, String>("lastName"));
		colOffCollegeOf.setCellValueFactory(new PropertyValueFactory<NFL_Player, String>("school"));
		
		colDefFirstName.setCellValueFactory(new PropertyValueFactory<NFL_Player, String>("firstName"));
		colDefLastName.setCellValueFactory(new PropertyValueFactory<NFL_Player, String>("lastName"));
		colDefCollegeOf.setCellValueFactory(new PropertyValueFactory<NFL_Player, String>("school"));
		
//		Add Observable that listens to the NFL_Player_Manager class
		NFL_Player_Manager managePlayers = new NFL_Player_Manager();
		
//		New Player objects
//		NFL_Player player1 = NFL_Player.createNewPlayer("Dak", "Prescott", "Dallas Cowboys", "Quarter Back", "Mississippi State", "3rd Season", 6.2, 235, 25, 4);
//		NFL_Player player2 = NFL_Player.createNewPlayer("Ezekiel", "Elliot", "Dallas Cowboys", "Running Back", "Ohio State", "3rd Season", 6.0, 228, 23, 21);
//		NFL_Player player3 = NFL_Player.createNewPlayer("Sean", "Lee", "Dallas Cowboys", "Line Back", "Penn State", "9th Season", 6.2, 245, 32, 50);
//		NFL_Player player4 = NFL_Player.createNewPlayer("Todd", "Gurley", "Los Angeles Rams", "Running Back", "Georgia", "4th Season", 6.1, 224, 24, 30);
//		NFL_Player player5 = NFL_Player.createNewPlayer("Drew", "Brees", "New Orleans Saints", "Quarter Back", "Purdue", "18th Season", 6.0, 209, 39, 9);
//		NFL_Player player6 = NFL_Player.createNewPlayer("Julio", "Jones", "Atlanta Falcons", "Wide Receiver", "Alabama", "8th Season", 6.3, 220, 29, 11);
		
//		driver to add player
		managePlayers.addNewPlayer();
		
		ObservableList<NFL_Player> playerObj =
//				have to look for array list within this method below
				FXCollections.observableArrayList(managePlayers.getMyPlayers());
				tbleAllPlayers.setItems(playerObj);
				
		
//		Adding all info to panes
		vbox.getChildren().addAll(listView, choiceBox, label, btnSearch, textField, imageView);
		hbox2.getChildren().addAll(addOff, addDef, btnRemove);
//		stackpane.getChildren().addAll(offPlayer, defPlayer, tbleAllPlayers);
		stackpane.getChildren().addAll(tbleAllPlayers);
		vbox2.getChildren().addAll(stackpane, hbox2);
		hbox.getChildren().addAll(vbox, vbox2);
		
		primaryStage.setTitle("NFL App");
		primaryStage.setScene(scene);
		primaryStage.show();
		
//		===== Button METHODS ======
		addOff.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e) {
			
				player = tbleAllPlayers.getSelectionModel().getSelectedItem();
				tbleOffense.getItems().add(player);
				
				System.out.println(player);
				tbleAllPlayers.getSelectionModel().clearSelection();
			}
		});
		
		addDef.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e) {
			
				player = tbleAllPlayers.getSelectionModel().getSelectedItem();
				tbleDefense.getItems().add(player);
				tbleAllPlayers.getSelectionModel().clearSelection();
			}
		});
		
		btnRemove.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e) {
				int index = listView.getSelectionModel().getSelectedIndex();
				if (index == 1) {
					player = tbleOffense.getSelectionModel().getSelectedItem();
					tbleOffense.getItems().remove(player);
				} else if(index == 2) {
					player = tbleDefense.getSelectionModel().getSelectedItem();
					tbleDefense.getItems().remove(player);
				}
			}
		});
		
//		ListView Method
		listView.setOnMouseClicked(new EventHandler<MouseEvent>() {
			public void handle(MouseEvent e) {
				int index = listView.getSelectionModel().getSelectedIndex();
				System.out.println(index);
				if (index == 0) {
					tbleAllPlayers.setVisible(true);
					tbleOffense.setVisible(false);
					tbleDefense.setVisible(false);
				} else if (index == 1) {
					tbleOffense.setVisible(true);
					tbleDefense.setVisible(false);
					tbleAllPlayers.setVisible(false);
				} else if (index == 2) {
					tbleDefense.setVisible(true);
					tbleOffense.setVisible(false);
					tbleAllPlayers.setVisible(false);
				}
			}
		});
	
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
