package ControllingExecution;

import java.util.Scanner;

/**
 * Created by randallcrame on 1/12/17.
 *
 */
public class SumLoop {

    public static int sumLoop(int number){
        return (number <= 0) ? 0 :  sumLoop(number -1) + number ;
    }


    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        int usersNumber;

        System.out.println ("Please Enter a Number: ");
        usersNumber = input.nextInt();
        System.out.println("The sum of all the numbers before it is: " + SumLoop.sumLoop(usersNumber));
    }



}