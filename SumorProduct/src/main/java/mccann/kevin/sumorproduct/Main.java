package mccann.kevin.sumorproduct;

import java.util.Scanner;

/**
 * Created by kevinmccann on 1/12/17.
 */
public class Main {
    static Display printer = new Display();
    static DoMath mather = new DoMath();
    static Choice chooser = new Choice();

    public static void main(String args[]) {
        UserInterface UI = new UserInterface();
        int n = UI.getNum();
        long answer;
        do {
            String response = UI.getResponse();
            answer = chooser.answer(response, n);
        } while (answer == -1);
        printer.printLine(answer);
    }
}
