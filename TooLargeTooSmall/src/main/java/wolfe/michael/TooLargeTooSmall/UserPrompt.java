package wolfe.michael.TooLargeTooSmall;

import java.util.Scanner;

/**
 * Created by michaelwolfe on 1/13/17.
 */
public class UserPrompt {
    public static int prompt(){
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please guess a number between 1 and 50: ");
        return keyboard.nextInt();

    }

    public void tooHighOrTooLow(int guess, int secret){
        if (guess > secret)
            System.out.println("You guessed TOO HIGH.");
        else
            System.out.println("You guessed TOO LOW.");
    }
}
