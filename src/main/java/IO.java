import java.util.Scanner;

/**
 * Created by danries on 2/16/17.
 */
public class IO {

    Scanner scanner = new Scanner(System.in);

    public String input(){
        System.out.println("What is your name? ");
        return scanner.nextLine();
    }

    public void output(Boolean person, String name){
        if (person){
            System.out.println("Welcome Back " + name.substring(0,1).toUpperCase() + name.substring(1,name.length()).toLowerCase());
        }
        else
            System.out.println("This isnt your computer");
    }

}
