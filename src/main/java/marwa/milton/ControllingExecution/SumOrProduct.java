package marwa.milton.ControllingExecution;

import java.util.Scanner;

/**
 * Created by mkulima on 1/13/17.
 */
public class SumOrProduct {

    public static void main(String[] args) {
        SumOrProduct thisInstanceOfSumOrProduct = new SumOrProduct();
        // get user input
        System.out.println("Enter your number: ");
        Scanner scan  = new Scanner(System.in);
        double usersNum = scan.nextDouble();

        System.out.println("Choose the Operation Type: \n Enter 1 for Sums \n Enter 2 for the Product");
        int operationType = scan.nextInt();
        scan.close();

        // perform action with user input and print result to screen
        if(operationType == 1) System.out.println(thisInstanceOfSumOrProduct.sumOperation((int) usersNum));
        if(operationType == 2) System.out.println(thisInstanceOfSumOrProduct.productOperation((int) usersNum));

    } // end main _________________________________________________________________________________________________

    // sum method
    public int sumOperation(int userNum){
        SumOfNumbers sumUpToValue = new SumOfNumbers(userNum);
        return sumUpToValue.sumTheNumbers();
    } // end sum method___________________________________________________________________________________________

    // product method
    public int productOperation(int userNum){
        int product = 1;
        for (int i = 1; i <= userNum ; i++) {
            product *= i;
        }
        return  product;
    } // end product method________________________________________________________________________________________

} //end class
