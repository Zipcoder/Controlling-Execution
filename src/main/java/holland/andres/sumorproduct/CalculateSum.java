package holland.andres.sumorproduct;

/**
 * Created by andresholland on 1/14/17.
 */
public class CalculateSum {

    public int getSum () {
        AskUserNumber askUserNumber = new AskUserNumber();
        int number = askUserNumber.getInput();
        int sum = 0;
        for (int current = number; current > 0; current --) {
            sum += current;
        }
        return sum;
    }
}
