package mozeik.gerrod;

import java.util.Scanner;

/**
 * Created by gerrodmozeik on 1/12/17.
 */
public class Prompter {
    Scanner scanner = new Scanner(System.in);

    public String getUserName() {
        System.out.println("What's your name?");
        return scanner.next();
    }
}
