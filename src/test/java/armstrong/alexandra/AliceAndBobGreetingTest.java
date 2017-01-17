package armstrong.alexandra;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by alexandraarmstrong on 1/12/17.
 */
public class AliceAndBobGreetingTest {
    @Test
    @Ignore //scanner
    public void whatIsYourNameTest(){

    }

    @Test
    public void areYouBobTest() {
        boolean expected = true;
        boolean actual = AliceAndBobGreeting.areYouBob("Bob");
        assertEquals(expected, actual);
    }

    @Test
    public void areYouAliceTest(){
        boolean expected = true;
        boolean actual = AliceAndBobGreeting.areYouAlice("Alice");
        assertEquals(expected, actual);
    }

}
