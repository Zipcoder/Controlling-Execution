package mattern.william;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by williammattern on 1/13/17.
 */
public class ComparatorTest {

    @Test
    public void comparatorTestTrue(){
        Comparator comparator = new Comparator();
        boolean actual = comparator.getIsUserNumberSameAsSecretNumber(1,1);
        boolean expected = true;
        assertEquals("I expect the user guessed true", expected, actual);
    }

    @Test
    public void comparatorTestFalse(){
        Comparator comparator = new Comparator();
        boolean actual = comparator.getIsUserNumberSameAsSecretNumber(1,2);
        boolean expected = false;
        assertEquals("I expect the user guessed false", expected, actual);
    }
}