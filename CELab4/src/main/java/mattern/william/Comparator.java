package mattern.william;

import com.sun.org.apache.xpath.internal.operations.Bool;

/**
 * Created by williammattern on 1/13/17.
 */
public class Comparator {
    int secretNumber;
    int currentUserNumber;
    int previousUserNumber;
    int numberOfGuesses = 1;

    public Boolean getIsUserNumberSameAsSecretNumber(int userNumber, int secretNumber){
        Prompter prompter = new Prompter();
        this.currentUserNumber = userNumber;
        this.secretNumber = secretNumber;
        if (currentUserNumber == secretNumber){
            return true;
        } else {
            if ((currentUserNumber == previousUserNumber) && (currentUserNumber < secretNumber)){
                prompter.sendUserGuessedTooLow();
                return false;
            } else if ((currentUserNumber == previousUserNumber) && (currentUserNumber > secretNumber)) {
                prompter.sendUserGuessedTooHigh();
                return false;
            } else if (currentUserNumber < secretNumber){
                numberOfGuesses++;
                previousUserNumber = currentUserNumber;
                prompter.sendUserGuessedTooLow();
                return false;
            } else {
                numberOfGuesses++;
                previousUserNumber = currentUserNumber;
                prompter.sendUserGuessedTooHigh();
                return false;
            }
        }
    }

    public int getNumberOfGuesses(){
        return numberOfGuesses;
    }
}
