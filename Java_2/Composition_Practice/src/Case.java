
public class Case {
	
//	variables
	private String model;
	private String manufacturer;
	private String powerSupply;
	private Dimensions dimensions;
	
	
//	constructor
	public Case(String model, String manufacturer, String powerSupply, Dimensions dimensions) {
		this.model = model;
		this.manufacturer = manufacturer;
		this.powerSupply = powerSupply;
		this.dimensions = dimensions;
	}
	
//	press power button method that prints to console/terminal
	public void pressPowerButton() {
		System.out.println("Power button pressed. ");
	}

	
//	GETTERS
	public String getModel() {
		return model;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public Dimensions getDimensions() {
		return dimensions;
	}
	
	
	
	
	
}
