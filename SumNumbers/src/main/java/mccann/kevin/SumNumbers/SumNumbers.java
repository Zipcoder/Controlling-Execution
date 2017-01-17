package mccann.kevin.SumNumbers;

/**
 * Created by kevinmccann on 1/12/17.
 */
public class SumNumbers {

    public static void main(String args[]) {
        Display printer = new Display();
        DoMath mather = new DoMath();
        UserInterface UI = new UserInterface();
        int n = UI.getInput();
        printer.printLine(mather.sum(n));
    }
}
