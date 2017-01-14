package wolfe.michael.SumOrMultiplyARangeOfIntegers;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by michaelwolfe on 1/13/17.
 */
public class SumOrMultiplyARangeOfIntegersTest {
    Calculate calc = new Calculate();

    @Test
    public void calcSum(){
        int num = 10;
        int expected = 55;
        int actual = calc.calculateSum(num);
        Assert.assertEquals("I expect the sum to be 55.", expected, actual);
    }

    @Test
    public void calcProd(){
        int num = 5;
        int expected = 120;
        int actual = calc.calculateProduct(num);
        Assert.assertEquals("I expect the factorial of 5 to equal 120.", expected, actual);

    }
}
