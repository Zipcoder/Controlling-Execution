package battin.preston;

/**
 * Created by prestonbattin on 2/16/17.
 */
public class SumOfNumbers {

    private int number;

    SumOfNumbers(int num){

        number = num;
    }

    public int summer(){

        int summedNumber = 0;
        for(int i = 0; i <= number; i++){

            summedNumber += i;
        }

        return  summedNumber;
    }
}
