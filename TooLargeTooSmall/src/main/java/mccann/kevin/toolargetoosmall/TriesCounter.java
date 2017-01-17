package mccann.kevin.toolargetoosmall;

/**
 * Created by kevinmccann on 1/12/17.
 */
public class TriesCounter {
    public static int counter = 0;

    public static int addOne() {
        return counter++;
    }
    public static int getCounter() {
        return counter;
    }
}
