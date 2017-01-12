package ControllingExecutionTest;

import ControllingExecution.SumOfForLoop;
import ControllingExecution.SumOrProduct;
import org.junit.Assert;
import org.junit.Test;
import java.util.*;


/**
 * Created by randallcrame on 1/12/17.
 */
public class ControllingExecutionTest {

    @Test
    public void SumLoopTest(){
        SumOrProduct myNumber = new SumOrProduct();
        int expected = 55;
        int actual = myNumber.sumLoop(10);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void ProductLoopTest(){
        SumOrProduct myNumber = new SumOrProduct();
        int expected = 3628800;
        int actual = myNumber.productLoop(10);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void DoWorkTestPass() {
        SumOrProduct myNumber = new SumOrProduct();
        myNumber.doWork(10, "Product");
    }
    @Test
    public void DoWorkTestFail(){
        SumOrProduct myNumber = new SumOrProduct();
        myNumber.doWork(10, "Dime");

    }
}

