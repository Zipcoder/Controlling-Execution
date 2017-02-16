package capriotti.anthony.Cd12_redux;

import java.util.Scanner;

/**
 * Created by anthonycapriotti on 2/16/17.
 */
public class IO {
    Scanner scanner = new Scanner(System.in);

    public int numberSelection(){
        System.out.println("Enter a number");
       return scanner.nextInt();
    }

    public String choice(){
        System.out.println("Sum or Product?");
        return scanner.nextLine();
    }

    public void output(int results){
        System.out.println(results);
    }


}
