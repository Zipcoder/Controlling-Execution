import java.util.Scanner;

/**
 * Created by danries on 2/16/17.
 */
class IO {

    private Scanner scanner = new Scanner(System.in);

    int guessANumber(){
        System.out.println("Guess a number");
        return scanner.nextInt();
    }

    void numberHigh(){
        System.out.println("Too high, guess again!");
    }

    void numberLow(){
        System.out.println("Too low, guess again!");
    }

    void numberRight(int attempts){
        System.out.println("Correct! The number of tries you had is: " + attempts);
    }

}
