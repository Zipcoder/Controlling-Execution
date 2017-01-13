package mattern.william;

/**
 * Created by williammattern on 1/12/17.
 */
public class GuessCounter {
    int countOfGuesses = 0;

    public void addOneToCountOfGuesses(){
        countOfGuesses++;
    }

    public int getCountOfGuesses() {
        return countOfGuesses;
    }
}
