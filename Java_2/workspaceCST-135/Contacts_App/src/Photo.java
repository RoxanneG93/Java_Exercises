/** This is the Photo Class. 
 	Contains properties/methods specific to each photo saved 
 	within each contact.
**/

public class Photo {
	private int photo_Id;
	private int date;
	private String fileName;
	private String description;
	
	
	public Photo(int photo_Id, int date, String fileName, String description) {
		this.photo_Id = photo_Id;
		this.date = date;
		this.fileName = fileName;
		this.description = description;
	}


	public Photo() {
		super();
		// TODO Auto-generated constructor stub
	}


	
	
//	 GETTERS
	public int getPhoto_Id() {
		return photo_Id;
	}


	public int getDate() {
		return date;
	}


	public String getFileName() {
		return fileName;
	}


	public String getDescription() {
		return description;
	}


	
	
//	NEED TO STRING METHOD
	public String toString(){
		return " Veiwing Photos --- ID: " + this.photo_Id+  "Date " + this.date+ " File Name: " + this.fileName + "Description: " + this.description;
		
	}
	

}
