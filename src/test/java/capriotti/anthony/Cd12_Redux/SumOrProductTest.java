package capriotti.anthony.Cd12_Redux;

import capriotti.anthony.Cd12_redux.SumOrProduct;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Created by anthonycapriotti on 2/16/17.
 */
public class SumOrProductTest {
    SumOrProduct sumOrProduct = new SumOrProduct();

    @Test
    public void choiceTest(){
        int expected = 15;
        int actual = sumOrProduct.choice("sum", 5);
        assertEquals("sum expected results",expected,actual);
    }

    @Test
    //wrong choice
    public void invalidChoiceTest(){
        int expected = 0;
        int actual = sumOrProduct.choice("multiply", 5);
        assertEquals("invalid selection", expected, actual);
    }

    @Test
    public void sumTest(){
        int expected = 15;
        int actual = sumOrProduct.sum(5);
        assertEquals("15 will return", expected, actual);
    }

    @Test
    public void productTest(){
        int expected = 6;
        int actual = sumOrProduct.product(3);
        assertEquals("6 will retrun", expected, actual);
    }
}
