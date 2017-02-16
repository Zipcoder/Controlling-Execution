/**
 * Created by danries on 2/16/17.
 */
class NumberCheck {

    String compareNumber(int guess, int answer){
        String outcome = "";
        if (guess > answer ){
            outcome = "high";
        }
        else if (guess < answer){
            outcome = "low";
        }
        else if (guess == answer){
            outcome = "correct";
        }
        return outcome;
    }

}
