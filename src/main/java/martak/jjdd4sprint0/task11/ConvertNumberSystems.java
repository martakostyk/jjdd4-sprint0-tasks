package martak.jjdd4sprint0.task11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConvertNumberSystems {
	
	private Scanner scanner = new Scanner(System.in);
	
	public int getNumber() {
		
		while(true) {
			try {
				System.out.println("Number to convert: ");
				return Integer.valueOf(scanner.next());
			} catch (NumberFormatException e) {
				System.out.println("Number is invalid. Try again.");
			}
		}
	}
	
	public int convertToBinarySystem(int number) {
		
		int result = number;
		List<Integer> binarySystem = new ArrayList<>();
		
		while (result != 0) {
			binarySystem.add(result % 2);
			result = result / 2;
		}
		
		int convertedNumber = 0;
		for (int i = binarySystem.size() - 1; i >= 0; i--) {
			convertedNumber += binarySystem.get(i) * Math.pow(10, i);
		}
		
		return convertedNumber;
	}
	
	public static void main(String[] args) {
		
		ConvertNumberSystems converter = new ConvertNumberSystems();
		
		int number = converter.getNumber();
		System.out.println(converter.convertToBinarySystem(number));
	}

}
