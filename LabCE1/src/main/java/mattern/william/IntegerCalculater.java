package mattern.william;

/**
 * Created by williammattern on 1/12/17.
 */
public class IntegerCalculater {
    int input;
    int output;

    public int calculate(int i) {
        if (input > 1) {
            for (i = 1; i <= i; i++) {
                output += i;

            }
        } else if (input < 0) {
            for (i = 0; i < input; i--) {
                output -= i;

            }
        } else {
            output = 0;
        }
        return output;
    }
}