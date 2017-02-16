/**
 * Created by anthonycapriotti on 2/16/17.
 */
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
public class SumTest {
    Sum sum = new Sum();

    @Test
    public void sumOfNumbersTest(){
        int expected = 6;
        int actual = sum.SumOfNumbers(3);
        Assert.assertEquals("sum will return", expected, actual);
    }

}
