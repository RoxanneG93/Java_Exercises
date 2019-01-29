package assignment8;

public class Retangle extends ShapeBase {

	public Retangle(String name, int width, int height) {
		super(name, width, height);
		
	}
	
	@Override
	public int calculateArea() {
		return width * height/2;
	}

}
