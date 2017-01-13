package armstrong.alexandra;

import armstrong.alexandra.TooLargeTooSmall;
/**
 * Created by alexandraarmstrong on 1/13/17.
 */
public class GameController {
    public static void main (String[] args){
        TooLargeTooSmall game = new TooLargeTooSmall();
        System.out.println("Hello, and welcome to this edition of Too Large or Too Small!");
        System.out.println("Please enter your first guess!");
        game.setGuess(InputHelper.intScanner());
        System.out.println(game.getGuess());
        while (!game.isCorrect(game.getGuess())){
            game.incrementCount();
            System.out.println(game.highOrLow());
            game.addToSet();
            game.guessIntake();
        }
        System.out.println("Congratulations, it took you " + game.getGuessCount() + " tries to guess the number!");
        System.out.print("These were the numbers you guessed: ");
        game.displayGuessed();
    }

}
