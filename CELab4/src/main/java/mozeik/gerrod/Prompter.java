package mozeik.gerrod;

import java.util.Scanner;

/**
 * Created by gerrodmozeik on 1/13/17.
 */
public class Prompter {

    public int getUserGuess() {
        int userGuess;
        Scanner scanner = new Scanner(System.in);
        System.out.println("What do you think the number is?");
        userGuess = scanner.nextInt();
        System.out.println("You guessed: " + userGuess);
        return userGuess;
    }

    public void sendUserWon() {
        System.out.println("You win! It took you tries.");
    }

    public void sendUserLost() {
        int userGuess;
        Scanner scanner = new Scanner(System.in);
        System.out.println("You lost! Guess again.");
        userGuess = scanner.nextInt();
    }
}
