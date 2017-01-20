package marwa.milton.ControllingExecution;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by mkulima on 1/13/17.
 */
public class TooLargeOrTooSmall {
    Random randGen = new Random(49);
    int secretNum = randGen.nextInt(50);
    int copyOfSecretNum;
    int myCounter = 0;

    public static void main(String[] args) {
        TooLargeOrTooSmall thisInstanceOfTooLargeOrTooSmall = new TooLargeOrTooSmall();
        thisInstanceOfTooLargeOrTooSmall.copyOfSecretNum = thisInstanceOfTooLargeOrTooSmall.secretNum; // make this copy to enable testing later on

        thisInstanceOfTooLargeOrTooSmall.openingPrompt();
        int userGuessNum = thisInstanceOfTooLargeOrTooSmall.getUserNum();
        thisInstanceOfTooLargeOrTooSmall.compareUserVal(userGuessNum);

        System.out.println("You guessed the correct value!");
        System.out.println("Number of tries: " + thisInstanceOfTooLargeOrTooSmall.myCounter);
    }  // end main_______________________________________________________________________________

    public int theDifference(int secretNum, int userGuess){
        /* function that calculates difference between guess and secret num then returns -1 or 1
       returns +1 when guess > secret num
       returns -1 when guess < secret num */
        int theDifferenceValue = 0;
        if(userGuess>secretNum) theDifferenceValue = 1;
        if(userGuess<secretNum) theDifferenceValue = -1;

        return theDifferenceValue;
    } // end theDifferenceValue function ________________________________________________________

    public void openingPrompt(){
        System.out.println();
        System.out.println("main begins here");
        System.out.println("Secret Number is: " + this.copyOfSecretNum);
        System.out.println();
        System.out.println("____________________________________________________________________");
        System.out.println();
    }

    public int getUserNum(){
        System.out.println("Enter your number: ");
        Scanner scan  = new Scanner(System.in);
        int userGuessNum = scan.nextInt();
        return userGuessNum;
    }

    public void compareUserVal(int userGuessNum){
        while(this.theDifference(this.copyOfSecretNum,userGuessNum)!=0) {
            this.myCounter++;
            if(this.theDifference(this.copyOfSecretNum,userGuessNum)==-1){
                System.out.println("Too Small!");
                userGuessNum = this.getUserNum();
            } else {
                System.out.println("Too Big!");
                userGuessNum = this.getUserNum();
            }
        }
    }

}
