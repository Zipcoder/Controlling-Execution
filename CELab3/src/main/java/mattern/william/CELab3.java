package mattern.william;

/**
 * Created by williammattern on 1/12/17.
 */
public class CELab3 {


    public static void main(String[] args) {
        int userNumber;
        char functionCode;
        int userResult;

        Prompter prompter = new Prompter();
        userNumber = prompter.getUserNumber();
        System.out.println("User Number: " + userNumber);

        functionCode = prompter.getFunctionCode();
        System.out.println("Function Code: " + functionCode);

        CalculatorEngine calculatorEngine = new CalculatorEngine();
        if (functionCode == 's'){
            userResult = calculatorEngine.getSum(userNumber);
            System.out.println("Your Sum: " + userResult);
        } else if (functionCode == 'p'){
            userResult = calculatorEngine.getProduct(userNumber);
            System.out.println("Your Product: " + userResult);
        }
    }
}
