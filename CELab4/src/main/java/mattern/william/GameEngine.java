package mattern.william;

/**
 * Created by williammattern on 1/13/17.
 */
public class GameEngine {
    int secretNumber;
    int userNumber;
    int numberOfGuesses;
    Boolean winConditionMet;

    public void startGameEngine(){
        SecretNumberGenerator secretNumberGenerator = new SecretNumberGenerator();
        secretNumber = secretNumberGenerator.getSecretNumber();

        Prompter prompter = new Prompter();
        userNumber = prompter.getUserGuess();

        Comparator comparator = new Comparator();
        winConditionMet = comparator.getIsUserNumberSameAsSecretNumber(userNumber,secretNumber);
        System.out.println(winConditionMet);

        while (winConditionMet == false){
            prompter.sendUserLost();
            winConditionMet = comparator.getIsUserNumberSameAsSecretNumber(userNumber,secretNumber);
            prompter.sendUserWon();
            return;
        }


    }
}
