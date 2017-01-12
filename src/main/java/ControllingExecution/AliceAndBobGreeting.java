package ControllingExecution;

/**
 * Created by randallcrame on 1/12/17.
 */
public class AliceAndBobGreeting {
    private boolean areYouBobOrAlice( String userName){
        if (userName.toLowerCase().equals("bob")) {
            return true;
        }else {
             return false;
        }

    }
    private void onlyGreetsBobOrAlice(boolean checker, String namePrint){
        if (checker)
            System.out.println(namePrint);
    }

    public static void main (String[] args){
        String userName = "Bob";
        AliceAndBobGreeting myName = new AliceAndBobGreeting();
        myName.onlyGreetsBobOrAlice(myName.areYouBobOrAlice(userName), userName);
    }

}