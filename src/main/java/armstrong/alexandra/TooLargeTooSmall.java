package armstrong.alexandra;

import java.lang.reflect.Array;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by alexandraarmstrong on 1/12/17.
 */
public class TooLargeTooSmall {
    private Set<Integer> guessed;
    private int numberToBeGuessed;
    private int guessCount;
    private int guess;

    public TooLargeTooSmall(){
        guessed = new TreeSet<Integer>();
        numberToBeGuessed = (int) (Math.random() * 100);
        guessCount = 0;
    }

    public boolean isCorrect (int guess) {
        return numberToBeGuessed == guess;
    }

    public void incrementCount(){
        guessCount++;
    }

    public String highOrLow() {
        if (guess > numberToBeGuessed) {
            return "Too Large";
        } else if (guess < numberToBeGuessed) {
            return "Too Small";
        } else {
            return "How did you even get here?";
        }
    }

    public void guessIntake(){
        System.out.println("I'm sorry, try again");
        setGuess(InputHelper.intScanner());
    }

    public void setGuess(int guess){
        this.guess = guess;
    }

    public void addToSet(){
        guessed.add(guess);
    }

    public int getGuessCount(){
        return guessCount;
    }

    public int getGuess() {
        return guess;
    }

    public void displayGuessed(){
        for(Integer i : guessed){
            System.out.print(i + " ");
        }
    }

    public int getNumberToBeGuessed(){
        return numberToBeGuessed;
    }

}

