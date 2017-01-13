package mozeik.gerrod;

import java.util.Scanner;

/**
 * Created by gerrodmozeik on 1/12/17.
 */

public class Prompt {
    Scanner scanner = new Scanner(System.in);

    public int prompt() {
        System.out.println("Feed me a number.");
        return scanner.nextInt();
    }
}



