package wolfe.michael.IntegerSummer;

import java.util.Scanner;

/**
 * Created by michaelwolfe on 1/12/17.
 */
public class UserPrompt extends Calculate {
    Scanner keyboard = new Scanner(System.in);

    public void prompt() {
        System.out.print("Enter any whole number:");
        int number = keyboard.nextInt();
        calculate(number);
    }


}
