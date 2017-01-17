package mozeik.gerrod;

import java.util.Scanner;

/**
 * Created by gerrodmozeik on 1/12/17.
 */
public class Prompter {
    int userNumber;
    char functionCode;
    Scanner scanner = new Scanner(System.in);

    public int getUserNumber() {
        System.out.println("Give me a number.");
        return scanner.nextInt();
    }

    public char getFunctionCode() {
        System.out.println("(S)um or (P)roduct?");
        return scanner.next().charAt(0);
    }
}
