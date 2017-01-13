package mozeik.gerrod;

/**
 * Created by gerrodmozeik on 1/12/17.
 */
public class CELab3 {

    public static void main(String[] args) {
        int userNumber;
        char functionCode;
        int userResult;

        Prompter prompter = new Prompter();
        userNumber = prompter.getUserNumber();
        System.out.println("Your number: " + userNumber);

        functionCode = prompter.getFunctionCode();
        System.out.println("Your function code: " + functionCode);

        Calculator calculator = new Calculator();
        if (functionCode == 's') {
            userResult = calculator.getSum(userNumber);
            System.out.println("Your sum: " + userResult);
        } else if (functionCode == 'p') {
            userResult = calculator.getProduct(userNumber);
            System.out.println("Your product: " + userResult);
        }
    }

}
