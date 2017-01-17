package ries.dan.SumofNums;

/**
 * Created by danries on 1/12/17.
 */
public class Solution {

    static int total = 0;

    public static int sum(int n){
        for (int i = 0; i <= n ; i++){
            total += i;
        }
        return total;
    }

}
