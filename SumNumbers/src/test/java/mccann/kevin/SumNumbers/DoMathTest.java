package mccann.kevin.SumNumbers;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by kevinmccann on 1/13/17.
 */
public class DoMathTest {
    @Test
    public void sum() throws Exception {
        int expected = 10;
        int actual = DoMath.sum(4);
        assertEquals("Integer 10 expected",expected,actual);
    }

}