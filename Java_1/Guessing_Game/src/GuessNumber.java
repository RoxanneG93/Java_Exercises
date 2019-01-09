// Student Roxanne Garcia
// This is my attempt at the Guessing Game exercise. 
import java.util.Scanner;

public class GuessNumber {
	public static void main(String[] args) {
		
		// Variables
		int randomNum;
		int guess;
		int attempts= 0;
		
//		create variable that randomly generates number and store it to variable
		randomNum = (int)(Math.random()*((1000-1)));
		System.out.println(randomNum);
		
//		prompt user for input
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a guess between 1 and 1000 ");

        do {
//      	save user's guess to variable and ask user for next prompt
      		guess = scanner.nextInt();
      		attempts++;

            if (guess == randomNum)
            	System.out.println("You WIN! It took you " + attempts + " guesses.");
            else if (guess < randomNum)
            	System.out.println("HIGHER");
            else if (guess > randomNum)
            	System.out.println("LOWER");

        } while (guess != randomNum);

  }

		

		
}
	

