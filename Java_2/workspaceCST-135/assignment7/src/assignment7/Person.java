package assignment7;


import assignment7.Person;

public class Person implements PersonInterface, Comparable {
	
	private String firstName = "Jim";
	private String lastName ="Carey";
	
	public Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public Person(Person person) {
		this.firstName = person.getFirstName();
		this.lastName = person.getLastName();
	}
	
	
	@Override
	public void walk() {
		System.out.println("I am walking");
//		boolean running = false;
		
	}
	
	@Override
	public void run() {
		System.out.println("I am running");
//		boolean running = true;
	}
	
	@Override
	public boolean isRunning() {
		return true;
	}
	
	@Override
	public boolean equals(Object other) {
		if(other == this) {
			System.out.println("I am here in other == this");
			return true;
		}
		if(other == null) {
			System.out.println("I am here in other == null");
			return false;
		}
		if(getClass() != other.getClass()) {
			System.out.println("I am here in getClass() != other.getClass()");
			return false;
		}
		
		Person person = (Person)other;
		return (this.firstName == person.firstName && this.lastName == person.lastName);
	}
	
	@Override 
	public String toString() {
		return "My class is " + getClass() + " " + this.firstName + " " + this.lastName;
	}

	
//	Getters
	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	@Override
	public int compareTo(Person p) {
		System.out.println(p);
		int value = this.firstName.compareTo(p.firstName);
		if(value == 0) {
			return this.lastName.compareTo(p.lastName);
					
		}else {
			return value;
		}
	}

//	@Override
//	public int compareTo() {
//		// TODO Auto-generated method stub
//		return 0;
//	}

//	@Override
//	public int compareTo() {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//	
	

}
