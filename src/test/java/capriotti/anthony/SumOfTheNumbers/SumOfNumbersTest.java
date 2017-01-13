package capriotti.anthony.SumOfTheNumbers;

/**
 * Created by anthonycapriotti on 1/12/17.
 */

import static org.junit.Assert.*;

import org.junit.Test;

public class SumOfNumbersTest {
    SumOfNumbers thing = new SumOfNumbers();

    @Test
    public void totalSumTest(){
        Integer expected = 6;
        Integer actual = thing.totalSum(2);
        assertEquals("I expect it to equal 3 if 2 is passed", expected,actual);
    }




}
