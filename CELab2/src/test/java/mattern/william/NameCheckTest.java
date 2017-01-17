package mattern.william;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by williammattern on 1/12/17.
 */
public class NameCheckTest {

    @Test
    public void nameCheckTestA(){
        NameCheck n = new NameCheck();
        Boolean expected = true;
        Boolean actual = n.checkThisNameOut("Alice");
        assertEquals("Alice should pass the test",actual,expected);
    }

    @Test
    public void nameCheckTestB(){
        NameCheck n = new NameCheck();
        Boolean expected = true;
        Boolean actual = n.checkThisNameOut("Bob");
        assertEquals("Bob should pass the test",actual,expected);
    }

    @Test
    public void nameCheckTestC(){
        NameCheck n = new NameCheck();
        Boolean expected = false;
        Boolean actual = n.checkThisNameOut("Charlie");
        assertEquals("Charlie should Fail the test",actual,expected);
    }
}