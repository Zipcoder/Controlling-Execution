package battin.preston;

/**
 * Created by prestonbattin on 2/16/17.
 */
public class SumOrProduct extends SumOfNumbers {

    SumOrProduct(int number){

        super(number);
    }

    public int multiplier(){

        int multipliedNumber = 1;
        for(int i = 1; i <= number; i++){

            multipliedNumber = multipliedNumber * i;

        }

        return multipliedNumber;
    }
}
