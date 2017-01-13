package mozeik.gerrod;

import com.sun.org.apache.xpath.internal.operations.Bool;

/**
 * Created by gerrodmozeik on 1/13/17.
 */
public class Comparator {

    int userNumber;
    int secretNumber;
    int numberOfGuesses;
    boolean isUserGuessSameAsSecretNumber;

    public boolean isUserGuessSameAsSecretNumber(int userNumber, int secretNumber) {
        if(userNumber == secretNumber) {
            return true;
        } else {
            numberOfGuesses++;
            return false;
        }

    }

    public int getNumberOfGuesses() {
        return numberOfGuesses;
    }
}
