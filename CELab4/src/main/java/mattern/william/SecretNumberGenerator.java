package mattern.william;

import java.util.Random;

/**
 * Created by williammattern on 1/13/17.
 */
public class SecretNumberGenerator {
    int secretNumber;

    public int getSecretNumber(){
        Random random = new Random();
        secretNumber = random.nextInt(99) + 1;
        return secretNumber;
    }
}
