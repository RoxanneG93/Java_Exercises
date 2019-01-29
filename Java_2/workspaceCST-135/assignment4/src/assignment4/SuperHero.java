package assignment4;

import java.util.Random;

public class SuperHero {
	
	String name;
	int health;
	boolean isDead;
	
	
//	constructor initializing class properties
	public SuperHero(String name, int health) {
		this.name = name;
		this.health = health;
	}

	

//	Public void attack() method that is has an argument of type SuperHero 
//	(i.e. the opponent) that creates random damage between 1 and 10 and then 
//	calculates the health of the opponent SuperHero.
	
	public void attack(SuperHero opponent) {
		Random random = new Random();
		
		int damage = random.ints(1, (10+1)).findFirst().getAsInt();
		
		opponent.determineHeatlh(damage);
		System.out.println(String.format("%s has damage of %d and health of %d", opponent.name, damage, opponent.health));
	}
	
	public boolean isDead() {
		return this.isDead;
	}
	
//	method to determine health
	public void determineHeatlh(int damage){
		if(this.health - damage <= 0) {
			this.health = 0;
			this.isDead = true;
		}else {
			this.health = this.health - damage;
		}
	}

}
