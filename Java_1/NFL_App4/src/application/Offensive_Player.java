package application;

//Student Roxanne Garcia
//My attempt of creating OffensivePlayer class inheriting from NFL_Player class and all it's properties. 
public class Offensive_Player extends NFL_Player {
//	class specific properties
	private int avgRushing;
	private int avgReceiving;
	
	public Offensive_Player() {
		super();
		System.out.println("no args contructor for OffensivePlayer");
	}
	
//	constructor
	public Offensive_Player(String firstName, String lastName, String currentTeam, 
			String position, String college, String experience, double height, int weight, int age, boolean offense, boolean defense,
			int teamNo, int avgRushing, int avgReceiving) {
		
//		calling properties from main class
		super(firstName, lastName, currentTeam, position, college, experience, height, weight, age, teamNo, offense, defense);
		
//		setting class specific properties
		this.avgRushing = avgRushing;
		this.avgReceiving = avgReceiving;
	}
}