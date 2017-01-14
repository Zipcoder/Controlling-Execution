package holland.andres.sumorproduct;

import java.util.Scanner;

public class AskUserChoice {

    public String getChoice () {
        Scanner initialUserInput = new Scanner(System.in);
        System.out.println("Product or Sum?");
        return initialUserInput.nextLine();
    }
}
