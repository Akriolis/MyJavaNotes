import java.util.ArrayList;
import java.util.HashMap;

public class Car {
    Car (String brand, int PS, String model){

    }

    HashMap <String, String> maintenance = new HashMap<>();

    HashMap <String, String> errors = new HashMap<>();

    void addMaintenance (){
        maintenance.putAll(errors);
    }

    boolean isBroken;

    public String drive (){
        if (isBroken){
            return "Car is broken";
        } else {
            return "Car is ready to drive";
        }
    }


}
