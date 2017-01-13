package mattern.william;

import java.util.Scanner;

/**
 * Created by williammattern on 1/13/17.
 */
public class Prompter {
    Scanner scanner = new Scanner(System.in);
    int userGuess;

    public int getUserGuess(){
        System.out.println("Welcome, please guess a number");
        userGuess = scanner.nextInt();
        System.out.println("Your guess:" + userGuess);
        return userGuess;
    }

    public void sendUserWon(){
        System.out.println("Congrats, you win.");
    }

    public void sendUserLost(){
        System.out.println("Sorry, you lose, guess again");
        userGuess = scanner.nextInt();
        System.out.println("Your guess:" + userGuess);
    }
}
