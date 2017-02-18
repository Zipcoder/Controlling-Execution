package ControllingExecution;

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

