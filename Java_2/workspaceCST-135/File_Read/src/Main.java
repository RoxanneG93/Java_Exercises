import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		File file = new File("in1");
		Scanner s = new Scanner(file);
		
		int num1 = s.nextInt();
		int num2 = s.nextInt();
		
		System.out.println(num1+ " + "+num2+" = "+(num1+num2));
		
//		System.out.println(s.next());
//		System.out.println(s.next());
//		System.out.println(s.next());
		
//		System.out.println(s.nextLine());
//		System.out.println(s.nextLine());
//		System.out.println(s.nextLine());
//		System.out.println(s.nextLine());

	}

}
