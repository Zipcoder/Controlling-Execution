package wolfe.michael.IntegerSummer;

/**
 * Created by michaelwolfe on 1/12/17.
 */
public class Calculate {

    public static int calculate(int n) {
        if (n > 0) {
            int total = ((n * n) + n) / 2;
            return total;
        } else {
            int total = 0;
            for (int count = n; count < 2; count++) {
                total += count;
            }
            return total;
        }

    }
}
