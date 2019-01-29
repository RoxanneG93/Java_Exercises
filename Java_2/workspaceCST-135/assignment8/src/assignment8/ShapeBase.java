package assignment8;

public class ShapeBase implements ShapeInterface {
	
	protected String name;
	protected int width, height;
	
	

	public ShapeBase(String name, int width, int height) {
		super();
		this.name = name;
		this.width = width;
		this.height = height;
	}



	@Override
	public int calculateArea() {
		return -1;
	}


//	Getter
	public String getName() {
		return name;
	}
	

}
