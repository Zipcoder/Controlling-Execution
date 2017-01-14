package wolfe.michael.AliceAndBobGreetingTest;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by michaelwolfe on 1/13/17.
 */
public class AliceAndBobGreetingTest {

    @Test
    public void checkAlice(){
        String actualName = "Alice";
        String expectedName = "alice";
        Boolean expected = true;
        Boolean actual = actualName.equalsIgnoreCase(expectedName);
        Assert.assertEquals("I expect actual to be true.", expected, actual);
    }

    @Test
    public void checkBob(){
        String actualName = "Bob";
        String expectedName = "bob";
        Boolean expected = true;
        Boolean actual = actualName.equalsIgnoreCase(expectedName);
        Assert.assertEquals("I expect actual to be true.", expected, actual);

    }
}
