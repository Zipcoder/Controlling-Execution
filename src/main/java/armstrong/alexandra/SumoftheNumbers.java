package armstrong.alexandra;

import java.util.Scanner;

/**
 * Created by alexandraarmstrong on 1/12/17.
 */
public class SumoftheNumbers {
    public static void main(String[] args){
        printSum(sumNumbers(askForInput()));
    }

    public static void printSum(int total) {
        System.out.println("The sum is " + total + ".");
    }

    public static int sumNumbers(int input) {
        int total = 0;
        for (int i = 1; i <= input; i++){
            total += i;
        }
        return total;
    }

    public static int askForInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int input = scanner.nextInt();
        return input;
    }
}
