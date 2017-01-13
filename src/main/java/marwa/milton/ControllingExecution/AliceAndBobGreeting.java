package marwa.milton.ControllingExecution;

import java.util.Scanner;

/**
 * Created by mkulima on 1/13/17.
 */
public class AliceAndBobGreeting {
    Scanner scan  = new Scanner(System.in);

    public static void main(String[] args) {

        AliceAndBobGreeting thisAliceAndBobGreeting = new AliceAndBobGreeting();
        System.out.println("\n " + "Hello, " + thisAliceAndBobGreeting.filterUserInput());

        thisAliceAndBobGreeting.scan.close();
    } // end main

    // get user input function
    public String filterUserInput(){
        System.out.println("Enter your name: ");
        String usersName = this.scan.nextLine();
        if(usersName.equalsIgnoreCase("alice") | usersName.equalsIgnoreCase("bob"))
            return usersName.toLowerCase();
        else {
            return " ";
        }
    }



} // end class
