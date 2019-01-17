
public class Camera {
	
//	this Camera class is utilizing the lense class and assigning to variable theLense
//	This is composition
	private Lense theLense;

	
//	constructor
	public Camera( Lense theLense) {
		super();
		this.theLense = theLense;
	}

	
	public static void main(String[] args) {
//		Example of creating new class and assigning properties within parameter
		Lense theLense = new Lense("SEL85F18 85mm ", "Sony", "auto-focus", 1.19, 22);
		
//		Prints out "Sony"
		theLense.getManufacturer();
		
	}

}


// The Student Class is utilizing the Name and Address class and assigning to variables
// Similar to how the Camera class utlized the Lense Class
//public class Student {
//	private Name name;
//	private Address address; 
//	...
//}
//
//public class Address {
//	...
//}
//
//public class Name {
//	...
//}