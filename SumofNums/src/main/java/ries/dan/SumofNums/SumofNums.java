package ries.dan.SumofNums;
import java.util.Scanner;
/**
 * Created by danries on 1/12/17.
 */
public class SumofNums {
    static Scanner input = new Scanner(System.in);
    static Display print = new Display();
    static Solution solve = new Solution();

    public static void main (String[] args){
        print.question();
        int n = input.nextInt();
        int total = solve.sum(n);
        print.print(total);
    }

}
