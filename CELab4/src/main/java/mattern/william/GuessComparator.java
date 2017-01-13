package mattern.william;

/**
 * Created by williammattern on 1/12/17.
 */
public class GuessComparator {
    int previousGuess;
    int currentGuess;
    int secretNumber;

     public Boolean guessComparison(int currentGuess){
         this.currentGuess = currentGuess;
         if (currentGuess == secretNumber){
             return true;
         } else {
             return false;
         }
     }

     public void setSecretNumber(int secretNumber){
         this.secretNumber = secretNumber;
     }
}
