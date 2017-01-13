package armstrong.alexandra;

/**
 * Created by alexandraarmstrong on 1/12/17.
 */
public class SumoftheNumbers {
    public static void main(String[] args){
        System.out.println("The sum is " + sumNumbers(askForInput()) + ".");
    }

    public static int sumNumbers(int input) {
        int total = 0;
        for (int i = 1; i <= input; i++){
            total += i;
        }
        return total;
    }

    public static int askForInput() {
        System.out.print("Please enter a number: ");
        int input = InputHelper.intScanner();
        return input;
    }
}
