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
                int number = Integer.valueOf(scanner.next());
                if (number <= 0) {
                    LOG.info("Given number is equal or less than zero");
                    continue;
                }
                return number;
            } catch (Exception e) {
                LOG.warn("Given number is incorrect");
            }
        }
    }

    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        System.out.println(fibonacci.getNumber());
    }
}
