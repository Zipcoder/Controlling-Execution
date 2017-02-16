package capriotti.anthony.Cd12_redux;

/**
 * Created by anthonycapriotti on 2/16/17.
 */
public class Controller {
    IO io = new IO();
    SumOrProduct sumOrProduct = new SumOrProduct();

    public void run(){
        io.output(sumOrProduct.choice(io.choice(), io.numberSelection()));
    }
}
