package mozeik.gerrod;

import java.util.Scanner;

/**
 * Created by gerrodmozeik on 1/12/17.
 */
public class CELab1 {

    public static void main(String[] args) {
        Prompt userPrompt = new Prompt();
        IntegerCalculator calculator = new IntegerCalculator();
        int userNumber;
        userNumber = userPrompt.prompt();
        int output = calculator.calculate(userNumber);
        System.out.println(output);
    }



}
