import java.math.BigDecimal;

public class Calculator<T extends BigDecimal> {
	
	
	public BigDecimal add(T num1, T num2) {
		return num1.add(num2);
	}
	
	public BigDecimal subtract(T num1, T num2) {
		return num1.subtract(num2);
	}


	public static void main(String[] args) {
		
		Calculator<BigDecimal> c1 = new Calculator<BigDecimal>();
		
		BigDecimal b1 = c1.add(BigDecimal.valueOf(10), BigDecimal.valueOf(15));
		BigDecimal b2 = c1.add(BigDecimal.valueOf(10.5), BigDecimal.valueOf(15.4));
		BigDecimal b3 = c1.subtract(BigDecimal.valueOf(15), BigDecimal.valueOf(10));
		BigDecimal b4 = c1.subtract(BigDecimal.valueOf(15.5), BigDecimal.valueOf(10.5));
		
		
		System.out.println("Adding Integers result is " + b1);
		System.out.println("Adding Floats result is " + b2);
		System.out.println("Subtracting Integers result is " + b3);
		System.out.println("Subtracting Floats result is " + b4);
		

	}

}
