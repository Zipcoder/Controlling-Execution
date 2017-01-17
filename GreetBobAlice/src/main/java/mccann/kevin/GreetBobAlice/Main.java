package mccann.kevin.GreetBobAlice;

import java.util.Scanner;

/**
 * Created by kevinmccann on 1/12/17.
 */
public class Main {

    public static void main(String args[]) {
        Display printer = new Display();
        Scanner scanner = new Scanner(System.in);
        printer.printToScreen("What is your name?");
        String n = scanner.nextLine();
        NameCheck nameCheck = new NameCheck();
        if (nameCheck.check(n))
            printer.printToScreen("Greetings! Enter!");
        else
            printer.printToScreen("No, no, no");
    }
}
