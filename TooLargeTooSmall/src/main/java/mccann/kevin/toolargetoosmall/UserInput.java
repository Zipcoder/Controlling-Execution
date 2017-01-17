package mccann.kevin.toolargetoosmall;

import java.util.Scanner;

/**
 * Created by kevinmccann on 1/12/17.
 */
public class UserInput {
    static Scanner scanner = new Scanner(System.in);
    static Display printer = new Display();


    public int getUserNumber() {
        printer.printLine("What is your guess?");
        int n = scanner.nextInt();
        return n;
    }

}
