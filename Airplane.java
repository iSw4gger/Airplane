
package mooc;

import java.util.ArrayList;
import java.util.HashMap;

public class Airplane {
    
    HashMap<String, String> airplane;

    public Airplane(){
        
        this.airplane = new HashMap<String, String>();   
    }
    
    public void addAirplane(String airplaneID, String airplaneCapacity){
        
        airplane.put(airplaneID, airplaneCapacity);   
    }
    
    public ArrayList<String> airplaneList(){
        
        ArrayList<String> airplanes = new ArrayList<String>();
        for(String key : airplane.keySet()){
            airplanes.add(key + " (" +  capacity(key) + " people).");  
        }
        return airplanes;   
    }
    
    public String capacity(String capacity){
        
        String cap = airplane.get(capacity);
        return cap;
    }

    public String getName(String name){
        return name + "(" + this.airplane.get(name) + ") people.";
    }
}
