import java.util.ArrayList;
import java.util.UUID;

/** This is the BaseContact Class that contains base properties and methods that
 other child class will inherit.
**/

public class BaseContact {
	String id = UUID.randomUUID().toString();
//	public String id;
	public String name;
	public String phone;
	public ArrayList<Photo> photos;
	public Location location = new Location();
	
	public BaseContact(String name, String phone, ArrayList<Photo> photos, Location location) {
//		this.id = id;
		this.name = name;
		this.phone = phone;
		this.photos = photos;
		this.location = location;
	}

	public BaseContact() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String toString(){
		return "ID: " + this.id + " Contact Name: " + this.name + " phone: " + this.phone + " address: " + this.location +
				" Photos: " + this.photos;
		
	}
	
//	create contact method
	public static BaseContact createContact(String name, String phoneNumber, ArrayList<Photo> photos, Location location) {
		return new BaseContact(name, phoneNumber, photos, location);
	}

	
	
	
//	Getters
	
	public String getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}

	public String getPhone() {
		return phone;
	}

	public ArrayList<Photo> getPhotos() {
		return photos;
	}

	public Location getLocation() {
		return location;
	}
	
	

}
