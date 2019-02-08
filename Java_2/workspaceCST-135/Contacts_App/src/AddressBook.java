import java.util.ArrayList;

/** This is the AddressBook Class. This the class containing our arraylist of contacts and CRUD methods.
**/

public class AddressBook {
	
	public ArrayList<BaseContact> contacts;
	
	

	public AddressBook(ArrayList<BaseContact> contacts) {
		super();
//		initializing new ArrayList with type of BaseContact
		this.contacts = new ArrayList<BaseContact>();
	}
	
	public String toString(){
		System.out.print("This is the test string method");
		return null;
		
	}
	
	
//	ADD contact method
	public boolean addContact(BaseContact contact) {
		if(contacts.contains(contact)) {
			System.out.println("Contact already added");
			return false;
		} else {
			contacts.add(contact);
			System.out.println(contact.getName() + " is added in address book");
			return true;
		}
	}
	

//	UPDATE contact method
	public boolean updateContact(BaseContact currentContact, BaseContact newContact) {
		//	using the searchContact method to find position/index
		int position = searchContact(currentContact);
//		String contactId = searchContactbyId(currentContact);
		if(position < 0) {
			System.out.println(currentContact.getName() + ", was not found");
			return false;
		}
		this.contacts.set(position, newContact);
		System.out.println(currentContact.getName() + ", was replaced with " + newContact.getName());
		return true;
	}
	
//Update contact by Id
//	public boolean updateContactById(String id) {
//		//	using the searchContactById method to find contact by its id
//		
//		String contactId = searchContactbyId(currentContact);
//		if(contactId == null) {
//			System.out.println(currentContact.getName() + ", was not found");
//			return false;
//		} 
//		this.contacts.set(currentContact, newContact);
//		System.out.println(currentContact.getName() + ", was replaced with " + newContact.getName());
//		return true;
//	}
//	
//	
//	display Contact by Id
	public BaseContact displayContactById(String id) {
		for(BaseContact contact : contacts) {
			String contactId = contact.getId();
			if(contactId == (id)) {
				System.out.println("viewing contact " + contact.toString());
				break;
			} else {
				System.out.println("contact not found");
				
			}
		}
		return null;

	}
	
	
//	SEARCH contact method
	private int searchContact(BaseContact contact) {
		// getting the index of the contact
		return this.contacts.indexOf(contact);
	}
	
//	SEARCH contact by ID
	public void searchContactById(String id) {
		for(BaseContact contact : contacts) {
			String contactId = contact.getId();
			if(contactId == (id)) {
				System.out.println(contact.getName() + " found.");
				break;
			} else {
				System.out.println("contact not found");
				
			}
		}
	}
	
//	SEARCH contact by ID
	public String searchContactbyId(BaseContact contact) {
		return contact.getId();
	}
	
// SEARCH contact by ID object
//	public BaseContact searchContactWithId(String id) {
//		String contactId = searchContactbyId(id);
//		if(position >= 0) {
//			return this.contacts.get(position);
//		}
//		return null;
//	}
	
//	SEARCH contact by Name
	public int searchContactByName(String Name) {
		for(int i =0; i<this.contacts.size(); i++) {
			BaseContact contact = this.contacts.get(i);
			if(contact.getName().equals(Name)) {
				//	if contact name equals the name parameter return contact
				System.out.println(contact.toString());
				return i;
			}
		}
		//	if not matches return -1 == null?
		return -1;
		
	}
	
// SEARCH contact's position in array list
	public int findContact(BaseContact contact) {
		return this.contacts.indexOf(contact);
	}
	
	
//	SEARCH contact using Contact object and finding position.
	public String queryContact(BaseContact contact) {
		if(findContact(contact) >= 0) {
			return contact.toString();
		}
		return null;
	}
	
	public BaseContact queryContact(String name) {
		int position = searchContactByName(name);
		if(position >= 0) {
			return this.contacts.get(position);
		}
		return null;
	}
	
//	DELETE contact method
	public boolean deleteContact(BaseContact contact) {
		int position = searchContact(contact);
		if(position < 0) {
			System.out.println(contact.getName() + ", was not found");
			return false;
		}
		//	delete contact once found
		this.contacts.remove(position);
		System.out.println(contact.getName() + ", was deleted");
		return true;
	}
	
// LOAD ALL CONTACTS
	public void printAllContacts() {
		System.out.println("============");
		System.out.println("Contact List");
		System.out.println("============");
		for(int i = 0; i < this.contacts.size(); i++) {
			System.out.println((i+1) + "." + 
								this.contacts.get(i).toString()
			);
		}
		
	}
	
// LOAD Contatct's PHOTOS
	public void printPhotos(BaseContact contact) {
		System.out.println("============");
		System.out.println("PHOTOS");
		System.out.println("============");
		for(int i = 0; i < contact.getPhotos().size(); i++) {
			System.out.println((i+1) + "." + 
								contact.getPhotos().get(i).toString()
			);
		}
		
	}
	
//	Getter
	public ArrayList<BaseContact> getContacts() {
		return contacts;
	}


	

}
