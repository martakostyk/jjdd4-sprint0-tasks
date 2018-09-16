package martak.jjdd4sprint0.task10;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Fraction {
	
	private int counter;
	private int denominator;
	private double value;
	
	public Fraction(int counter, int denominator) {
		this.counter = counter;
		this.denominator = denominator;
	}
	
	public void displayFraction() {
		
		if (denominator == 0) {
			throw new IllegalArgumentException("Cannot divide by zero");
		}
		
		value = BigDecimal.valueOf((double) counter / denominator).setScale(2,RoundingMode.HALF_UP).doubleValue();
		System.out.println(new StringBuilder(String.valueOf(value))
				.append(" [")
				.append(counter)
				.append("/")
				.append(denominator)
				.append("]").toString());
	}
	
	public static void main(String[] args) {
		Fraction fraction1 = new Fraction(1,2);
		fraction1.displayFraction();
		
		Fraction fraction2 = new Fraction(1,3);
		fraction2.displayFraction();
	}
	

}
