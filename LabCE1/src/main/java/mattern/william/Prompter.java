package mattern.william;

import java.util.Scanner;

/**
 * Created by williammattern on 1/12/17.
 */
public class Prompter {
    int userNumber;
    int userNumberAddedTogether = 0;
    Scanner scanner = new Scanner(System.in);

    public int prompt(){
        System.out.println("Feed me a number!");
        return scanner.nextInt();
    }
}
