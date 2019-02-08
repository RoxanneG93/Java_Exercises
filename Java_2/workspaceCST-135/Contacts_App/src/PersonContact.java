import java.util.ArrayList;

/** This is the PersonContact Class. This will be specific object for regular Person contact.
**/

public class PersonContact extends BaseContact {
	
	private String DOB;
	private String description;
	private ArrayList<BaseContact> relatives;
	
	public PersonContact(String DOB, String description, ArrayList<BaseContact> relatives) {
		this.DOB = DOB;
		this.description = description;
		this.relatives = relatives;
	}

	public PersonContact() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PersonContact(String id, String name, String phone, ArrayList<Photo> photos, Location location) {
		super(name, phone, photos, location);
		// TODO Auto-generated constructor stub
	}
	
	public String toString(){
		System.out.print("This is the test string method");
		return name;
	}
	
	
	

}
