package wolfe.michael.IntegerSummer;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by michaelwolfe on 1/12/17.
 */
public class IntegerSummerTest {
    Calculate calc = new Calculate();

    @Test
    public void sumPos(){
        int number = 10;
        int expected = 55;
        int actual = calc.calculate(number);
        Assert.assertEquals("I expect to receive 55.", expected, actual);
    }

    @Test
    public void sumNeg(){
        int number = -3;
        int expected = -5;
        int actual = calc.calculate(number);
        Assert.assertEquals("I expect to receive -2.", expected, actual);
    }

    @Test
    public void sumZero(){
        int number = 0;
        int expected = 1;
        int actual = calc.calculate(number);
        Assert.assertEquals("I expect to retrieve 1", expected, actual);
    }
}
