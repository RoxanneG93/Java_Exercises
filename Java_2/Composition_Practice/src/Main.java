
public class Main {

//	All and Example of Composition

	public static void main(String[] args) {
		
//		an example of creating new class and using new variable in parameter
		Dimensions dimensions = new Dimensions(20, 20, 5);
		Case theCase = new Case("220B", "Dell", "2400", dimensions);
		
//		ex of creating new class within parameter
		Monitor theMonitor  = new Monitor("27 in Beast", "Acer", 27, new Resolution(2540, 1440));
		
		Motherboard theMotherboard = new Motherboard("bj-200", "Asus", 4, 6, "v2.44");
		
//		creating PC class by passing previous variables defined by other classes
		PC thePc = new PC(theCase, theMonitor, theMotherboard);
		
		
//		the class can now access other class and thier specific methods
		thePc.getMonitor().drawPixelAt(1500, 1200, "red");
		thePc.getMotherboard().loadProgram("Windows 1.0");
		thePc.getTheCase().pressPowerButton();
	}
	

}
