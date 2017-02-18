package ControllingExecution;

import java.util.Scanner;

/**
 * Created by randallcrame on 1/12/17.
 */
public class AliceAndBobGreeting {
    private boolean isBobOrAlice(String userName){
        return (userName.equalsIgnoreCase("bob") || userName.equalsIgnoreCase("alice"));
    }
    protected String greetOnlyBobOrAlice(String namePrint){
        return (isBobOrAlice(namePrint)) ? "Why hello, " + namePrint : "";
    }

    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        AliceAndBobGreeting greeting = new AliceAndBobGreeting();
        String usersName;

        System.out.print ("Please Enter your Name: ");
        usersName = input.next();
        System.out.println(greeting.greetOnlyBobOrAlice(usersName));
    }

}