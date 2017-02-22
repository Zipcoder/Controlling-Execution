package ControllingExecution;

import java.util.*;

/**
 * Created by randallcrame on 1/12/17.
 */
public class SumOrProduct {
    Scanner input = new Scanner(System.in);

    public int productLoop(int number) {
        return (number <= 1) ? 1 : productLoop(number -1 ) * number;
    }
    public Integer usersInputNumber(){
        System.out.print("What is your number?");
        Integer numberInput = input.nextInt();
        return numberInput;
    }
    public String usersInputProductOrSum(){
        System.out.print("Do you want the Product or Sum?");
        String stringInput = input.next();
        return stringInput;
    }
    public int doWork (Integer number, String command) {
        switch (command) {
            default:
            case "Sum":
                return(SumLoop.sumLoop(number));
            case "Product":
                return (this.productLoop(number));
        }
    }
    public static void main (String[] args) {
        SumOrProduct myInput = new SumOrProduct();
        int number = myInput.usersInputNumber();
        String response = myInput.usersInputProductOrSum();
        System.out.println(myInput.doWork(number, response));
    }
}
