import Kim.Andy.ControllingExecutionLab2;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by andykim on 2/16/17.
 */
public class Lab2Test {

    ControllingExecutionLab2 controllingExecutionLab2;

    @Before
    public void setUp() {
        controllingExecutionLab2 = new ControllingExecutionLab2();
    }

    @Test
    public void Test() {
        String expected = "Sup Alice";
        String actual = controllingExecutionLab2.greeting("Alice");
        Assert.assertEquals(expected, actual);
    }
}
