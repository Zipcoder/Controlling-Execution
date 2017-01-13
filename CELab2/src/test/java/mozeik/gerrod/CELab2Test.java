package mozeik.gerrod;

import static org.junit.Assert.*;

/**
 * Created by gerrodmozeik on 1/12/17.
 */
public class CELab2Test {

    public static void main(String[] args) {
        Prompter prompter = new Prompter();
        String userName = prompter.getUserName();
        NameChecker nameChecker = new NameChecker();
        Boolean result = nameChecker.checkThisName(userName);
        System.out.println(result);
    }

}