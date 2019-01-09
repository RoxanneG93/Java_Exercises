// Student Roxanne Garcia
// My Attempt at player manager class
package application;
import java.util.ArrayList;

public class NFL_Player_Manager {
	
	private ArrayList<NFL_Player> myPlayers;

//	constructor for NFL players arraylist
	public NFL_Player_Manager() {
		this.setMyPlayers(new ArrayList<NFL_Player>());
	}
	
//	Add Player method
	public boolean addNewPlayer() {
//		getMyPlayers().add(player);
		
//		hard coded way
		getMyPlayers().add(new Offensive_Player("Dak", "Prescott", "Dallas Cowboys","Quarter Back", 
											"Mississippi State", "3rd Season", 6.2, 235, 25, 
											false, true, 4, 0, 0));
		getMyPlayers().add(new Offensive_Player("Dak", "Prescott", "Dallas Cowboys","Quarter Back", 
				"Mississippi State", "3rd Season", 6.2, 235, 25, 
				false, true, 4, 0, 0));
		getMyPlayers().add(new Offensive_Player("Dak", "Prescott", "Dallas Cowboys","Quarter Back", 
				"Mississippi State", "3rd Season", 6.2, 235, 25, 
				false, true, 4, 0, 0));
		getMyPlayers().add(new Offensive_Player("Dak", "Prescott", "Dallas Cowboys","Quarter Back", 
				"Mississippi State", "3rd Season", 6.2, 235, 25, 
				false, true, 4, 0, 0));
		return true;
	}
		
	
//	 FIND Player method
	private int findPlayer(NFL_Player player) {
		return this.getMyPlayers().indexOf(player);
	}
	
	
//	FIND Player converting to string?
	public String queryPlayers(NFL_Player player) {
		if(findPlayer(player) >=0) {
			return player.getAllStats();
		}
		return null;
	}
	
//	Print Players method
	public void printPlayers() {
		System.out.println("Players List");
		for(int i=0; i<this.getMyPlayers().size(); i++) {
			System.out.println((i+1) + "." + 
			this.getMyPlayers().get(i).getAllStats());
		}
	}

	public ArrayList<NFL_Player> getMyPlayers() {
		return myPlayers;
	}

	public void setMyPlayers(ArrayList<NFL_Player> myPlayers) {
		this.myPlayers = myPlayers;
	}
	
	

}
