package holland.andres.toolargetoosmall;

public class TellUserStatus {

    private int secretNumber = 27;

    public boolean tellUserStatus(int guess) {

        if (guess > secretNumber) {
            System.out.println("Your number is too high.");
            return true;
        }
        if (guess < secretNumber) {
            System.out.println("Your number is too low.");
            return true;
        }
        return false;
    }
}

