package ries.dan.SumofNums;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by danries on 1/12/17.
 */
public class SumOfNumsTEST {

    Solution solution = new Solution();

    @Test
    public void solutionTest(){
        int actual =solution.sum(10);
        int expected = 55;
        Assert.assertEquals("Expect 55",expected,actual);
    }
}
