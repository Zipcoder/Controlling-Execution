package holland.andres.sumorproduct;

public class ProgramLogic {
    public void programLogic () {

        int result;

        AskUserChoice askUserChoice = new AskUserChoice();
        String choice = askUserChoice.getChoice();

        if (choice.equalsIgnoreCase("sum")) {
            CalculateSum calculateSum = new CalculateSum();
            result = calculateSum.getSum();
        }
        else {
            CalculateProduct calculateProduct = new CalculateProduct();
            result = calculateProduct.getProduct();
        }

        System.out.println(result);
    }
}
