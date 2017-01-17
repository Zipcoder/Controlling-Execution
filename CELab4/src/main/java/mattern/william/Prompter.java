package mattern.william;

import java.util.Scanner;

/**
 * Created by williammattern on 1/13/17.
 */
public class Prompter {
    Scanner scanner = new Scanner(System.in);
    int userGuess;

    public int getUserGuess(){
        System.out.println("Welcome, please guess a number between 1 - 100");
        userGuess = scanner.nextInt();
        System.out.print("Your guess: " + userGuess + " ");
        return userGuess;
    }

    public void sendUserWon(int numberOfGuesses){
        System.out.println("Congrats, you win.");
        System.out.println("Tries: " + numberOfGuesses);
    }

    public int getNextUserGuess(){
        System.out.println("Please guess again");
        userGuess = scanner.nextInt();
        System.out.print("Your guess:" + userGuess + " ");
        return userGuess;
    }

    public void sendUserGuessedTooLow() {
        System.out.print("You guessed too low. ");
    }
    public void sendUserGuessedTooHigh() {
        System.out.print("You guessed too high. ");
    }
}
