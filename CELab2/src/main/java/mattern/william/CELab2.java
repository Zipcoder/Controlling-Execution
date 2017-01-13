package mattern.william;

/**
 * Created by williammattern on 1/12/17.
 */
public class CELab2 {

    public static void main(String[] args) {
        Prompter prompter = new Prompter();
        String userName = prompter.getUserName();
        NameCheck nameCheck = new NameCheck();
        Boolean result = nameCheck.checkThisNameOut(userName);
        if (result) {
            System.out.println("Hello " + userName);
        } else {
            System.out.println("Access Denied");
        }
    }
}
