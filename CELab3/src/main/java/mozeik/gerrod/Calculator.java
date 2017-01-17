package mozeik.gerrod;

/**
 * Created by gerrodmozeik on 1/12/17.
 */
public class Calculator {

    int output;

    public int getSum(int input) {
        if (input >= 0) {
            for (int counter = 0; counter <= input; counter++) {
                output += counter;
            }
            return output;
        } else {
            for (int count = input; count < 2; count++) {
                output += count;
            }
            return output;

        }
    }

    public int getProduct(int input) {
        if (input >= 0) {
            output = 1;
            for (int counter = 1; counter <= input; counter++) {
              output *= counter;
            }
        } else {
            output = 0;
        }
        return output;
    }
}
