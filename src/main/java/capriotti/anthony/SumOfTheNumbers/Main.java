package capriotti.anthony.SumOfTheNumbers;

/**
 * Created by anthonycapriotti on 1/13/17.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ask = new Scanner(System.in);
        SumOfNumbers s = new SumOfNumbers();
        System.out.println("Enter a number");
        int n = ask.nextInt();
        System.out.println(s.totalSum(n));
    }
}