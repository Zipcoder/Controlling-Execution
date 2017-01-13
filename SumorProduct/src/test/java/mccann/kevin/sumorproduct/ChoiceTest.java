package mccann.kevin.sumorproduct;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by kevinmccann on 1/13/17.
 */
public class ChoiceTest {

    @Test
    public void answer() throws Exception {
        Choice chooser = new Choice();
        long expected = -1;
        long actual = chooser.answer("sss", 2);
        assertEquals("-1 expected",expected, actual);
    }

}