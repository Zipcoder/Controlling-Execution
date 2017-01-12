package mozeik.gerrod;

/**
 * Created by gerrodmozeik on 1/12/17.
 */
public class IntegerCalculator {

    int input;
    int output;

    public int calculate(int i) {

        if (input > 0) {
            for (i = 1; i <= input; i++) {
                output += 1;
            }

        } else if (input < 0) {
            for (i = 0; i <= input; i--) {
                output -= i;
            }
        } else {
            output = 0;
        }
    return output;
    }
}


