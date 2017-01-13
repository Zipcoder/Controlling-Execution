package mattern.william;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by williammattern on 1/12/17.
 */
public class IntegerCalculaterTest {

    @Test
    public void integerCalcTest5(){
        IntegerCalculater calculater = new IntegerCalculater();
        int expected = 10;
        int actual = calculater.calculate(5);
        assertEquals("I expect the calculater to return 15 from 5",expected, actual);
    }

    @Test
    public void integerCalcTestNeg4(){
        IntegerCalculater calculater = new IntegerCalculater();
        int expected = -9;
        int actual = calculater.calculate(-4);
        assertEquals("I expect negative 4 to return negative 9", expected, actual);
    }
}