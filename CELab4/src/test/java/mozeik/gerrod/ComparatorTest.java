package mozeik.gerrod;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by gerrodmozeik on 1/13/17.
 */
public class ComparatorTest {

    @Test

    public void comparatorTestTrue() {
        Comparator comparator = new Comparator();
        boolean actual = comparator.isUserGuessSameAsSecretNumber(81, 81);
        boolean expected = true;
        assertEquals("I expect the user to guess correctly.", expected, actual);
    }

    @Test

    public void comparatorTestFalse() {
        Comparator comparator = new Comparator();
        boolean actual = comparator.isUserGuessSameAsSecretNumber(1, 2);
        boolean expected = false;
        assertEquals("I expect the user to guess incorrectly.", expected, actual);
    }

}