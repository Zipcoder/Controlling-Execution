package armstrong.alexandra;

/**
 * Created by alexandraarmstrong on 1/13/17.
 */
public class PrintToConsole {
    private String message;

    PrintToConsole(){}
    PrintToConsole(String message){
        this.message = message;
    }

    public String getMessage(){
        return message;
    }

    public void setMessage(String message){
        this.message = message;
    }

    public void printlnToConsole(){
        System.out.println(getMessage());
    }

    public void printToConsole(){
            System.out.print(getMessage());
    }
}
