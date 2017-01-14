package holland.andres.aliceandbobgreeting;

import java.util.Scanner;

public class AskUser {

    public String getName () {
        Scanner initialUserInput = new Scanner(System.in);
        System.out.println("What is your name?");
        return initialUserInput.nextLine();
    }
}
