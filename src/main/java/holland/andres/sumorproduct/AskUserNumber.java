package holland.andres.sumorproduct;

import java.util.Scanner;

public class AskUserNumber {

    public int getInput () {
        Scanner initialUserInput = new Scanner(System.in);
        System.out.println("Input a number:");
        return initialUserInput.nextInt();
    }
}
