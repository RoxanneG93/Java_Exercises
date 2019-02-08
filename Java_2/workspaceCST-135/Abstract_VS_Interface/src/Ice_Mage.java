
public class Ice_Mage implements Mage_Class {
	
//	HAS TO HAVE ALL Abstract methods

	@Override
	public void defense() {
		System.out.println("I can use magic as a sheild!");
		
	}

	@Override
	public void attack() {
		System.out.println("ICE Attack!");
		
	}

	@Override
	public void sp() {
		System.out.println("SP at 200");
		
	}

}
