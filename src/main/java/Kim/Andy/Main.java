package Kim.Andy;

import java.util.Scanner;

/**
 * Created by andykim on 2/16/17.
 */
public class Main {
    public static void main(String[] args) {
        ControllingExecutionLab2 controllingExecutionLab2 = new ControllingExecutionLab2();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Whats your name?");
        String name = scanner.nextLine();
        System.out.println(controllingExecutionLab2.greeting(name));
    }
}
