package mozeik.gerrod;

/**
 * Created by gerrodmozeik on 1/12/17.
 */
public class CELab2 {

    public static void main(String[] args) {
        Prompter prompter = new Prompter();
        String userName = prompter.getUserName();
        NameChecker nameChecker = new NameChecker();
        Boolean result = nameChecker.checkThisName(userName);
        if (result) {
            System.out.println("Hello " + userName);
        }
            else {
                System.out.println("Go away");
            }
        }

    }
