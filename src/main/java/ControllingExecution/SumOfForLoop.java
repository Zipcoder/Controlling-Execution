package ControllingExecution;

/**
 * Created by randallcrame on 1/12/17.
 */
public class SumOfForLoop {

    private static int sumOfForLoop(int n){
        int sum = 0;
        for (int i = 0; i <=n; i++) {
            sum += i;
        }
        return sum;
    }


    public static void main (String[] args){
        SumOfForLoop n = new SumOfForLoop();
        System.out.println(n.sumOfForLoop(10));
    }

}