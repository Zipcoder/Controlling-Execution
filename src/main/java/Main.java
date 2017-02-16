/**
 * Created by anthonycapriotti on 2/16/17.
 */
public class Main {

    public static void main (String[] args){
        I_O i_o = new I_O();
        Sum sum = new Sum();
        i_o.output(sum.SumOfNumbers(i_o.question()));
    }

}
