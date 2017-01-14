package wolfe.michael.AliceAndBobGreeting;

import java.util.Scanner;

/**
 * Created by michaelwolfe on 1/13/17.
 */
public class UserPrompt {
    public static void prompt(){
        AliceAndBobChecker checker = new AliceAndBobChecker();
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please input your first name: ");
        String name = keyboard.next();
        checker.checkName(name);
        keyboard.close();
    }
}
