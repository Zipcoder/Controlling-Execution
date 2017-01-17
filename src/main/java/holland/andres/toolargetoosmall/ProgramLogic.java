package holland.andres.toolargetoosmall;

public class ProgramLogic {

    public void programLogic () {
        AskUser currentInput = new AskUser();
        TellUserStatus currentStatus = new TellUserStatus();
        int currentGuess = 0;
        int lastGuess = 0;
        int numberOfGuesses = 1;
        boolean gameIsRunning = true;
        while (gameIsRunning) {
            if (currentGuess != lastGuess) {
                numberOfGuesses ++;
            }
            lastGuess = currentGuess;
            currentGuess = currentInput.getInput();
            gameIsRunning = currentStatus.tellUserStatus(currentGuess);
        }
        System.out.println("Finally, the game is over. You had " + numberOfGuesses + " attempts.");
    }
}
