package martak.jjdd4sprint0.task9;

import java.util.Arrays;

public class BubbleSorting {

    public int[] sort(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {

            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }

            System.out.println(Arrays.toString(array));
        }

        return array;
    }

    public static void main(String[] args) {

        BubbleSorting bubbleSorting = new BubbleSorting();
        bubbleSorting.sort(new int[]{10, 6, -2, 5, 0, 11, -5, 19, -23, 7, -50});
    }
}
