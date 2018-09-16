package martak.jjdd4sprint0.task11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

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
	
	public String convertToHexadecimalSystem(int number) {
		
		int result = number;
		List<Integer> hexadecimalSystem = new ArrayList<>();
		
		while (result != 0) {
			hexadecimalSystem.add(result % 16);
			result = result / 16;
		}
		
		StringBuilder string = new StringBuilder();
		
		for (int i = hexadecimalSystem.size() - 1; i >= 0; i--) {
			switch(hexadecimalSystem.get(i)) {
			case 10: 
				string.append("A");
				break;
			case 11:
				string.append("B");
				break;
			case 12:
				string.append("C");
				break;
			case 13:
				string.append("D");
				break;
			case 14:
				string.append("E");
				break;
			case 15:
				string.append("F");
				break;
			default:
				string.append(hexadecimalSystem.get(i));
				break;
			}
		}
		
		return string.toString();
		
	}
	
	public static void main(String[] args) {
		
		ConvertNumberSystems converter = new ConvertNumberSystems();
		
		int toBinary = converter.getNumber();
		System.out.println(converter.convertToBinarySystem(toBinary));
		
		int toHexadecimal = converter.getNumber();
		System.out.println(converter.convertToHexadecimalSystem(toHexadecimal));
	}

}
