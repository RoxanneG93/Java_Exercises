package assignment8;

public class Test {
	
	private static void displayArea(ShapeBase shape) {
		System.out.println("This is a shape name " + shape.getName() + 
				" with an area of " + shape.calculateArea());
	}
		
	public static void main(String[] args) {
		
		ShapeBase[] shapes = new ShapeBase[4];
		shapes[0] = new Retangle("Retangle", 10, 200);
		shapes[1] = new Triangle("Triangle", 10, 50);
		shapes[2] = new Circle("Circle", 8, 8);
		shapes[3] = new Trapezoid("Trapezoid", 18, 12);
	
		
		for(int x=0; x<shapes.length; x++) {
			displayArea(shapes[x]);
		}

	}

}
