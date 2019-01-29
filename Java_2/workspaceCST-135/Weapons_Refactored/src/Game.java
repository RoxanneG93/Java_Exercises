import java.util.ArrayList;



public class Game {
	

	
	public static void main(String[] args) {
		
		Bomb bomb = new Bomb();
		Gun gun = new Gun();
		
		ArrayList<WeaponInterface> weapons = new ArrayList(2);
		weapons.add(bomb);
		weapons.add(gun);
		for(int i =0; i < weapons.size(); i++) {
			fireWeapon(weapons.get(i));
		}
		
	
	}
	
	private static void fireWeapon(WeaponInterface weapon) {
		weapon.activate(true);
		weapon.fireWeapon();
	}
	


}
