package armstrong.alexandra;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by alexandraarmstrong on 1/13/17.
 */
public class TooLargeTooSmallTest {
    @Test
    public void isCorrectTest(){
        TooLargeTooSmall game = new TooLargeTooSmall();
        boolean expected = true;
        boolean actual = game.isCorrect(game.getNumberToBeGuessed());
        assertEquals(expected, actual);
    }

    @Test
    public void highOrLowTest(){
        TooLargeTooSmall game = new TooLargeTooSmall();
        game.setGuess(game.getNumberToBeGuessed() + 1);
        String expected = "Too Large";
        String actual = game.highOrLow();
        assertEquals(expected, actual);
    }


}
