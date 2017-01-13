package mozeik.gerrod;

import java.util.Scanner;

/**
 * Created by gerrodmozeik on 1/13/17.
 */
public class Prompter {

    public int getUserGuess() {
        int userGuess;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please guess a number between 1 and 100.");
        userGuess = scanner.nextInt();
        System.out.print("You guessed: " + userGuess + ". ");
        return userGuess;
    }

    public void sendUserWon(int numberOfGuesses) {
        System.out.println("You win! It took you " + numberOfGuesses + " tries.");
    }

    public void sendUserLost() {
        System.out.println("You lost! Guess again.");
    }

    public int getNextUserGuess() {
        System.out.println("You lost! Guess again.");
        Scanner scanner = new Scanner(System.in);
        int userGuess = scanner.nextInt();
        System.out.print("You guessed: " + userGuess + ". ");
        return userGuess;
    }

    public void userGuessedTooLow() {
        System.out.print("Your guess was too low. ");
    }

    public void userGuessedTooHigh() {
        System.out.print("Your guess was too high. ");
    }
}

