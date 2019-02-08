
public class Contact {
	
	private String name;
	private String phoneNumber;
	
	public Contact(String name, String phoneNumber) {
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
	}
	
	
//	Getters
	public String getName() {
		return name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}
	
//	create contact method
	public static Contact createContact(String name, String phoneNumber) {
		return new Contact(name, phoneNumber);
	}
	
	
	

}
