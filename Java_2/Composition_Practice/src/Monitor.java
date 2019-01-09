
public class Monitor {
	
//	class specific variables
	private String model;
	private String manufacturer;
	private int size;
	
//	this variable references the Resolution Class. It demonstrates Composition in how a 
//	Monitor ISNT A resolution but HAS A resolution
	private Resolution nativeResolution;
	
//	constructor
	public Monitor(String model, String manufacturer, int size, Resolution nativeResolution) {
		this.model = model;
		this.manufacturer = manufacturer;
		this.size = size;
		this.nativeResolution = nativeResolution;
	}
	
	
//	method that prints coordinates and color
	public void drawPixelAt(int x, int y, String color) {
		System.out.println("Drawing Pixel at  " + x + "," + y + " in color " + color);
	}

	
//	Getters
	public String getModel() {
		return model;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public int getSize() {
		return size;
	}

	public Resolution getNativeResolution() {
		return nativeResolution;
	}
	
	
	
}
