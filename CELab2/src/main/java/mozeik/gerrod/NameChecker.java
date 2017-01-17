package mozeik.gerrod;

/**
 * Created by gerrodmozeik on 1/12/17.
 */
public class NameChecker {
    String nameToCheck;
    String checkForBob = "Bob";
    String checkForAlice = "Alice";


    public Boolean checkThisName(String name) {
        this.nameToCheck = name;
        if (checkForAlice.equals(nameToCheck)) {
            return true;
        } else if (checkForBob.equals(nameToCheck)) {
            return true;
        } else {
            return false;
        }
        }
    }

