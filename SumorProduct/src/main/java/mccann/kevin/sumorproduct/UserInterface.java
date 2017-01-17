package mccann.kevin.sumorproduct;

import java.util.Scanner;

/**
 * Created by kevinmccann on 1/13/17.
 */
public class UserInterface {
    private Scanner scanner = new Scanner(System.in);
    private Display printer = new Display();

    public int getNum() {
        printer.printLine("Input a number!");
        int n = scanner.nextInt();
        scanner.nextLine();
        return n;
    }

    public String getResponse() {
        printer.printLine("Sum or Product?");
        return scanner.nextLine();
    }

    }
