package ControllingExecution;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by randallcrame on 2/18/17.
 */
public class SumLoopTest {

    @Test
    public void SumLoopTest() {
        int expected = 55;
        int actual = SumLoop.sumLoop(10);
        assertEquals(expected, actual);
    }

    @Test
    public void SumLoopNegativeTest() {
        int expected = 0;
        int actual = SumLoop.sumLoop(-100);
        assertEquals(expected, actual);
    }

}
