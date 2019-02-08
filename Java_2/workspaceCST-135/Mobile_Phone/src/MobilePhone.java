import java.util.ArrayList;

public class MobilePhone {
	
	private String myNumber;
	private ArrayList<Contact> myContacts;
	
	public MobilePhone(String myNumber, ArrayList<Contact> myContacts) {
		super();
		this.myNumber = myNumber;
//		initializing the Arraylist into a new one
		this.myContacts = new ArrayList<Contact>();
	}
	
	
	
//	Add Contact method
	public boolean addNewContact(Contact contact) {
		if(findContact(contact.getName()) >= 0) {
			System.out.println("Contact is already on file");
			return false;
		} 
		myContacts.add(contact);
		return true;
	}
	
//	updateContact method
	public boolean updateContact(Contact oldContact, Contact newContact) {
		int foundPosition = findContact(oldContact);
		if(foundPosition < 0) {
			System.out.println(oldContact.getName() + ", was not found");
			return false;
		}
//		update old contact with newContact
		this.myContacts.set(foundPosition, newContact);
		System.out.println(oldContact.getName() + ", was replaced with " + newContact.getName());
		return true;
	}
	
//	remove contact method
	public boolean removeContact(Contact contact) {
		int foundPosition = findContact(contact);
		if(foundPosition < 0) {
			System.out.println(contact.getName() + ", was not found");
			return false;
		}
//		delete contact once found
		this.myContacts.remove(foundPosition);
		System.out.println(contact.getName() + ", was deleted");
		return true;
	}
	
	
//	===== Find Contact methods --- private methods returing int looking for arrylist index =====
	private int findContact(Contact contact) {
//		getting the index of the contact
		return this.myContacts.indexOf(contact);
	}
	
	private int findContact(String contactName) {
		for(int i =0; i<this.myContacts.size(); i++) {
			Contact contact = this.myContacts.get(i);
			if(contact.getName().equals(contactName)) {
//				if contact name equals the contactName parameter return contact
				return i;
			}
		}
//		if not matches return -1 == null?
		return -1;
		
	}
	
	
	
	
	
//	===== Find Contact method --- public method that is type of String =====
	public String queryContact(Contact contact) {
		if(findContact(contact) >= 0) {
			return contact.getName();
		}
		return null;
	}
	
	public Contact queryContact(String name) {
		int position =  findContact(name);
		if(position >= 0) {
			return this.myContacts.get(position);
		}
		return null;
	}
	
	public void printContacts() {
		System.out.println("Contact List");
		for(int i = 0; i < this.myContacts.size(); i++) {
			System.out.println((i+1) + "." + 
								this.myContacts.get(i).getName() + " ->" +
								this.myContacts.get(i).getPhoneNumber()
			);
		}
	}

}
