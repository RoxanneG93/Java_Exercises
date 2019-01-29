import java.util.ArrayList;

public class Team {
	private String name;
	int played = 0;
	int won = 0;
	int lost = 0;
	int tied = 0;
	
	private ArrayList<Player> members = new ArrayList<>();
	
	public Team(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public boolean addPlayer(Player player) {
		if(members.contains(player)) {
			System.out.println(player.getName() + " is already on this team");
			return false;
		} else {
			members.add(player);
			System.out.println(player.getName() + " picked for team " + this.name);
			return true;
		}
	}
	
	public int numPlayer() {
		return this.members.size();
	}
	
	public void matchResult(Team opponent, int ourScore, int thierScore) {
		if(ourScore > thierScore) {
			won++;
		} else if(ourScore == thierScore) {
			tied++;
		} else {
			lost++;
		}
		played++;
//		Saving results for opponents team also
		if(opponent != null) {
			opponent.matchResult(null, thierScore, ourScore);
		}
	}
	
	public int ranking() {
		return (won * 2) + tied;
	}
}
