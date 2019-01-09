import java.util.Scanner;

public class AddNumbers {
// ======= Student: Roxanne Garcia =======
// This my attempt at Adding Numbers program


	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a 5-digit positive integer");

		boolean hasNextInt = scanner.hasNextInt();
			if(hasNextInt) {
				int userInput = scanner.nextInt();
				
				String test = Integer.toString(userInput);
				if(test.length() == 5) {
					int sum = 0;
					
//					loop through input and add them together using / and % operators
					while(userInput > 0) {
						int digit = userInput % 10;
						sum += digit;
						
						userInput /= 10;
					}
					
					System.out.println("The total sum is " + sum);
					
				} else {
					System.out.println("Please enter no less or greater then 5 digits");
				}
				
			} else {
				System.out.println("Please enter only numbers.");
			}
				
			scanner.close();
	}
	
}
