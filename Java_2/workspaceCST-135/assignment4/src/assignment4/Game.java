package assignment4;

import java.util.Random;

public class Game {

	public static void main(String[] args) {
		
//		generating random health between 1 - 1000
		Random random = new Random();
		
		int health1 = random.ints(1, (1000 + 1)).findFirst().getAsInt();
		int health2 = random.ints(1, (1000 + 1)).findFirst().getAsInt();
		
		System.out.println("Creating our Super Heros....");
		Superman superman = new Superman(health1);
		Batman batman = new Batman(health2);
		System.out.println("Super Heros created");
		
		System.out.println("Game starting...");
		
		while(!superman.isDead() && !batman.isDead()) {
			superman.attack(batman);
			batman.attack(superman);
			
			if(superman.isDead()) {
				System.out.println("GAME! Batman defeated Superman");
			}
			if(batman.isDead()) {
				System.out.println("GAME! Superman defeated Batman");
			}
		}

	}

}
