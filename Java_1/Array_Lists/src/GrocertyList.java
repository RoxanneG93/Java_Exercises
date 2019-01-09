import java.util.ArrayList;

public class GrocertyList {
//	create String ArrayList 
	private ArrayList<String> groceryList = new ArrayList<String>();
	
//	method to add grocery item
	public void addGroceryItem(String item) {
		groceryList.add(item);
	}
	
//	method to print groceryList
	public void printGroceryList() {
		System.out.println("You have " + groceryList.size() + " items in your grocery List");
		for(int i = 0; i < groceryList.size(); i++) {
			System.out.println((i+1) + ". " + groceryList.get(i));
		}
	}
	
//	method to UPDATE groceryList item
	public void modifyGroceryItem(int position, String newItem) {
		groceryList.set(position, newItem);
		System.out.print("Grocery item " + (position+1) + " has been modified");
	}

//	method to DELET groceryList item
	public void removeGroceryItem(int position) {
		String theItem = groceryList.get(position);
		groceryList.remove(position);
	}
	
//	public String findItem(String searchItem) {
//		boolean exists = groceryList.contains(searchItem);
//	}
}
