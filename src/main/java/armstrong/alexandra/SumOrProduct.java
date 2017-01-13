package armstrong.alexandra;
/**
 * Created by alexandraarmstrong on 1/12/17.
 */
public class SumOrProduct {

    public static void main(String[] args){
        operatorIntake();
    }

    public static int numberIntake(){
        System.out.print("Please type an integer: ");
        int intake = InputHelper.intScanner();
        return intake;
    }

    public static void operatorIntake(){
        System.out.print("Please type the operator: ");
        String operator = InputHelper.stringScanner();
        sumOrProduct(operator);
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
            operatorIntake();
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
