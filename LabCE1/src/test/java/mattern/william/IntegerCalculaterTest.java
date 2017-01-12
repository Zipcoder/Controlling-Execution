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
        int expected = 15;
        int actual = calculater.calculate(5);
        assertEquals("I expect the calculater to return 15 from 5",expected, actual);
    }
}