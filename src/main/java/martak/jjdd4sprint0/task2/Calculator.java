package martak.jjdd4sprint0.task2;

import java.util.Scanner;

public class Calculator {

    private Scanner scanner = new Scanner(System.in);

    public void displayMenu() {

        System.out.println("Available operations: ");

        for (MathOperation operation : MathOperation.values()) {
            System.out.println(operation.getValue() + ". " + operation);
        }
    }

    public MathOperation getChoice() {

        while (true) {

            try {

                System.out.println("Select operation: ");

                switch (Integer.valueOf(scanner.next())) {
                    case 1:
                        return MathOperation.SUM;
                    case 2:
                        return MathOperation.SUBTRACT;
                    case 3:
                        return MathOperation.MULTIPLY;
                    case 4:
                        return MathOperation.DIVIDE;
                    default:
                        System.out.println("No operation has been selected. Please enter correct number");
                }

            } catch (Exception e) {
                System.out.println("Given value is incorrect. Please enter correct number");
            }
        }
    }

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        calculator.displayMenu();
        MathOperation choice = calculator.getChoice();
    }
}
