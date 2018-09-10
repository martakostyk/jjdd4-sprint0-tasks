package martak.jjdd4sprint0.task6;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class Fibonacci {

    private Logger LOG = LoggerFactory.getLogger(Fibonacci.class);

    private Scanner scanner = new Scanner(System.in);

    public int getNumber() {

        while (true) {
            try {
                System.out.println("Number: ");
                int number = Integer.valueOf(scanner.next());
                if (number < 0) {
                    LOG.info("Given number is less than zero");
                    continue;
                }
                return number;
            } catch (Exception e) {
                LOG.info("Given number is incorrect");
            }
        }
    }

    public long fibonacciValue(int number) {

        switch (number) {
            case 0:
                return 0;
            case 1:
                return 1;
            default:
                return fibonacciValue(number - 1) + fibonacciValue(number - 2);
        }
    }
}
