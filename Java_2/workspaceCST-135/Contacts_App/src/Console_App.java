import java.util.ArrayList;
import java.util.Scanner;

/** This is the Console_App Class. This will be our driver class to run the application.
**/
public class Console_App {
	
	private static Scanner scanner = new Scanner(System.in);
	private static AddressBook addressBook = new AddressBook(null);
	
	
	
//	======================== WEEK 2 WORK ===========================================
	
	
//	sample of Locations
//	static Location location1 = new Location(1, "555 Main St", "Brooklyn", "NY");
//	static Location location2 = new Location(2, "333 Frost Ave", "Austin", "TX");
//	static Location location3 = new Location(3, "123 Rasberry Dr", "Richmond", "VA");
//	
////	Sample of photos
//	static ArrayList<Photo> photoSet1 = new ArrayList<Photo>();
//	static ArrayList<Photo> photoSet2 = new ArrayList<Photo>();
//	
//	static AddressBook contacts = new AddressBook(null);
//	
//	
////	Sample of Contacts
//	static BaseContact person1 = new BaseContact("1", "John", "123456789", photoSet1, location1);
//	static BaseContact person2 = new BaseContact("2","Billy", "788555444", photoSet2, location2);
//	static BaseContact person3 = new BaseContact("3","Bob", "8459673448", null, location3);
//	
//	private static FileAccessService contactsList = new FileAccessService();
//	
//	
//	static Location location4 = new Location(4, "321 Chocolate Dr", "Pheonix", "AZ");
//	
//	
//	
////	test contact for updating
//	static BaseContact person4 = new BaseContact("4", "Arnold", "8459673448", photoSet2, location3);
	

	public static void main(String[] args) {
		
//		Menu once app starts
		boolean quit = false;
		startApp();
		showOptions();
		while(!quit) {
			System.out.println("\nEnter action: (5 to show available actions)");
			int actions = scanner.nextInt();
			scanner.nextLine();	
			
			switch(actions) {
				case 0:
					System.out.println("\nShutting down...");
					quit = true;
					break;
				case 1:
					addressBook.printAllContacts();
					break;
				case 2:
					createContact();
					break;
				case 3:
//					updateContact();
					break;
				case 4:
					queryContactById();
					break;
				case 5:
					showOptions();
					break;
			}
		}
	}
		
		
		
			
		
		
		
		
//		==================== WEEK 2 Work ================================================
		
		
		
		//		Adding Photos Example
//		photoSet1.add(new Photo(1, 3, "testFileName1", "testDescription1" ));
//		
//		photoSet1.add(new Photo(2, 5, "testFileName1(2)", "testDescription1(2)" ));
//		photoSet2.add(new Photo(1, 6, "testFileName2", "testDescription2" ));
		
		
		
//		Adding Person objects to Contacts ArrayList
//		contacts.addContact(person1);
//		contacts.addContact(person2);
//		contacts.addContact(person3);
//		
////		Display Contact by ID
//		contacts.displayContactById("3");
//		
////		Show All Contacts
//		contacts.printAllContacts();
//		
////		Show contact's photos example
//		contacts.printPhotos(person1);
//		
////		Edit and Update contact
//		contacts.updateContact(person1, person4);
//		
//		contacts.printAllContacts();
//		
////		Delete contact from Contacts List
//		contacts.deleteContact(person4);
//		
//		contacts.printAllContacts();
//		
////		Search Contact by Name
//		contacts.searchContactByName("Bob");
//
//	}
	
	
//	======================= WEEK 3 Menu ==================================
	
//	Menu Methods
		
	
//	Add Contact
	private static void createContact() {
		System.out.println("Enter new contact name: ");
		String name = scanner.nextLine();
		System.out.println("Enter phone number: ");
		String phone = scanner.nextLine();
		BaseContact newContact = BaseContact.createContact(name, phone, new ArrayList<Photo>(), new Location());
		
		if(addressBook.addContact(newContact)) {
			System.out.println("New contact added : " + name + ", phone = " + phone);
		} else {
			System.out.println("Cannot add, " + name + " already on file.");
		}
	}
	


	//	Update Contact
	private static void updateContact() {
		System.out.println("Enter exisiting contact's id: ");
	
		String id = scanner.nextLine();
		
		BaseContact currentContact = addressBook.displayContactById(id);
		
		if(currentContact.getId() == null) {
			System.out.println("Contact not found");
			return;
		}
		System.out.print("Enter new contact name: ");
		String newName = scanner.nextLine();
		System.out.print("Enter new contact phone number: ");
		String newNumber = scanner.nextLine();
		
		BaseContact newContact = BaseContact.createContact(newName, newNumber, null, null);
			
			if(addressBook.updateContact(currentContact, newContact)) {
				System.out.println("Successfully updated record");
			} else {
				System.out.println("Error updated record");
			}
		
	}
	
//	DELETE Contact by Name method
	private static void removeContact() {
		System.out.println("Enter existing contact name: ");
		String name = scanner.nextLine();

		BaseContact existingContact = addressBook.queryContact(name);
		if(existingContact == null) {
			System.out.println("Contact not found");
			return;
		}
		if(addressBook.deleteContact(existingContact)) {
			System.out.println("Successfully deleted");
		} else {
			System.out.println("Error deleting contact");
		}
	}
	
//	Search by Name method
	private static void queryContact() {
		System.out.println("Enter existing contact name: ");
		String name = scanner.nextLine();

		BaseContact existingContact = addressBook.queryContact(name);
		if(existingContact == null) {
			System.out.println("Contact not found");
			return;
		}
		
		System.out.println("Name: " + existingContact.getName() + " phone number is " 
		+ existingContact.getPhone());
	}
	

//	Search by ID method
	private static void queryContactById() {
		System.out.println("Enter existing contact's id: ");
		String id = scanner.nextLine();

		BaseContact existingContact = addressBook.displayContactById(id);
		if(existingContact.getId() != id) {
			System.out.println("Contact not found");
			return;
		}
		
		System.out.println("Name: " + existingContact.getName() + " phone number is " 
		+ existingContact.getPhone());
	}
	
	
	
//	Start App method
	private static void startApp() {
			System.out.println("Accessing Address Book...");
	}
	
//	Menu method
	private static void showOptions() {
		System.out.println("\nPlease select an option: \npress");
		System.out.println( "0 - to shutdown\n" +
							"1 - to show all contacts\n" +
							"2 - to add a contact\n" +
							"3 - to show contact by id\n" +
							"4 - to search contacts by value\n" +
							"5 - to print a lst of available actions."
							
		);
		
		System.out.println("Choose your action: ");
	}

}
