package marwa.milton.ControllingExecution;

import java.util.Scanner;

/**
 * Created by mkulima on 1/13/17.
 */
public class AliceAndBobGreeting {
    Scanner scan  = new Scanner(System.in);

    public static void main(String[] args) {

        AliceAndBobGreeting thisAliceAndBobGreeting = new AliceAndBobGreeting();
        String unFilteredName = thisAliceAndBobGreeting.getUserInput();
        System.out.println("\n " + thisAliceAndBobGreeting.filterUserInput(unFilteredName));

        thisAliceAndBobGreeting.scan.close();
    } // end main

    // get user input
    public String getUserInput(){
        System.out.println("Enter your name: ");
        String usersName = this.scan.nextLine();
        return usersName;
    }

    // filter user input function
    public String filterUserInput(String usersName){
        if(usersName.equalsIgnoreCase("alice") | usersName.equalsIgnoreCase("bob"))
            return "Hello, " + usersName + "!";
        else {
            return " ";
        }
    }


} // end class
