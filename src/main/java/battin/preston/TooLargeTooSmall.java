package battin.preston;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * Created by prestonbattin on 2/16/17.
 */
public class TooLargeTooSmall {

    private final int secretNumber;
    private int tries = 0;
    private Set<Integer> guessedNumbers = new HashSet<Integer>();


    TooLargeTooSmall(){

        Random rand = new Random();
        secretNumber = rand.nextInt(100);

    }

    public void guessNumber(int guess){

        if(guess == secretNumber){
            tries++;
            correctNumberGuessed();

        }

       else if(guessedNumbers.contains(guess)){

            numberAlreadyGuessed();
        }

        else if(guess > secretNumber && guessedNumbers.contains(guess) == false){

            guessedNumbers.add(guess);
            tries++;
           numberTooLarge();
        }

        else if(guess < secretNumber && guessedNumbers.contains(guess) == false){

            guessedNumbers.add(guess);
            tries++;
            numberTooSmall();
        }
        else{

            guessedNumbers.add(guess);
            tries++;

        }



    }

    public String numberTooLarge(){

        return "You guessed too high!";
    }

    public String numberTooSmall(){

        return "you guessed too low!";
    }

    public String correctNumberGuessed(){

        return "You guessed the secret number " + secretNumber + " in " + tries + " tries!";

    }

    public String numberAlreadyGuessed(){

        return "Number already guessed, pick another number";
    }

    public int getSecretNumber() {
        return secretNumber;
    }

    public int getTries() {
        return tries;
    }
}
