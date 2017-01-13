package mccann.kevin.SumNumbers;

import java.util.Scanner;

/**
 * Created by kevinmccann on 1/13/17.
 */
public class UserInterface {
    public int getInput () {
        Scanner scanner = new Scanner(System.in);
        Display printer = new Display();
        printer.printLine("Input a number!");
        return scanner.nextInt();
    }
}
