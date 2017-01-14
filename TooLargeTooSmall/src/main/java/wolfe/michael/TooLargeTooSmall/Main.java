package wolfe.michael.TooLargeTooSmall;

/**
 * Created by michaelwolfe on 1/13/17.
 */
public class Main{

    public static void main(String[] args){
        boolean winning = false;
        GameEngine game = new GameEngine();
        game.startGame();
        while (!winning) {
            winning = game.checkUserGuess();
        }
        game.endGame();
    }
}
