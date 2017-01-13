package ControllingExecution;

import java.util.Scanner;

/**
 * Created by randallcrame on 1/12/17.
 */
public class AliceAndBobGreeting {
    public boolean areYouBobOrAlice( String userName){
        if (userName.toLowerCase().equals("bob") || userName.toLowerCase().equals("alice")) {
            return true;
        }else {
             return false;
        }

    }
    private void onlyGreetsBobOrAlice(boolean checker, String namePrint){
        if (checker)
            System.out.println("Why hello, " + namePrint);
    }

    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        AliceAndBobGreeting myName = new AliceAndBobGreeting();
        String usersName;

        System.out.print ("Please Enter your Name: ");
        usersName = input.next();
        myName.onlyGreetsBobOrAlice(myName.areYouBobOrAlice(usersName), usersName);
    }

}