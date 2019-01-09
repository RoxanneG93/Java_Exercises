// Student: Roxanne Garcia
// my attempt at Exercise 14.6 Checkerboard 
// Did reference book provided solution
package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Main extends Application {
	@Override 
	  public void start(Stage primaryStage) {  
		
//		setting width and height of pane
	    double width = 400;
	    double height = 400;
	    
	    Pane pane = new Pane();
	    
//	    loop through blocks and create rectangle 10 X 10
	    for (int i = 0; i < 10; i++) { 
	      boolean isWhite = i % 2 == 0;

	      for (int j = 0; j < 10; j++) {
	        Rectangle rectangle = new Rectangle(i * width / 10, 
	          j * height / 10, width / 10, height / 10);
	        
	        rectangle.setStroke(Color.BLACK);
	        
	        if (isWhite) {
	          rectangle.setFill(Color.WHITE);
	        }
	        else {
	          rectangle.setFill(Color.BLACK);          
	        }
	        
//	        toggle white boolean each loop
	        isWhite = !isWhite;
	        
	        pane.getChildren().add(rectangle);
	      }
	    }

	        
	    // Create a scene and place it in the stage
	    Scene scene = new Scene(pane, width, height);
	    primaryStage.setTitle("Checkerboard"); 
	    primaryStage.setScene(scene); 
	    primaryStage.show();
	  }

	  public static void main(String[] args) {
	    launch(args);
	  }
}
