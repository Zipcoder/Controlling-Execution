package mattern.william;

import java.util.Scanner;

/**
 * Created by williammattern on 1/12/17.
 */
public class Prompter {
    int userGuess;
    Scanner scanner = new Scanner(System.in);

    public int welcomeToNewGame(){
        System.out.println("Welcome to the secret number game");

        System.out.println("Please guess a whole number between 1 - 100");
        userGuess = scanner.nextInt();
        System.out.println("Your guess is: " + userGuess);
        return userGuess;
    }

    public int getNextUserGuess() {
        System.out.println("Please guess a number");
        userGuess = scanner.nextInt();
        return userGuess;
    }
}
