package armstrong.alexandra;

/**
 * Created by alexandraarmstrong on 1/12/17.
 */
public class AliceAndBobGreeting {
    public static void main(String[] args){
        String name = whatIsYourName();
        if (areYouBob(name)) {
            System.out.println("Hello Bob");
        } else if (areYouAlice(name)){
            System.out.println("Hello Alice");
        } else {
            System.out.println("... Rude");
        }

    }

    public static String whatIsYourName(){
        System.out.println("Hello, what is your name?");
        String name = InputHelper.stringScanner();
        return name;
    }

    public static boolean areYouBob(String name) {
        if (name.equalsIgnoreCase("Bob")) {
            return true;
        }
        return false;
    }

    public static boolean areYouAlice(String name){
        if (name.equalsIgnoreCase("Alice")){
            return true;
        }
        return false;
    }
}
