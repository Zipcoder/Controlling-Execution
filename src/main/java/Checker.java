/**
 * Created by danries on 2/16/17.
 */
public class Checker {

    public Boolean checkName(String name){
        Boolean person = false;
        if (name.equalsIgnoreCase("alice") || name.equalsIgnoreCase("bob")){
            person = true;
        }
        return person;
    }

}
