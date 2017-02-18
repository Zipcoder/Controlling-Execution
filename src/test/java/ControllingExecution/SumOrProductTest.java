package ControllingExecution;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by randallcrame on 2/18/17.
 */
public class SumOrProductTest {

    SumOrProduct myNumber;

    @Before
    public void setUp(){
        myNumber = new SumOrProduct();
    }
    @Test
    public void ProductLoopTest(){
        int expected = 3628800;
        int actual = myNumber.productLoop(10);
        assertEquals(expected, actual);
    }

    @Test
    public void DoWorkTestPass() {
        myNumber.doWork(10, "Product");
    }

    @Test
    public void DoWorkTestFail() {
        myNumber.doWork(10, "Dime");
    }
}
