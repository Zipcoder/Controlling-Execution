package wolfe.michael.TooLargeTooSmall;

import java.util.Random;

/**
 * Created by michaelwolfe on 1/13/17.
 */
public class GameEngine{

    UserPrompt prompter = new UserPrompt();
    int secretNumber;
    int currentAttempt;
    int previousAttempt;
    int attempts = 0;

    public void startGame(){
        Random rand = new Random();
        this.secretNumber = rand.nextInt(50) + 1;
    }

    public boolean checkUserGuess(){
        this.currentAttempt = prompter.prompt();
        if (attempts == 0){
            if (currentAttempt == secretNumber){
                this.attempts++;
                return true;
            } else {
                this.previousAttempt = currentAttempt;
                this.attempts++;
                prompter.tooHighOrTooLow(currentAttempt, secretNumber);
                return false;
            }
        } else {
            if (currentAttempt == secretNumber) {
                this.attempts++;
                return true;
            } else {
                if (currentAttempt != previousAttempt){
                    this.attempts++;
                    prompter.tooHighOrTooLow(currentAttempt, secretNumber);
                    return false;
                } else {
                    prompter.tooHighOrTooLow(currentAttempt, secretNumber);
                    return false;
                }
            }
        }
    }

    public void endGame(){
        System.out.println("Congratulations, you guessed " + this.secretNumber + " correctly in " + this.attempts + " attempts.");
    }
}
