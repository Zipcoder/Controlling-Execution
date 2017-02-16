/**
 * Created by danries on 2/16/17.
 */
class Controller {

    private IO io = new IO();
    private NumberCheck numberCheck = new NumberCheck();
    private int counter;
    private int lastGuess;

    void run(){

        int answer = (int)Math.ceil(Math.random()*20);
        boolean status = true;
        counter = 1;

        while(status){
            int guess = io.guessANumber();

            if (numberCheck.compareNumber(guess,answer).equals("high")){
                io.numberHigh();
                increaseCounter(lastGuess,guess);
            }
            else if (numberCheck.compareNumber(guess,answer).equals("low")){
                io.numberLow();
                increaseCounter(lastGuess,guess);
            }
            else if (numberCheck.compareNumber(guess,answer).equals("correct")){
                io.numberRight(counter);
                status = false;
            }

        }
    }

    private void increaseCounter(int previousGuess, int guess){
        if (previousGuess != guess){
            counter++;
        }
        lastGuess = guess;
    }

}
