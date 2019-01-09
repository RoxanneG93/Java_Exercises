// Roxanne Garcia
// My Attempt at Exercise 5 -- Didn't do so hot.

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class TwoDemArray {
public static void main(String[] args) {
	
//	create 2D array with 20 x 45 dimension
	int totalRow = 20;
	int totalColumn = 45;
	char[][] array = new char[totalRow][totalColumn];
    File textFile = new File("test.txt");
    
    try {
      FileInputStream fileStream = new FileInputStream(textFile);
      char current;
      for(int i=0;i<20;i++) {
          for(int j=0;j<45;j++) {
              if(fileStream.available() > 0) {
                current = (char) fileStream.read();
//                replace spaces with '@'
                if(current == ' ')
                    array[i][j] = '@';
                else
                    array[i][j] = current;
//                check to see how table prints
//                System.out.println("The table thus far");
                System.out.print(array[i][j]);
//                System.out.println(Arrays.toString(array));
              }
          }
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
    
//    attempt to print in table as string

    for(int j=0;j<array[0].length;j++) {
      for(int i=0;i<array.length;i++) {
    	  System.out.print(array[i][j]);
      }
    }
    
}
}
