package mozeik.gerrod;

/**
 * Created by gerrodmozeik on 1/12/17.
 */
public class IntegerCalculator {

    int output;
    int counter;

    public int calculate(int input) {
        if (input >= 0) {
            for (int counter = 0; counter < input; counter++) {
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
}

