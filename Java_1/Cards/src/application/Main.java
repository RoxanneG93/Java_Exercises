// Student: Roxanne Garcia
// my attempt at Exercise 14.3 Cards 
// out of time...I needed to figure out how to loop through an Image ArrayList
// The program just prints random deck integers and will show specific Card selected
package application;
	
import java.util.ArrayList;
import java.util.Collections;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
	    final int DECK_SIZE = 52;
	    
        ArrayList<Integer> deck = new ArrayList<Integer>();
        
        
        for (int i = 0; i < DECK_SIZE; ++i) {
            deck.add(i);
        }

        Collections.shuffle(deck);

        for (int i = 0; i < 3; ++i) {
        	System.out.println(deck.get(i));
        }
        
        Pane pane = new HBox(100);
        pane.setPadding(new Insets(5,5,5,5));
        
        ArrayList<Image> cards = new ArrayList<Image>();
        
        for(int i = 0; i < 52; ++i) {
        	
        }
        cards.add(new Image("file:png"));
        
        
        Image image = new Image("file:png/41.png");  
        // this will grab the specified card successfully combined with the next line
        pane.getChildren().add(new ImageView(image));
        
//        ImageView iv = new ImageView();
//        iv.setImage(image);
//        
//        pane.getChildren().add(iv);

        Scene scene = new Scene(pane);
        primaryStage.setTitle("3 Cards");
        primaryStage.setScene(scene);
        primaryStage.show();


	}
	
    public static void main(String args[]) {

        launch(args);
    }
}
