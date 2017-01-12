package mccann.kevin.GreetBobAlice;

import java.util.Scanner;

/**
 * Created by kevinmccann on 1/12/17.
 */
public class Main {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String n = scanner.nextLine();
        NameCheck nameCheck = new NameCheck();
        if (nameCheck.check(n))
            System.out.println("Greetings! Enter!");
        else
            System.out.println("No, no, no");
    }
}
