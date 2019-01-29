
public class Dog extends Animal {
	
//	characteristic specific to Dog class
	private int legs;
	private int tail;
	private String coat;
	private String color;
	
	
//	in the Dog constructor we are changing the parameters to include the specific variables(characteristics) for Dogs
	public Dog(String name, int size, int weight, int legs, int tail, String coat, String color) {
//		super calls the parameters from the Animal class which we are initializing 
		super(name, 1, 1, size, weight);
		
		this.legs = legs;
		this.tail = tail;
		this.coat = coat;
		this.color = color;
	}
	
	
}
