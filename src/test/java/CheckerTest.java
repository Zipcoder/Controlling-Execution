import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by danries on 2/16/17.
 */
public class CheckerTest {

    Checker checker;
    String name1;
    String name2;

    @Before public void initialize(){
        checker = new Checker();
        name1 = "Alice";
        name2 = "Dan";
    }

    @Test
    public void testCheckName(){
        assertTrue(checker.checkName(name1));
    }

    @Test
    public void testCheckNameisWrong(){
        assertFalse(checker.checkName(name2));
    }

}
