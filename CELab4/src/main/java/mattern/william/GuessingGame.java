package mattern.william;

/**
 * Created by williammattern on 1/12/17.
 */
public class GuessingGame {



    public static void main(String[] args) {
        int userGuess;
        SecretNumber secretNumber = new SecretNumber();
        GuessComparator guessComparator = new GuessComparator();
        GuessCounter guessCounter = new GuessCounter();

        secretNumber.setSecretNumber();
        System.out.println("secret number: " + secretNumber.getSecretNumber());

        Prompter prompter = new Prompter();
        userGuess = prompter.welcomeToNewGame();


        guessComparator.setSecretNumber(secretNumber.getSecretNumber());
        if(guessComparator.guessComparison(userGuess)) {
            System.out.println("You Win on your first try");
        }
        while (secretNumber.getSecretNumber() != userGuess){
            if(guessComparator.guessComparison(userGuess)){
                System.out.println("You Win");
                System.out.println("It took you " + guessCounter.getCountOfGuesses() +  " guesses to win.");
                return;
            } else {
                guessCounter.addOneToCountOfGuesses();
                userGuess = prompter.getNextUserGuess();
                System.out.println(userGuess);
                System.out.println(secretNumber.getSecretNumber());
        }
            System.out.println("You Win");
            System.out.println("It took you " + guessCounter.getCountOfGuesses() +  " guesses to win.");

        }
    }
}
