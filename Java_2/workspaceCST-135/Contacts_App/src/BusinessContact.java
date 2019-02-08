import java.util.ArrayList;

/** This is the BusinessContact Class. This be a specific object for Business Contacts.
**/

public class BusinessContact extends BaseContact {
	
	private String hours;
	private String websiteURL;
	
	
	public BusinessContact(String name, String phone, ArrayList<Photo> photos, Location location, String hours,
			String websiteURL) {
		super(name, phone, photos, location);
		this.hours = hours;
		this.websiteURL = websiteURL;
	}
	
	
	public String toString(){
		System.out.print("This is the test string method");
		return name;
	}
}
