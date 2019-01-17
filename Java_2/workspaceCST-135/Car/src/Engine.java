
public class Engine {
	
	private int mph = 0;
	
	
	public void engineStart() {
		
		System.out.println("engine started");
		for(int i = 0; mph <= 59; i++) {
			mph++;
			System.out.println("car running at "  + mph + "mph");
		}
		
	}
	
	public void engineStop() {
		System.out.println("Engine off");
	}
	
//	public void engineRestart() {
//		System.out.println("Restarting engine...");
//		for(int i = 0; mph <= 59; i++) {
//			mph++;
//			System.out.println("car running at "  + mph + "mph");
//		}
//	}
	

}
