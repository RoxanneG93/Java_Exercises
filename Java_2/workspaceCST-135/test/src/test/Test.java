package test;


public class Test {

	public static void main(String[] args) {
		
		Person person1 = new Person("Rochelle", "Garcia");
		Person person2 = new Person("Roxanne", "Garcia");
		Person person3= new Person(person1);

	
	
		if(person1 == person2) {
			System.out.println("These persons are identicla using ==");
		
		} else {
			System.out.println("These persons are not identical using ==");
		}
	
		
		if(person1.equals(person3)) {
			System.out.println("These persons are identical using equals()");
			System.out.println(person1.toString());
			System.out.println(person3.toString());
		} else {
			System.out.println("These persons are not identical using equals()");
			System.out.println(person1.toString());
			System.out.println(person3.toString());
		}
	}

}
