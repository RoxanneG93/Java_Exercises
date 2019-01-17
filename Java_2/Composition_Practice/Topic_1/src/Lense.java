
public class Lense {
//	class specific variables
	private String model;
	private String manufacturer;
	private String focusType;
	private double weight;
	private int maximumAperture;
	
//	Constructor
	public Lense(String model, String manufacturer, String focusType, double d, int dimensions) {
		super();
		this.model = model;
		this.manufacturer = manufacturer;
		this.focusType = focusType;
		this.weight = d;
		this.maximumAperture = maximumAperture;
	}
	
	
	
//	GETTERS
	public String getModel() {
		System.out.print(model);
		return model;
	}

	public String getManufacturer() {
		System.out.print(manufacturer);
		return manufacturer;
	}

	public String getFocusType() {
		System.out.print(focusType);
		return focusType;
	}

	public double getWeight() {
		System.out.print(manufacturer);
		return weight;
	}

	public int getmaximumAperture() {
		System.out.print(maximumAperture);
		return maximumAperture;
	}
	
	
	
	

}
