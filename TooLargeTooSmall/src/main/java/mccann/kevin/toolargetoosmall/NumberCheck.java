package mccann.kevin.toolargetoosmall;

import static mccann.kevin.toolargetoosmall.RandomNumber.*;

/**
 * Created by kevinmccann on 1/12/17.
 */
public class NumberCheck {
    static Display printer = new Display();

    public void check(int userNum, int randNum) {
        if(userNum > randNum) {
            printer.printLine("Number Too Large! Try Again!");
            TriesCounter.addOne();
        }
        else if(userNum < randNum) {
            printer.printLine("Number Too Small! Try Again!");
            TriesCounter.addOne();
        }
        else {
            printer.printLine("You Got It!");
            printer.printLine(TriesCounter.getCounter());
        }
    }
}
