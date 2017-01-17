package mattern.william;

/**
 * Created by williammattern on 1/12/17.
 */
public class NameCheck {
    String checkForBob = "Bob";
    String checkForAlice = "Alice";
    String nameGettingChecked;

    public Boolean checkThisNameOut(String name){
        this.nameGettingChecked = name;
        if (checkForAlice.equals(nameGettingChecked)){
            return true;
        } else if (checkForBob.equals(nameGettingChecked)) {
            return true;
        } else {
            return false;
        }
    }
}
