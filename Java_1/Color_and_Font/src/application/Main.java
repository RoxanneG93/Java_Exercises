// Student: Roxanne Garcia
// my attempt at Chapter 14 Exercise 4 color and font 
// Did reference book solution
package application;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;


public class Main extends Application {
	  @Override
	  public void start(Stage primaryStage) {
		  
	    HBox pane = new HBox();
	    
	    pane.setAlignment(Pos.CENTER);
	    
//	    setting font
	    Font font = Font.font("Times New Roman", FontWeight.BOLD, 
	        FontPosture.ITALIC, 22);

//	    loop through created text and fill with random colors
	    for (int i = 0; i < 5; i++) {
	      Text word = new Text("Java");
	      word.setRotate(90);
	      word.setFont(font);
	      word.setFill(new Color(Math.random(), Math.random(), Math.random(), Math.random()));
	      pane.getChildren().add(word);
	    }
	        
	    // Create a scene and place it in the stage
	    Scene scene = new Scene(pane, 300, 200);
	    primaryStage.setTitle("Color And Font"); // Set the stage title
	    primaryStage.setScene(scene); // Place the scene in the stage
	    primaryStage.show(); // Display the stage
	  }

	  public static void main(String[] args) {
	    launch(args);
	  }
}
