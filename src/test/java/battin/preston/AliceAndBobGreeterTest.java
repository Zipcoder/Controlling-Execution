package battin.preston;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by prestonbattin on 2/16/17.
 */
public class AliceAndBobGreeterTest {

    AliceAndBobGreeter greeter;

    @Before
    public void setUp(){

        greeter = new AliceAndBobGreeter("Alice");
    }

    @Test
    public void greeterTest(){

        String expected = "Nice to see you Alice!";
        String actual = greeter.greeter();
        Assert.assertEquals("Testing greet method", expected, actual);
    }
}
