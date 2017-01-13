package mattern.william;

import com.sun.org.apache.xpath.internal.operations.Bool;

/**
 * Created by williammattern on 1/13/17.
 */
public class Comparator {
    int userNumber;
    int secretNumber;
    int numberOfGuesses;
    Boolean isSecretNumberSameAsUserGuess;

    public Boolean getIsUserNumberSameAsSecretNumber(int userNumber, int secretNumber){
        if (userNumber == secretNumber){
            return true;
        } else {
            numberOfGuesses++;
            return false;
        }
    }

    public int getNumberOfGuesses(){
        return numberOfGuesses;
    }
}
