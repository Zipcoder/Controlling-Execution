package ControllingExecution;

import org.junit.Before;
import org.junit.Test;

import static  org.junit.Assert.*;

/**
 * Created by randallcrame on 1/12/17.
 */
public class ControllingExecutionTest {
/*
    @Test
    public void "SuitableName"(){
     if returning something set something to expected/actual
    }
    @B
 */

    @Test
    public void SumOfForLoopTest() {
        SumOfForLoop n = new SumOfForLoop();
        int expected = 55;
        int actual = n.sumOfForLoop(10);
        assertEquals(expected, actual);
    }


    @Test
    public void SumLoopTest(){
        SumOrProduct myNumber = new SumOrProduct();
        int expected = 55;
        int actual = myNumber.sumLoop(10);
        assertEquals(expected, actual);
    }

    @Test
    public void ProductLoopTest(){
        SumOrProduct myNumber = new SumOrProduct();
        int expected = 3628800;
        int actual = myNumber.productLoop(10);
        assertEquals(expected, actual);
    }
    @Test
    public void DoWorkTestPass() {
        SumOrProduct myNumber = new SumOrProduct();
        myNumber.doWork(10, "Product");
    }
    @Test
    public void DoWorkTestFail() {
        SumOrProduct myNumber = new SumOrProduct();
        myNumber.doWork(10, "Dime");
    }
    @Test
    public void incrementGuessPass(){
        TooLargeTooSmall myNumber = new TooLargeTooSmall();
        myNumber.numberOfGuesses(1, 2);
        int guessCounter = 0;
        int expected = 0;
        int actual = guessCounter;
        assertEquals(expected, actual);
    }

   /* @Test
    public void ifElseGuess(){
        TooLargeTooSmall myNumber = new TooLargeTooSmall();
        myNumber.checkGuess(2,1);
        int expected
        Assert.assertEquals(expected, actual);
   //Unsure how to test
    } */

}

