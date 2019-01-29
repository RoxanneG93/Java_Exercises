package assignment7;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		
//		Person person1 = new Person("Rochelle", "Garcia");
//		Person person2 = new Person("Roxanne", "Garcia");
//		Person person3= new Person(person1);
//		
//		if(person1 == person2) {
//			System.out.println("These persons are identicla using ==");
//			
//		} else {
//			System.out.println("These persons are not identical using ==");
//		}
		
		
//		if(person1.equals(person3)) {
//			System.out.println("These persons are identical using equals()");
//			System.out.println(person1.toString());
//			System.out.println(person3.toString());
//		} else {
//			System.out.println("These persons are not identical using equals()");
//			System.out.println(person1.toString());
//			System.out.println(person3.toString());
//		}
		
//		person1.walk();
//		person1.run();
//		System.out.println("Person1 is running: " + person1.isRunning());
		
		Person[] persons = new Person[10];
		persons[0] = new Person("Rochelle","Garcia");
		persons[1] = new Person("Roxanne","Garcia");
		persons[2] = new Person("Aiden","Kwon");
		persons[3] = new Person("Aiden","Lee");
		persons[4] = new Person("Jason","Smith");
		persons[5] = new Person("Norma","Bates");
		persons[6] = new Person("Norman","Bates");
		persons[7] = new Person("Amy","Gonzales");
		persons[8] = new Person("Arnold","Zamora");
		persons[9] = new Person("Arnold","Swartz");
		
//		Stuck on this array.sort error
//		Arrays.sort(persons);
		
		for(int x = 0; x < 10; x++) {
			System.out.println(persons[x]);
		}
		

	}

}
