package battin.preston;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by prestonbattin on 2/16/17.
 */
public class TooLargeTooASmallTest {

    TooLargeTooSmall test;

    @Before
    public void setUp(){

        test = new TooLargeTooSmall();
    }

    @Test
    public void correctNumberGuessed(){

        String expected = "You guessed the secret number " + test.getSecretNumber() + " in " + test.getTries() + " tries!";
        String actual = test.correctNumberGuessed();
        Assert.assertEquals("Testing correct number method", expected, actual);
    }

    @Test
    public void numberAlreadyGuessedTest(){

        String expected = "Number already guessed, pick another number";
        String actual = test.numberAlreadyGuessed();
        Assert.assertEquals("Testing same number guessed", expected, actual);
    }
}
