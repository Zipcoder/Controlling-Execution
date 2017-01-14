package marwa.milton.ControllingExecution;

import org.junit.Assert;
import org.junit.Test;

import java.util.Scanner;

import static org.hamcrest.CoreMatchers.is;

/**
 * Created by mkulima on 1/13/17.
 */
public class AliceAndBobGreeting_Test {

    @Test
    public void testIfScannerObjectInstantiated(){
        Scanner expectedScannerType = new Scanner(System.in);
        AliceAndBobGreeting ABG = new AliceAndBobGreeting();
        Scanner actualScanner = ABG.scan;
        Assert.assertSame("The scanners are not the same!",expectedScannerType.locale(), actualScanner.locale());
    }

    @Test
    public void testFilterUserInput() {
        AliceAndBobGreeting ABG = new AliceAndBobGreeting();
        String expectedGreeting = " ";
        String actualGreeting = ABG.filterUserInput("Zooman");
        Assert.assertThat(actualGreeting, is(expectedGreeting));
    }
}
