package marwa.milton.ControllingExecution;

import org.junit.Assert;
import org.junit.Test;
import marwa.milton.ControllingExecution.SumOrProduct;

import static org.hamcrest.Matchers.is;

/**
 * Created by mkulima on 1/13/17.
 */
public class SumOrProduct_Test {


    @Test
    public void sumTest(){
        // check instantiation value
        SumOrProduct thisInstanceOfSumOrProduct = new SumOrProduct();
        int expectedNum = 28;   // sum of numbers upto 7SumOrPropduct
        int actualNum = thisInstanceOfSumOrProduct.sumOperation(7);
        Assert.assertThat(actualNum, is(expectedNum));
    }

    @Test
    public void productTest(){
        // check instantiation value
        SumOrProduct thisInstanceOfSumOrProduct = new SumOrProduct();
        int expectedNum = 5040;   // sum of numbers upto 7
        int actualNum = thisInstanceOfSumOrProduct.productOperation(7);
        Assert.assertThat(actualNum, is(expectedNum));
    }
}
