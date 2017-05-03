
package mooc;

import java.util.ArrayList;
import java.util.HashMap;

public class Flight {
    
    HashMap<String, String> flights;

    public Flight(){
        
        this.flights = new HashMap<String, String>();
    }
    
    public void addFlights(String airplaneID, String departureCode, String arrivalCode){
        
        String codes = departureCode + " to " + arrivalCode;
        flights.put(airplaneID, codes);   
    }
    
    public ArrayList<String> printFlight(){
        
        ArrayList<String> flightList = new ArrayList<String>();
        for(String key : flights.keySet()){
            flightList.add(key + " " + codes(key));
        } 
        return flightList;
    }
    
    public String codes(String code){
        String cod = flights.get(code);
        return cod;
    }
}