package mattern.william;

import java.util.Scanner;

/**
 * Created by williammattern on 1/12/17.
 */
public class Prompter {
    int userNumber;
    char functionCode;
    Scanner scanner = new Scanner(System.in);

    public int getUserNumber(){
        System.out.println("Please give me a number");
        return scanner.nextInt();
    }

    public char getFunctionCode(){
        System.out.println("Please Choose a function Code");
        System.out.println("Function Code 's': Sum");
        System.out.println("Function Code 'p': Product");
        return scanner.next().charAt(0);

    }
}
