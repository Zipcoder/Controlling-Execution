package wolfe.michael.SumOrMultiplyARangeOfIntegers;

/**
 * Created by michaelwolfe on 1/13/17.
 */
public class OperatorSelector {

    public static void selectOperator(int number, String operator){
        Calculate calc = new Calculate();
        String add = "add";
        String multiply = "multiply";
        boolean adder = operator.equalsIgnoreCase(add);
        boolean multiplier = operator.equalsIgnoreCase(multiply);
        if (adder)
            calc.calculateSum(number);
        else if (multiplier)
            calc.calculateProduct(number);
        else
            System.out.println("please enter a valid math operator.");
    }
}
