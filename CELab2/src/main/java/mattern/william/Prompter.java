package mattern.william;

import java.util.Scanner;

/**
 * Created by williammattern on 1/12/17.
 */
public class Prompter {
    Scanner sc = new Scanner(System.in);

    public String getUserName(){
        System.out.println("What is your name?");
        return sc.next();
    }
}
