package mccann.kevin.sumorproduct;

import java.util.Scanner;

/**
 * Created by kevinmccann on 1/12/17.
 */
public class Main {
    static Scanner scanner = new Scanner(System.in);
    static Display printer = new Display();
    static DoMath mather = new DoMath();
//    static Choice sumOrProduct = new Choice();

    public static void main(String args[]) {
        printer.printLine("Input a number!");
        int n = scanner.nextInt();
        scanner.nextLine();
        printer.printLine("Sum or Product?");
        String response = scanner.nextLine();
//        sumOrProduct.answer(response);
        if(response.equalsIgnoreCase("sum"))
            printer.printLine(mather.sum(n));
        else if(response.equalsIgnoreCase("product")) {
            long total = mather.product(n);
            if(total==0 && n != 0)
                printer.printLine("# too large!");
            printer.printLine(total);
        }
        else
            printer.printLine("That wasn't one of the options!");


    }
}
