
public class Tire {
	
	public int psi;
//	private boolean enoughAir;
	private int minPsi = 32;
	private int maxPsi = 34;
	
	
//	public Tire(int psi) {
//		super();
//		this.psi = psi;
//		
//	}
	
//	public int startingAir(int psi) {
//		return psi;
//	}
//	
	public boolean enoughAir(int psi) {
		if(psi <= maxPsi && psi >= minPsi) {
//			System.out.println("tire has enough air");
			psi = psi;
			System.out.println("Checking air...tire has " + psi + "psi");
			return true;
		} else {
			System.out.println("Checking air...tire has has less then 32psi");
			return false;
		}

	}
	
	

}
