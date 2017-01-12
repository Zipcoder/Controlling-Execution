package mccann.kevin.sumorproduct;

/**
 * Created by kevinmccann on 1/12/17.
 */
public class DoMath {
    public int sum(int n) {
        int total = 0;
        for(int i = 0; i <= n; i++)
            total += i;
        return total;
    }

    public long product(int n) {
        long total = 1;
        for(int i = 1; i <= n; i++)
            total *= i;
        return total;
    }
}
