package mozeik.gerrod;

import org.junit.Before;
import org.junit.Test;
import org.omg.CosNaming.NameComponentHelper;

import javax.naming.Name;

import static org.junit.Assert.*;

/**
 * Created by gerrodmozeik on 1/12/17.
 */
public class NameCheckerTest {

    @Test

    public void nameCheckTestA() {
        NameChecker n = new NameChecker();
        Boolean expected = true;
        Boolean actual = n.checkThisName("Alice");
        assertEquals("I expect this name to be Alice.", actual, expected);
    }

    @Test

    public void nameCheckTestB() {
        NameChecker n = new NameChecker();
        Boolean expected = true;
        Boolean actual = n.checkThisName("Bob");
        assertEquals("I expect this name to be Bob.", actual, expected);
    }

    @Test

    public void nameCheckTestC() {
        NameChecker n = new NameChecker();
        Boolean expected = false;
        Boolean actual = n.checkThisName("Chuck");
        assertEquals("I expect this to fail.", actual, expected);
    }
}