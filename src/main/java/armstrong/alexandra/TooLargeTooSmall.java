package armstrong.alexandra;

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

    /*public boolean isRepeatGuess(int guess){
        return guessed.contains(guess);
    }*/

    public boolean isCorrect (int guess) {
        return numberToBeGuessed == guess;
    }

    public void incrementCount(){
        guessCount++;
    }

    public String highOrLow(int guess) {
        if (guess > numberToBeGuessed) {
            return "Too Large";
        } else if (guess < numberToBeGuessed) {
            return "Too Small";
        } else {
            return "How did you even get here?";
        }
    }

    public void gameController(int guess){

    }

}

