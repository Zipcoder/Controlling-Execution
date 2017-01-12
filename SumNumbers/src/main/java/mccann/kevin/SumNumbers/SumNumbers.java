package mccann.kevin.SumNumbers;

import java.util.Scanner;

/**
 * Created by kevinmccann on 1/12/17.
 */
public class SumNumbers {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        Display printer = new Display();
        printer.printLine("Input a number!");
        int n = scanner.nextInt();
        DoMath mather = new DoMath();
        printer.printLine(mather.sum(n));
    }
}
