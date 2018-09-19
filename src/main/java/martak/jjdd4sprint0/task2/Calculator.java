package martak.jjdd4sprint0.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Calculator {

    private Scanner scanner = new Scanner(System.in);

    public void displayMenu() {

        System.out.println("Available operations: ");

        for (MathOperation operation : MathOperation.values()) {
            System.out.println(operation.getValue() + ". " + operation);
        }
    }

    public MathOperation getOperation() {

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

    public int getNumberOfParameters() {

        while (true) {
            try {
                System.out.println("Number of parameters: ");
                int input = Integer.valueOf(scanner.next());
                if (input <= 1) {
                    System.out.println("Value has to be bigger than 1");
                } else {
                    return input;
                }
            } catch (Exception e) {
                System.out.println("Given value is incorrect. Please enter correct value");
            }
        }
    }

    public double getParameter() {

        while (true) {
            try {
                System.out.println("Enter parameter: ");
                return Double.valueOf(scanner.next());
            } catch (Exception e) {
                System.out.println("Given value is incorrect. Please enter correct value");
            }
        }
    }

    public void calculate(MathOperation mathOperation, List<Double> parameters) {

        String arithmeticOperator = null;
        double result = 0;

        switch (mathOperation) {
            case SUM:
                arithmeticOperator = "+";
                result = sum(parameters);
                break;
            case SUBTRACT:
                arithmeticOperator = "-";
                result = subtract(parameters);
                break;
            case MULTIPLY:
                arithmeticOperator = "*";
                result = multiply(parameters);
                break;
            case DIVIDE:
                arithmeticOperator = "/";
                result = divide(parameters);
                break;
        }

        System.out.println("Operation: " + parameters
                .stream()
                .map(String::valueOf)
                .collect(Collectors.joining(arithmeticOperator)));

        System.out.println("Result: " + result);
    }

    private double sum(List<Double> parameters) {

        double result = parameters.get(0);
        for (int i = 1; i < parameters.size(); i++) {
            result += parameters.get(i);
        }
        return result;
    }

    private double subtract(List<Double> parameters) {

        double result = parameters.get(0);
        for (int i = 1; i < parameters.size(); i++) {
            result -= parameters.get(i);
        }
        return result;
    }

    private double multiply(List<Double> parameters) {

        double result = parameters.get(0);
        for (int i = 1; i < parameters.size(); i++) {
            result *= parameters.get(i);
        }
        return result;
    }

    private double divide(List<Double> parameters) {

        double result = parameters.get(0);
        for (int i = 1; i < parameters.size(); i++) {
            if (parameters.get(i) == 0) {
                throw new IllegalArgumentException("Cannot divide by zero");
            }

            result /= parameters.get(i);
        }
        return result;
    }

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        calculator.displayMenu();

        MathOperation operation = calculator.getOperation();

        int numOfParameters = calculator.getNumberOfParameters();
        List<Double> parameters = new ArrayList<>();

        for (int i = 0; i < numOfParameters; i++) {
            parameters.add(calculator.getParameter());
        }

        calculator.calculate(operation, parameters);
    }
}
