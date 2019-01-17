import java.util.ArrayList; // import the ArrayList class


public class Car {
	
	Tire tire1 = new Tire();
	Tire tire2 = new Tire();
	Tire tire3 = new Tire();
	Tire tire4 = new Tire();
	
	ArrayList<Boolean> allTires = new ArrayList<Boolean>(); // Create an ArrayList object
	
	public Car() {
		super();
		this.allTires = allTires;
		this.engine = engine;
		allTires.add(tire1.enoughAir(32));
		allTires.add(tire2.enoughAir(33));
		allTires.add(tire3.enoughAir(34));
		allTires.add(tire4.enoughAir(33));
	}

	
	
	Engine engine = new Engine();
	
	public boolean tirePressure() {
		int tire = 0;
		for(int i=0; i<allTires.size(); i++) {
//			System.out.println(allTires.get(i).toString());
			if(allTires.get(i).equals(false)) {
				System.out.println("Tire " + tire + " fail");
//				System.out.println("Car cannot start");
				tire++;
//				break;
				return false;

			}
		tire++;
		System.out.println("Tire " + tire + " sucess");
		

		}
		return true;

		
		
		
	}


	public void startCar() {
		engine.engineStart();
	}
	
	public void stopCar() {
		engine.engineStop();
	}
	
	public void restartCar() {
		System.out.print("Restarting engine...");
		engine.engineStart();
	}
	

}
