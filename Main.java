
package mooc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args){
        
        Airplane airplane = new Airplane();
        Flight flight = new Flight();
        Scanner reader = new Scanner (System.in);
        
        Airport airport = new Airport(reader, airplane, flight);
        airport.startAirportPanel();
  
    }

}        
       
        
    
