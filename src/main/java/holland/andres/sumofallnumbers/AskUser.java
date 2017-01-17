package holland.andres.sumofallnumbers;

import java.util.Scanner;

public class AskUser {

    public int getInput () {
        Scanner initialUserInput = new Scanner(System.in);
        System.out.println("Input a number:");
        return initialUserInput.nextInt();
    }
}
