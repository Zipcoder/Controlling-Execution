package mattern.william;

import java.util.Random;

/**
 * Created by williammattern on 1/12/17.
 */
public class SecretNumber {
    int secretNumber;
    Random random = new Random();

    public void setSecretNumber(){
        this.secretNumber = random.nextInt(100);
    }

    public int getSecretNumber(){
        return this.secretNumber;
    }
}
