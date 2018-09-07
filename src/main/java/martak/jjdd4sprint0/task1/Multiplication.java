package martak.jjdd4sprint0.task1;

import java.util.Scanner;

public class Multiplication {

    private Scanner scanner = new Scanner(System.in);

    public int multiply(int numA, int numB) {
        return numA * numB;
    }

    public int multiply2(int numA, int numB) {
        return Math.multiplyExact(numA, numB);
    }

    public int multiply3(int numA, int numB) {
        int result = 0;
        for (int i = 0; i < Math.abs(numB); i++) {
            result += Math.abs(numA);
        }
        if ((numA < 0 && numB > 0) || (numA > 0 && numB < 0)) {
            return result * (-1);
        }
        return result;
    }

    public int getNumber(String message) {
        while (true) {
            try {
                System.out.println(message + " number: ");
                return Integer.valueOf(scanner.next());
            } catch (NumberFormatException e) {
                System.out.println("Number is incorrect. Try again.");
            }
        }
    }

    public static void main(String[] args) {

        Multiplication multiplication = new Multiplication();

        int numA = multiplication.getNumber("First");
        int numB = multiplication.getNumber("Second");

        System.out.println("Result of multiplication: " + multiplication.multiply(numA, numB));
        System.out.println("Result of multiplication: " + multiplication.multiply2(numA, numB));
        System.out.println("Result of multiplication: " + multiplication.multiply3(numA, numB));
    }
}
