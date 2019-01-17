package assignment2;
import java.util.ArrayList; // import the ArrayList class


public class Person {
	
	private String name;
	private int age;

	



	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}





	public static void main(String[] args) {
		
		Person person = new Person("Roxanne", 25);
		System.out.println("My name is " + person.getName());
		System.out.println("I am " + person.getAge() + " years old.");
		System.out.println("My favorite hobbies are: ");
		person.getHobbies();
		
		
		
		
	}



	// GETTERS

	public String getName() {
		return name;
	}





	public void setName(String name) {
		this.name = name;
	}



	public int getAge() {
		return age;
	}





	public void setAge(int age) {
		this.age = age;
	}

	
//	getHobbies method
	
	public void getHobbies() {
		ArrayList<String> hobbies = new ArrayList<String>();
		hobbies.add("Drawing");
		hobbies.add("Signing");
		hobbies.add("Web Designing");
		
		for(int i =0; i< hobbies.size(); i++) {
			System.out.println(hobbies.get(i));
		}
	}



}
