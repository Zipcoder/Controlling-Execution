package marwa.milton.ControllingExecution;

import java.util.Scanner;

/**
 * Created by mkulima on 1/13/17.
 */
public class SumOrProduct {
    Scanner scan  = new Scanner(System.in);

    public static void main(String[] args) {
        SumOrProduct thisInstanceOfSumOrProduct = new SumOrProduct();
        // get user input
        int usersNum = thisInstanceOfSumOrProduct.getUserInt();
        // get user operation
        int operationType = thisInstanceOfSumOrProduct.getUserOperation();

        // perform action with user input and print result to screen
        if(operationType == 1) System.out.println(thisInstanceOfSumOrProduct.sumOperation(usersNum));
        if(operationType == 2) System.out.println(thisInstanceOfSumOrProduct.productOperation(usersNum));
        thisInstanceOfSumOrProduct.scan.close();
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

    // get user input
    public int getUserInt(){
        System.out.println("Enter your number: ");
        return this.scan.nextInt();
    }

    // get user operation
    public int getUserOperation(){
        System.out.println("Choose the Operation Type: \n Enter 1 for Sums \n Enter 2 for the Product");
        return this.scan.nextInt();
    }


} //end class
