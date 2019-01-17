
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Car car = new Car();
		
		if(car.tirePressure()) {
			car.startCar();
		} else {
			System.out.print("Car cannot start");
		}
		
		
		
//		Engine Stop
		car.stopCar();
		
//		Engine restart
		car.restartCar();

	}

}
