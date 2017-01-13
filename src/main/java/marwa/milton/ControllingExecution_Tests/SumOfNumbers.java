package marwa.milton.ControllingExecution_Tests;

/**
 * Created by mkulima on 1/13/17.
 */
public class SumOfNumbers {
    public int numToSum;

    // constructor that accepts user input
    public SumOfNumbers(int userNum){
        this.numToSum = userNum;
    }

    // method to perform summation
    public int sumTheNumbers(){
        return numToSum*(numToSum+1)/2;
    }

    // begin main
    public static void main(String[] args) {
        SumOfNumbers sumUpToValue = new SumOfNumbers(100);
        int calculatedSum = sumUpToValue.sumTheNumbers();
        System.out.println();
        System.out.println("User supplied input is: "+ sumUpToValue.numToSum);
        System.out.println("     Calculated sum is: " + calculatedSum);
    }

}
