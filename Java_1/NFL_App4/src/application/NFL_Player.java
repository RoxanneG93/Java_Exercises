package application;

//Student Roxanne Garcia
//My attempt of creating abstract NFL_Player class and all it's properties. 
//Added two new boolean properties to indicate offense or not 
//-- may consolidate to one flag once I can think of a proper term, not familiar with football

public abstract class NFL_Player {

//setting 10 properties	
	private String firstName;
	private String lastName;
	private String currentTeam;
	private String position;
	private String college;
	private String experience;
	private double height;
	private int weight;
	private int age;
	private int teamNo;
//	adding two new properties signifying offense or defense
	private boolean offense;
	private boolean defense;
	


	//	constructor for ALL properties
	public NFL_Player(String firstName, String lastName, String currentTeam, String postition, String college,
				String experience, double height, int weight, int age, int teamNo, boolean offense, boolean defense) {
			this.firstName = firstName;
			this.lastName = lastName;
			this.currentTeam = currentTeam;
			this.position = postition;
			this.college = college;
			this.experience = experience;
			this.height = height;
			this.weight = weight;
			this.age = age;
			this.teamNo = teamNo;
			this.offense = offense;
			this.defense = defense;
		}

	// Constructor with no properties - Default settings
	public NFL_Player() {
		this("Will", "Turner", "team: NA", "position: NA", "University: NA", "experience: NA", 6, 200, 25, 90, true, false);
	}
	
	//	3rd constructor to add new player object
	public static NFL_Player createNewPlayer(String firstName, String lastName, String currentTeam, String postition, String college,
				String experience, double height, int weight, int age, int teamNo, boolean offense, boolean defense) {
		
		if(offense = true) {
			return new Offensive_Player();
		}
		return new Defensive_Player();
	}
	

	//	Setters and Getters
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getCurrentTeam() {
		return currentTeam;
	}
	public void setCurrentTeam(String currentTeam) {
		this.currentTeam = currentTeam;
	}
	public String getPostition() {
		return position;
	}
	public void setPostition(String postition) {
		this.position = postition;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getTeamNo() {
		return teamNo;
	}
	public void setTeamNo(int teamNo) {
		this.teamNo = teamNo;
	}
	
//	added new setters for Offense and Defense props
	public boolean getOffense() {
		return offense;
	}

	public void setOffense(boolean offense) {
		this.offense = offense;
	}

	public boolean getDefense() {
		return defense;
	}

	public void setDefense(boolean defense) {
		this.defense = defense;
	}
	
	
//	======= two other Getter methods =======
	public String getFullName() {
		return this.firstName + " " + this.lastName;
	}
	
//	("Will", "Turner", "team: NA", "position: NA", "University: NA", "experience: NA", 6, 200, age: 25, 90)
	public String getAllStats() {
		return "FullName: "  + getFullName() + " Team No: " + this.getTeamNo() +  " currentTeam:  " +  this.getCurrentTeam() + " University: " + this.getCollege() + 
				" Experience: " + this.getExperience() + " Height: " + this.getHeight() + " Weight: " + "lbs Age: " + this.getAge();
	}
	
//	toString method?
	@Override
	public String toString() {
		 return getAllStats();
	}	



}
