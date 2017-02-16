package battin.preston;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by prestonbattin on 2/16/17.
 */
public class SummedNumberTest {

    SumOfNumbers test;

    @Before
    public void setUp(){

        test = new SumOfNumbers(10);
    }

    @Test
    public void summerTest(){

        int expected = 55;
        int actual = test.summer();
        Assert.assertEquals("Testing the summing method", expected, actual);
    }
}
