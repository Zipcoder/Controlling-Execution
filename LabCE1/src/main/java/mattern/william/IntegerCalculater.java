package mattern.william;

/**
 * Created by williammattern on 1/12/17.
 */
public class IntegerCalculater {
    int output;

    public int calculate(int input) {
       if (input >= 0){
           for (int counter = 0; counter <= input; counter++){
               output += counter;
           }
       } else {
               for (int count = input; count < 2; count++){
                   output += count;
           }
       }
       return output;
    }
}