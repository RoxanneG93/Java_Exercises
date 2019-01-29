package assignment8;

public class Trapezoid extends ShapeBase {

	public Trapezoid(String name, int width, int height) {
		super(name, width, height);
		
	}
	
	@Override
	public int calculateArea() {
		return (width + height)/2;
	}
	
	

}
