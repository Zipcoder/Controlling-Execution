package mccann.kevin.SumNumbers;

import java.util.Scanner;

/**
 * Created by kevinmccann on 1/12/17.
 */
public class SumNumbers {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a number!");
        int n = scanner.nextInt();
        int total = 0;
        for(int i = 0; i <= n; i++)
            total += i;
        System.out.println(total);
    }
}
