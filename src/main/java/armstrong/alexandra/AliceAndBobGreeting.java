package armstrong.alexandra;

import java.util.Scanner;

/**
 * Created by alexandraarmstrong on 1/12/17.
 */
public class AliceAndBobGreeting {
    public static void main(String[] args){
        String name = whatIsYourName();
        areYouBob(name);
        areYouAlice(name);
    }

    public static String whatIsYourName(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, what is your name?");
        String name = scanner.nextLine();
        return name;
    }

    public static void areYouBob(String name) {
        if (name.equalsIgnoreCase("Bob")) {
            greetingBob();
        }
    }

    public static void areYouAlice(String name){
        if (name.equalsIgnoreCase("Alice")){
            greetingAlice();
        }
    }

    private static void greetingBob() {
        System.out.println("Hello Bob");
    }

    private static void greetingAlice(){
        System.out.println("Hello Alice");


    }
}
