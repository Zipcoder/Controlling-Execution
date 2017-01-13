package mozeik.gerrod;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by gerrodmozeik on 1/12/17.
 */
public class CalculatorTest {
    @Test
    public void getSumTestNeg() {
        Calculator calculator = new Calculator();
        int expected = 15;
        int actual = calculator.getSum(5);
        assertEquals("I expect the sum of 5 to be 15.", expected, actual);
    }

    @Test
    public void getProductTest()  {
        Calculator calculator = new Calculator();
        int expected = 3628800;
        int actual = calculator.getProduct(10);
        assertEquals("I expect the product of 3! to be 6", expected, actual);
    }

}