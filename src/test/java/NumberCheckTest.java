import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by danries on 2/16/17.
 */
public class NumberCheckTest {

    NumberCheck numberCheck;

    @Before public void initialize(){
        numberCheck = new NumberCheck();
    }

    @Test
    public void compareNumberTestHigher(){
        String expected = "high";
        String actual = numberCheck.compareNumber(5,3);
        assertTrue(expected.equals(actual));
    }

    @Test
    public void compareNumberTestLow(){
        String expected = "low";
        String actual = numberCheck.compareNumber(1,3);
        assertTrue(expected.equals(actual));
    }

    @Test
    public void compareNumberTestEqual(){
        String expected = "correct";
        String actual = numberCheck.compareNumber(3,3);
        assertTrue(expected.equals(actual));
    }

}
