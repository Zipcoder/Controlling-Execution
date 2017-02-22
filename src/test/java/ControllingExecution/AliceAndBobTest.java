package ControllingExecution;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by randallcrame on 2/18/17.
 */
public class AliceAndBobTest {

    AliceAndBobGreeting userName;

    @Before
    public void setU(){
        userName = new AliceAndBobGreeting();
    }

    @Test
    public void greetBobTest(){
        String expected = "Why hello, Bob";
        String actual = userName.greetOnlyBobOrAlice("Bob");
        assertEquals("Function will return 'Why hello, Bob", expected,actual);
    }

    @Test
    public void greetAliceTest(){
        String expected = "Why hello, Alice";
        String actual = userName.greetOnlyBobOrAlice("Alice");
        assertEquals("Function will return 'Why hello, Alice", expected,actual);
    }

    @Test
    public void greetNoOneTest(){
        String expected = "";
        String actual = userName.greetOnlyBobOrAlice("Jim");
        assertEquals("Function will return nothing", expected,actual);
    }
}
