
public class Gun implements WeaponInterface {

	@Override
	public void fireWeapon() {
		System.out.println("In overloaded Gun.fireWeapon()");
		
		
	}

	@Override
	public void fireWeapon(int power) {
		System.out.println("In Gun.fireWeapon() with a power of " + power);
		
	}

	@Override
	public void activate(boolean b) {
		System.out.println("In the Gun.activate() with an enable of " + b);
		
	}

}
