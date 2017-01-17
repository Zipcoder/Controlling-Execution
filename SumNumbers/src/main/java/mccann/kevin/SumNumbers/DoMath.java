package mccann.kevin.SumNumbers;

/**
 * Created by kevinmccann on 1/12/17.
 */
public class DoMath {
    public static int sum(int n) {
        int total = 0;
        for(int i = 0; i <= n; i++)
            total += i;
        return total;
    }
}
