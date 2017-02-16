package Kim.Andy;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by andykim on 2/16/17.
 */
public class ControllingExecutionLab4 {

    Scanner scanner = new Scanner(System.in);

    public int numberGuesser() {
        int magicNumber = 3;
        int counter = 0;
        int lastGuess = 1000;

        boolean playing = true;
        while (playing) {
            System.out.println("Guess a number");
            int guess = scanner.nextInt();
            if (guess > magicNumber) {
                System.out.println("Too big. Try again");
                if (guess != lastGuess) {
                    counter ++;
                }
            } else if (guess < magicNumber) {
                System.out.println("Too small. Try again");
                if (guess != lastGuess) {
                    counter ++;
                }
            } else {
                playing = false;
                System.out.println("great job!");
                counter++;
            }
            lastGuess = guess;

        }
        return counter;
    }
}



