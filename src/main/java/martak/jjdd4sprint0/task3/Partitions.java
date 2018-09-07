package martak.jjdd4sprint0.task3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Partitions {

    private Scanner scanner = new Scanner(System.in);

    private int getParameter(String message) {

        while (true) {
            try {
                System.out.println(message);
                return scanner.nextInt();
            } catch (NumberFormatException e) {
                System.out.println("Value is incorrect. Try again.");
            }
        }
    }

    public static void main(String[] args) {

        Partitions partitions = new Partitions();

        int numOfNumbers = partitions.getParameter("Number of numbers: ");
        int numOfPartitions = partitions.getParameter("Number of partitions: ");
        int rangeOfNumbers = partitions.getParameter("Range of numbers: ");

        int rangeForOnePartition = rangeOfNumbers / numOfPartitions;

        List<List<Integer>> listOfPartitions = new ArrayList<>();
        for (int i = 0; i < numOfPartitions; i++) {
            listOfPartitions.add(new ArrayList<>());
        }

        Random random = new Random();

        for (int i = 0; i < numOfNumbers; i++) {
            int randomNum = random.nextInt(rangeOfNumbers) + 1;
            for (int j = 0; j < numOfPartitions; j++) {
                if (randomNum / rangeForOnePartition == j) {
                    listOfPartitions.get(j).add(randomNum);
                }
            }
        }

        for (int i = 0; i < numOfPartitions; i++) {
            System.out.println("Partition "
                    + (i + 1)
                    + "(range " + (1 + i * rangeForOnePartition)
                    + " - " + (i + 1) * rangeForOnePartition
                    + ")");

            System.out.println(listOfPartitions
                    .get(i)
                    .stream()
                    .map(String::valueOf)
                    .collect(Collectors.joining(", ")));
        }
    }


}
