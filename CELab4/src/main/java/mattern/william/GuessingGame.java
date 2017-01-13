package mattern.william;

/**
 * Created by williammattern on 1/12/17.
 */
public class GuessingGame {



    public static void main(String[] args) {
        int userGuess;
        SecretNumber secretNumber = new SecretNumber();

        secretNumber.setSecretNumber();
        System.out.println("secret number: " + secretNumber.getSecretNumber());

        Prompter prompter = new Prompter();
        userGuess = prompter.welcomeToNewGame();
    }
}
