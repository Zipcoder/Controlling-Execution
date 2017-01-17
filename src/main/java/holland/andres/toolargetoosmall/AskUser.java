package holland.andres.toolargetoosmall;

import java.util.Scanner;

public class AskUser {

    public int getInput () {
        Scanner initialUserInput = new Scanner(System.in);
        System.out.println("Guess a number:");
        return initialUserInput.nextInt();
    }
}
