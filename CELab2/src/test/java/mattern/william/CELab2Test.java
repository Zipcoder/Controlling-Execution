package mattern.william;

import com.sun.org.apache.xpath.internal.operations.Bool;

import static org.junit.Assert.*;

/**
 * Created by williammattern on 1/12/17.
 */
public class CELab2Test {

    public static void main(String[] args) {
        Prompter prompter = new Prompter();
        String userName = prompter.getUserName();
        NameCheck nameCheck = new NameCheck();
        Boolean result = nameCheck.checkThisNameOut(userName);
        System.out.println(result);

    }

}