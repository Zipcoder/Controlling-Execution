package wolfe.michael.SumOrMultiplyARangeOfIntegers;

/**
 * Created by michaelwolfe on 1/13/17.
 */
public class Calculate {

    public static int calculateSum(int n) {

        if (n > 0) {
            int total = ((n * n) + n) / 2;
            System.out.println("The sum of integers from 1 to " + n + " is " + total + ".");
            return total;
        } else {
            int total = 0;
            for (int count = n; count < 2; count++) {
                total += count;
            }
            System.out.println("The sum of integers from " + n + " to 1 is " + total + ".");
            return total;
        }
    }

    public static int calculateProduct(int n) {

        int total = 1;
        if (n > 0) {
            for (int count = 1; count <= n; count++) {
                total = total * count;
            }
            System.out.println("The factorial of " + n + " is " + total + ".");
            return total;
        } else
            System.out.println("The product of any number multiplied by zero is zero.");
            return 0;
    }
}
