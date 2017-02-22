package ControllingExecution;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by randallcrame on 1/13/17.
 */
public class TooLargeTooSmall {
    Scanner input = new Scanner(System.in);
    Random createRandom = new Random();

    private int previousGuess = 0;
    private int guessCounter = 1;
    private int answer = createRandom.nextInt(10) + 1;
    private int currentGuess;

     private void getUserNumber(){
        System.out.print("Guess a number between 1 - 10: ");
        currentGuess = input.nextInt();
    }

    private void numberOfGuesses( int currentGuess, int previousGuess){
        if (currentGuess != previousGuess) {
            this.guessCounter++;
        }
    }

    private void checkGuess (int currentGuess, int answer){
        if (currentGuess < answer)
            System.out.println("Your number " + currentGuess + " was too low");
        else
            System.out.println("Your number " + currentGuess + " was too high");
    }

    public void tooLargeTooSmallGame(){
        this.getUserNumber();
        while (currentGuess != answer) {
            this.numberOfGuesses(currentGuess, previousGuess);
            this.checkGuess(currentGuess, answer);
            previousGuess = currentGuess;
            this.getUserNumber();
        }
        this.numberOfGuesses(currentGuess, answer);
        System.out.println("You got the number in " + guessCounter + " tries!");
    }
    public static void  main (String [] args){
        TooLargeTooSmall myNumber = new TooLargeTooSmall();
        myNumber.tooLargeTooSmallGame();
    }

}
