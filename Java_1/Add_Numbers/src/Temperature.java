import java.util.Scanner;

public class Temperature {
	// ======= Student: Roxanne Garcia =======
	// This my attempt at converting Temperature program
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a Fahrenheit Temperature:  ");
		
//		checks to see if the nextInt input is only number
		boolean hasNextInt = scanner.hasNextInt();
		
		if(hasNextInt) {
//			create a variable for user's input -- nextInt() reads an integer
			int fInput = scanner.nextInt();
			
			int toCelcius = ((fInput - 32)*5)/9;
			
			System.out.println(fInput + "F is equivalent to " + toCelcius + " degrees in Celsius.");
			
//			calling nextLine again to that user can input again in the console when Enter key is pressed
			scanner.nextLine();
			
			System.out.println("Enter a Celsius Temperature: ");
			int cInput = scanner.nextInt();
			
			int toFarhen = ((9 *cInput) / 5) + 32;
			System.out.println(cInput + "C is equivalent to " + toFarhen + " degrees in Fahrenheit.");


		} else {
			System.out.println("Please enter valid numbers");
		}
		
		scanner.close();

	}
}