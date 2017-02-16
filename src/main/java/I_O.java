import java.util.Scanner;

/**
 * Created by anthonycapriotti on 2/16/17.
 */
public class I_O {
    Scanner scanner = new Scanner(System.in);

    public int question(){
        System.out.println("enter a number");
        return scanner.nextInt();
    }

    public void output(int input){
        System.out.println("Sum is " + input);
    }
}
