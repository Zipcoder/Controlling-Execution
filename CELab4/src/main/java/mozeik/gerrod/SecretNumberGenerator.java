package mozeik.gerrod;

import java.util.Random;

/**
 * Created by gerrodmozeik on 1/13/17.
 */
public class SecretNumberGenerator {

    public int getSecretNumber() {
        Random random = new Random();
        int secretNumber = (random.nextInt(99) + 1);
        System.out.println(secretNumber);
        return secretNumber;
    }
}
