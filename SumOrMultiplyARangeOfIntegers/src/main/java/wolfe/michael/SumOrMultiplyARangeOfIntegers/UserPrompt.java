package wolfe.michael.SumOrMultiplyARangeOfIntegers;

import java.util.Scanner;

/**
 * Created by michaelwolfe on 1/13/17.
 */
public class UserPrompt {

    public static void prompt() {
        OperatorSelector selector = new OperatorSelector();
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter any whole number:");
        int number = keyboard.nextInt();
        System.out.print("Enter either add or multiply to perform a calculation:");
        String calcOperator = keyboard.next();
        selector.selectOperator(number, calcOperator);
        keyboard.close();
    }
}
