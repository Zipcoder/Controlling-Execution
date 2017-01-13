package mccann.kevin.sumorproduct;

import static mccann.kevin.sumorproduct.Main.mather;

/**
 * Created by kevinmccann on 1/12/17.
 */
public class Choice {

    static Display printer = new Display();

    public long answer(String answer, int n) {
        if (answer.equalsIgnoreCase("sum"))
            return mather.sum(n);
        else if (answer.equalsIgnoreCase("product")) {
            long total = mather.product(n);
            if (total == 0 && n != 0)
                printer.printLine("# too large!");
            return mather.product(n);
        } else {
            printer.printLine("That wasn't one of the options!");
            return -1;
        }
    }
}
