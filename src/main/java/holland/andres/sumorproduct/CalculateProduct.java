package holland.andres.sumorproduct;

public class CalculateProduct {

    public int getProduct () {
        AskUserNumber askUserNumber = new AskUserNumber();
        int number = askUserNumber.getInput();
        int multiply = 1;
        for (int current = number; current > 0; current --) {
            multiply *= current;
        }
        return multiply;
    }
}
