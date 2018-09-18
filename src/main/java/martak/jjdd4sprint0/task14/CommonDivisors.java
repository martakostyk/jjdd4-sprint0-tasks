package martak.jjdd4sprint0.task14;

import java.util.ArrayList;
import java.util.List;

public class CommonDivisors {

    public List<Integer> getCommonDivisors(int numA, int numB) {

        if (numA < numB) {
            int temp = numA;
            numA = numB;
            numB = temp;
        }

        int gcd = 0;
        while (numB != 0) {
            gcd = numB;
            numB = numA % numB;
            numA = gcd;
        }

        List<Integer> divisors = new ArrayList<>();

        for (int i = 1; i <= gcd; i++) {
            if (gcd % i == 0) {
                divisors.add(i);
            }
        }

        return divisors;
    }
}
