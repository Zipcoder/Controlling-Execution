package battin.preston;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by prestonbattin on 2/16/17.
 */
public class AliceAndBobGreeter {

    private String name;
    private Map<String, String> nameMap = new HashMap();

    AliceAndBobGreeter(String name){

        nameMap.put("ALICE", "Nice to see you Alice!");
        nameMap.put("BOB", "Hello Bob!");
        this.name = name;
    }

    public String greeter(){

        if(nameMap.get(name.toUpperCase()) != null){

            return nameMap.get(name.toUpperCase());
        }

        else
            return "I do not know you " + name;
    }
}
