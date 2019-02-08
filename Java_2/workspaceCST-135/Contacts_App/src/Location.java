/** This is the Location Class. 
 	Contains properties/methods specific to contact's location saved 
 	within each contact.
**/
public class Location {
	
	private int locationId;
	private String street;
	private String city;
	private String state;
	
	
	public Location(int locationId, String street, String city, String state) {
		super();
		this.locationId = locationId;
		this.street = street;
		this.city = city;
		this.state = state;
	}


	public Location() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	
//	GETTERS
	public int getLocationId() {
		return locationId;
	}


	public String getStreet() {
		return street;
	}


	public String getCity() {
		return city;
	}


	public String getState() {
		return state;
	}
	
	
	public String toString(){
		return "ID: " + this.locationId+  " Street " + this.street+ " City: " + this.street + " State: " + this.state;
		
	}
	
	
	
	
	

}
