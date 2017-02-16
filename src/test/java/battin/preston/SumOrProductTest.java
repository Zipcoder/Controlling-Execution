package battin.preston;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by prestonbattin on 2/16/17.
 */
public class SumOrProductTest {

    SumOrProduct test;

    @Before
    public void setUp(){
        test = new SumOrProduct(10);
    }


    @Test
    public void multiplierTest(){

        int expected = 3628800;
        int actual = test.multiplier();
        Assert.assertEquals("Testing multiplying", expected, actual);
    }
}
