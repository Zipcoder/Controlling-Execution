package ControllingExecution;

import java.util.*;

/**
 * Created by randallcrame on 1/12/17.
 */
public class SumOrProduct {
    Scanner input = new Scanner(System.in);
    public Integer sumLoop(Integer number) {
        int totalSum = 0;
        for (int i = 0; i<=number;i++) {
            totalSum+=i;
        }
        return totalSum;
    }
    public int productLoop(int number) {
        int totalProduct = 1;
        for (int j = 1; j<=number;j++){
           totalProduct*=j;
        }
        return totalProduct;
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
    public void doWork (Integer number, String command) {
        switch (command) {
            case "Sum":
                System.out.println(this.sumLoop(number));
                break;
            case "Product":
                System.out.println(this.productLoop(number));
                break;
            default:
                System.out.println("Invalid Command");
        }
    }
    public static void main (String[] args) {
        SumOrProduct myInput = new SumOrProduct();
        myInput.doWork(myInput.usersInputNumber(), myInput.usersInputProductOrSum());
    }
}
