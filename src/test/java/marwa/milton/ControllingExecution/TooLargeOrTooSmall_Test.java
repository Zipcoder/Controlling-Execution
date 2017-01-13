package marwa.milton.ControllingExecution;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.Matchers.is;

/**
 * Created by mkulima on 1/13/17.
 */
public class TooLargeOrTooSmall_Test {
    @Test
    public void theDifference_Test(){
        // check that counter is zero
        TooLargeOrTooSmall testInstanceOfTooLargeorTooSmall = new TooLargeOrTooSmall();
        int expectedNum = 0;   // sum of numbers upto 7
        int actualNum = testInstanceOfTooLargeorTooSmall.myCounter;
        Assert.assertThat(actualNum, is(expectedNum));
    }

    @Test
    public void testRandomSecretNum(){
        // check that secret number has been initialized is within the bounds used (50)
        TooLargeOrTooSmall testInstanceOfTooLargeOrTooSmall = new TooLargeOrTooSmall();
        int expectedNum = testInstanceOfTooLargeOrTooSmall.secretNum;
        int actualNum = testInstanceOfTooLargeOrTooSmall.copyOfSecretNum;
        Assert.assertEquals("Not within range", actualNum, expectedNum, 50.0);
    }

    @Test
    public void testTheDifferenceValueMethod(){
        // check that the method returns 0, 1 or -1
        TooLargeOrTooSmall testInstanceOfTooLargeOrTooSmall = new TooLargeOrTooSmall();
        // zero case
        int expectedNum = 0;
        int actualNum = testInstanceOfTooLargeOrTooSmall.theDifference(2,2);
        Assert.assertThat(actualNum, is(expectedNum));
        // +1 case
        expectedNum = 1;
        actualNum = testInstanceOfTooLargeOrTooSmall.theDifference(2,3);
        Assert.assertThat(actualNum, is(expectedNum));
        // -1 case
        expectedNum = -1;
        actualNum = testInstanceOfTooLargeOrTooSmall.theDifference(2,1);
        Assert.assertThat(actualNum, is(expectedNum));
    }

}
