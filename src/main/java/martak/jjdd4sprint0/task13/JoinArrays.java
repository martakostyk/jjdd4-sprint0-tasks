package martak.jjdd4sprint0.task13;

import org.apache.commons.lang3.ArrayUtils;

import java.util.*;

public class JoinArrays {

    private Scanner scanner = new Scanner(System.in);

    public int[] join1(int[] array1, int[] array2) {

        int[] joined = ArrayUtils.addAll(array1, array2);

        return Arrays.stream(joined)
                .distinct()
                .boxed()
                .sorted((n1, n2) -> Integer.compare(n2, n1))
                .mapToInt(Integer::intValue)
                .toArray();
    }

    public int[] join2(int[] array1, int[] array2) {

        List<Integer> joined = new ArrayList<>();

        for (int i = 0; i < array1.length; i++) {
            if (!joined.contains(array1[i])) {
                joined.add(array1[i]);
            }
        }

        for (int i = 0; i < array2.length; i++) {
            if (!joined.contains(array2[i])) {
                joined.add(array2[i]);
            }
        }

        return joined.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .mapToInt(i -> i)
                .toArray();
    }

    public int[] getArray(String message) {

        int[] array;

        System.out.println(message);

        while (true) {
            try {
                System.out.println("Array size: ");
                array = new int[Integer.valueOf(scanner.next())];
                break;
            } catch (Exception e) {
                System.out.println("Given value is incorrect");
            }
        }

        for (int i = 0; i < array.length; i++) {
            while (true) {
                try {
                    System.out.println("Number" + i + ": ");
                    array[i] = Integer.valueOf(scanner.next());
                    break;
                } catch (Exception e) {
                    System.out.println("Given value is incorrect");
                }
            }
        }

        return array;
    }

    public static void main(String[] args) {
        JoinArrays joinArrays = new JoinArrays();
        int[] array1 = joinArrays.getArray("First array");
        int[] array2 = joinArrays.getArray("Second array");

        System.out.println(Arrays.toString(joinArrays.join1(array1, array2)));
    }
}
