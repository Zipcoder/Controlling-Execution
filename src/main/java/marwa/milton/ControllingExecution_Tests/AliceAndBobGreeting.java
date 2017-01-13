package marwa.milton.ControllingExecution_Tests;

import java.util.Scanner;

/**
 * Created by mkulima on 1/13/17.
 */
public class AliceAndBobGreeting {

    public static void main(String[] args) {

        System.out.println("Enter your name: ");
        Scanner scan  = new Scanner(System.in);
        String usersName = scan.nextLine();
        scan.close();

        if(usersName.toLowerCase().equals("alice") | usersName.toLowerCase().equals("bob"))
        {
        System.out.println("\n " + "Hello, " + usersName);
        }

    } // end main
} // end class
