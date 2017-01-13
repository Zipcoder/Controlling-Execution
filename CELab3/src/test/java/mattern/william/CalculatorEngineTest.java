package mattern.william;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by williammattern on 1/12/17.
 */
public class CalculatorEngineTest {

    @Test
    public void getSumTest5()  {
        CalculatorEngine calculatorEngine = new CalculatorEngine();
        int expected = 15;
        int actual = calculatorEngine.getSum(5);
        assertEquals("I expect the getSum function to return 15 from 5", actual, expected);
    }

    @Test
    public void getProductTest10()  {
        CalculatorEngine calculatorEngine = new CalculatorEngine();
        int expected = 3628800;
        int actual = calculatorEngine.getProduct(10);
        assertEquals("I expect the getProduct function to return 3628800 from 10", actual, expected);
    }
}