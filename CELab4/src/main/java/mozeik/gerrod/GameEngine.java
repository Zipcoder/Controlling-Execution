package mozeik.gerrod;

/**
 * Created by gerrodmozeik on 1/13/17.
 */
public class GameEngine {

    int userNumber;
    int secretNumber;
    boolean winConditionMet;
    int numberOfGuesses;


    public void startGameEngine() {
        SecretNumberGenerator secretNumberGenerator = new SecretNumberGenerator();
        secretNumber = secretNumberGenerator.getSecretNumber();

        Prompter prompter = new Prompter();
        userNumber = prompter.getUserGuess();

        Comparator comparator = new Comparator();
        winConditionMet = comparator.isUserGuessSameAsSecretNumber(userNumber, secretNumber);

        while (!winConditionMet){
            userNumber = prompter.getNextUserGuess();
            winConditionMet = comparator.isUserGuessSameAsSecretNumber(userNumber, secretNumber);
        }

        numberOfGuesses = comparator.getNumberOfGuesses();
        prompter.sendUserWon(numberOfGuesses);

    }
}
