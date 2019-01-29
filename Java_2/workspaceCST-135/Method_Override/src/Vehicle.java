
public class Vehicle {
	
	public void move() {
		System.out.println("Patent class that shows Miles per hour.");
	}

}

class Car extends Vehicle {
	
	@Override
	public void move() {
		System.out.println("Car moves at 50 Miles per hours");
	}
}

class Jet extends Vehicle {
	
	@Override
	public void move() {
		System.out.println("Jet moves at 575 Miles per hours");
	}
}