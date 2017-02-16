/**
 * Created by danries on 2/16/17.
 */
public class Controller {

    String name;

    public void run(){
        Checker checker = new Checker();
        IO io = new IO();

        name = io.input();

        io.output(checker.checkName(name), name);
    }

}
