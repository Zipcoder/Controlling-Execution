package capriotti.anthony.Cd12_redux;

/**
 * Created by anthonycapriotti on 2/16/17.
 */
public class SumOrProduct {

    public int choice(String selection, int num){
        int answer = 0;
        if (selection.equalsIgnoreCase("Sum"))
            answer = sum(num);
        else if (selection.equalsIgnoreCase("Product"))
            answer = product(num);
        else
            System.out.println("pick again");
        return answer;
    }

    public int sum(int num){
        int answer = 0;
        for (int i = 0; i <= num; i++){
            answer += i;
        }
        return answer;
    }

    public int product(int num){
        int answer = 1;
        for (int i = 1; i <= num; i++){
            answer *= i;
        }
        return answer;
    }


}
