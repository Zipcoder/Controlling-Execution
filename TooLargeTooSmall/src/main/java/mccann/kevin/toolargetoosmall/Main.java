package mccann.kevin.toolargetoosmall;

import java.util.Scanner;

/**
 * Created by kevinmccann on 1/12/17.
 */
public class Main {
    static Scanner scanner = new Scanner(System.in);
    static Display printer = new Display();
    static RandomNumber theNumber = new RandomNumber();
    static UserInput UI = new UserInput();
    static NumberCheck numberCheck = new NumberCheck();

    public static void main(String args[]) {
        int randNum = theNumber.getRand();
        int userNum;
        do {
            userNum = UI.getUserNumber();
            numberCheck.check(userNum, randNum);
        } while (userNum != randNum);
    }
}
