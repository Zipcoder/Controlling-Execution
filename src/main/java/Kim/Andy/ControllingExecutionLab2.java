package Kim.Andy;

import java.util.Scanner;

/**
 * Created by andykim on 2/16/17.
 */
public class ControllingExecutionLab2 {

    public String greeting(String name){
        String greeting;
        if (name.equals("Alice") || name.equals("Bob"))
            greeting = "Sup " + name;

        else
            greeting = "Naw homie";

        return greeting;
    }
}
