package assignment8;

public class Circle extends ShapeBase {

	public Circle(String name, int width, int height) {
		super(name, width, height);
		
	}
	
	@Override
	public int calculateArea() {
		
		double pi = 3.14;
		return (int) (width * height * pi);
	}
	

}
