package ControllingExecution;

import java.util.Scanner;

/**
 * Created by randallcrame on 1/12/17.
 */
public class SumOfForLoop {

    public int sumOfForLoop(int n){
        int sum = 0;
        for (int i = 0; i <=n; i++) {
            sum += i;
        }
        return sum;
    }


    public static void main (String[] args){
        SumOfForLoop n = new SumOfForLoop();
        Scanner input = new Scanner(System.in);
        int usersNumber;

        System.out.println ("Please Enter a Number: ");
        usersNumber = input.nextInt();
        System.out.println("The sum of all the numbers before it is: " + n.sumOfForLoop(usersNumber));
    }



}