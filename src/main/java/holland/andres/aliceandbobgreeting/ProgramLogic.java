package holland.andres.aliceandbobgreeting;

public class ProgramLogic {

    public boolean programLogic() {
        AskUser whatIsYourName = new AskUser();
        String name = whatIsYourName.getName();
        if (name.equalsIgnoreCase("Alice") || name.equalsIgnoreCase("Bob")) {
            System.out.println("Hey");
            return true;
        }
        return false;
    }
}
