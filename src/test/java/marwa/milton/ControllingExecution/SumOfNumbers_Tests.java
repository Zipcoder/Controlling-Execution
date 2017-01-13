package marwa.milton.ControllingExecution;

import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.Matchers.is;


/**
 * Created by mkulima on 1/13/17.
 */
public class SumOfNumbers_Tests {

    @Test
    public void sumTheNumbers_Test(){
        SumOfNumbers exampleNumber = new SumOfNumbers(100);

        // check instantiation value
        int expectedNum = 100;
        int actualNum = exampleNumber.numToSum;
        Assert.assertThat(actualNum, is(expectedNum));

        // check summation
        int expectedSum = 5050;
        int actualSum = exampleNumber.sumTheNumbers();
        Assert.assertThat(actualSum, is(expectedSum));
    }

}
