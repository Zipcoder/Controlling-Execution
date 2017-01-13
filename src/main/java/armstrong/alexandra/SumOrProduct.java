import java.util.Scanner;
/**
 * Created by alexandraarmstrong on 1/12/17.
 */
public class SumOrProduct {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        sumOrProduct(operatorIntake());
    }

    public static int numberIntake(){
        System.out.print("Please type an integer: ");
        int intake = scanner.nextInt();
        return intake;
    }

    public static String operatorIntake(){
        System.out.print("Please type the operator: ");
        String operator = scanner.nextLine();
        return operator;
    }

    public static void sumOrProduct(String operator){
        if (operator.equalsIgnoreCase("Sum")){
            computeSum(numberIntake());
        }
        else if (operator.equalsIgnoreCase("Product")){
            computeProduct(numberIntake());
        }
        else {
            System.out.println("Operator must be sum or product");
            operator = scanner.nextLine();
            sumOrProduct(operator);
        }
    }

    public static void computeSum(int number){
        int total = 0;
        for(int i = 0; i <= number; i++){
            total += i;
        }
        printAnswer(total);
    }

    public static void computeProduct(int number){
        int total = 1;
        for(int i = 1; i <= number; i++){
            total *= i;
        }
        printAnswer(total);
    }

    public static void printAnswer(int total){
        System.out.print("The answer is " + total);
    }
}
