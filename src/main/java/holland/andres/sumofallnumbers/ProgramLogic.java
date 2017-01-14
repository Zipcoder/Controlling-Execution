package holland.andres.sumofallnumbers;

public class ProgramLogic {

    public int calculateSum () {
            AskUser askUser = new AskUser();
            int number = askUser.getInput();
            int sum = 0;
            for (int current = number; current > 0; current --) {
                sum += current;
            }
            System.out.println(sum);
            return sum;
    }
}
