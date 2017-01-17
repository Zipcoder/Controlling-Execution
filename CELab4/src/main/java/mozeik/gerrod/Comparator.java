package mozeik.gerrod;

import com.sun.org.apache.xpath.internal.operations.Bool;

/**
 * Created by gerrodmozeik on 1/13/17.
 */
public class Comparator {

    int currentUserNumber;
    int previousUserNumber;
    int secretNumber;
    int numberOfGuesses = 1;

    public boolean isUserGuessSameAsSecretNumber(int userNumber, int secretNumber) {
        Prompter prompter = new Prompter();
        this.currentUserNumber = userNumber;
        this.secretNumber = secretNumber;
        if (currentUserNumber == secretNumber) {
            return true;
        } else {
            if ((currentUserNumber == previousUserNumber) && (currentUserNumber < secretNumber)) {
                prompter.userGuessedTooLow();
                return false;
            } else if ((currentUserNumber == previousUserNumber) && (currentUserNumber > secretNumber)) {
                prompter.userGuessedTooHigh();
                return false;
            }
            else if (currentUserNumber < secretNumber) {
                numberOfGuesses++;
                previousUserNumber = currentUserNumber;
                prompter.userGuessedTooLow();
                return false;
            } else {
                numberOfGuesses++;
                previousUserNumber = currentUserNumber;
                prompter.userGuessedTooHigh();
                return false;

            }

        }

    }

    public int getNumberOfGuesses() {
        return numberOfGuesses;
    }
}
