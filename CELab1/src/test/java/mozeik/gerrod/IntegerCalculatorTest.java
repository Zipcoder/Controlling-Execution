package mozeik.gerrod;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by gerrodmozeik on 1/12/17.
 */
public class IntegerCalculatorTest {

    @Test

    public void calculatorTest5() {
        IntegerCalculator calculator = new IntegerCalculator();
        int expected = 10;
        int actual = calculator.calculate(5);
        assertEquals("I expect the sum to be 15.", expected, actual);
    }

    @Test

    public void integerCalcTestNeg5() {
        IntegerCalculator calculator = new IntegerCalculator();
        int expected = -9;
        int actual = calculator.calculate(-4);
        assertEquals("I expect the sum to be -9.", expected, actual);
    }

}