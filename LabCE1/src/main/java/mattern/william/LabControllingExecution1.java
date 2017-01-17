package mattern.william;

import java.util.Scanner;
/**
 * Created by williammattern on 1/12/17.
 */
public class LabControllingExecution1 {

    public static void main(String[] args) {
        Prompter userPrompt = new Prompter();
        IntegerCalculater calculater = new IntegerCalculater();

        int userNumber = userPrompt.prompt();
        int output = calculater.calculate(userNumber);
        System.out.println(output);
    }

}
