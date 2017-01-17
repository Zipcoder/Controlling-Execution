package mozeik.gerrod;

/**
 * Created by gerrodmozeik on 1/13/17.
 * Worked with Bill Mattern on this.
 * GameEngine calls SecretNumberGenerator to create the secret number.
 * It then uses Prompter to ask the user for their guess.
 * Comparator compares the user's guess to the secret number and returns the result of the comparison to Prompter
 * to display the result.
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
