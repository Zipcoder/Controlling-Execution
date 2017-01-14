package wolfe.michael.AliceAndBobGreeting;

/**
 * Created by michaelwolfe on 1/13/17.
 */
public class AliceAndBobChecker {
    public static void checkName(String name){
        if(name.equalsIgnoreCase("alice"))
            System.out.println("Hello Alice!");
        else if (name.equalsIgnoreCase("bob"))
            System.out.println("Hello Bob!");
    }
}
