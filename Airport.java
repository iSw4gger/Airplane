
package mooc;

import java.util.ArrayList;
import java.util.Scanner;

public class Airport {

    Airplane airplane = new Airplane();
    Flight flight = new Flight();
    Scanner reader = new Scanner(System.in);
    
    public Airport(Scanner reader, Airplane airplane, Flight flight){
        this.reader = reader;
        this.airplane = airplane;
        this.flight = flight;
    }
    
    public void startAirportPanel(){
        boolean isTrue = true;
        while(isTrue){
            System.out.println("Choose Operation: ");
            System.out.println("-----------------");
            System.out.println("[1]Add Airplane  ");
            System.out.println("[2]Add Flight ");
            System.out.println("[x]Proceed to Flight Service ");
            System.out.println();
            System.out.print("Choice: ");

            String response = reader.nextLine();
        
            if(response.equals("1")){
                addAir("",""); 
            }
            else if(response.equals("2")){
                addFlight("", "", ""); 
            }
            else if(response.equals("x")){
                startFlightService();
            }
        }
    }
    
    public void startFlightService(){
        
        boolean isTrue = true;
        
        while(isTrue){
            System.out.println("Choose Operation: ");
            System.out.println("-----------------");
            System.out.println("[1]Print Planes  ");
            System.out.println("[2]Print Flight ");
            System.out.println("[3]Print Flight Info ");
            System.out.println("[x]Exit ");
            System.out.println();
            System.out.print("Choice: ");
            String response = reader.nextLine();
            
            if(response.equals("1")){
                printAirplanes();
            }
            else if(response.equals("2")){
                printFlight();
            }
            else if(response.equals("x")){
                isTrue = false;
            }
            else if(response.equals("3")){
                printPlaneInfo();
            }
        }
    }
    
    public void addAir(String airplaneID, String airplaneCapacity){
        
        System.out.print("Enter airplane ID: ");
        airplaneID = reader.nextLine();
        
        System.out.print("Enter airplane capacity: ");
        airplaneCapacity = reader.nextLine();
        
        airplane.addAirplane(airplaneID, airplaneCapacity);
    }
    
    
    public void addFlight(String airplaneID, String departureCode, String arrivalCode){
        
         System.out.print("Enter Plane ID: ");
         airplaneID = reader.nextLine();
         System.out.print("Give Departure Code: ");
         departureCode = reader.nextLine();
         System.out.print("Give Arrival Code: ");
         arrivalCode = reader.nextLine(); 
         System.out.println();
         //add to hashmap
         flight.addFlights(airplaneID, departureCode, arrivalCode);    
    }
    
    public void printAirplanes(){
        System.out.println();
        System.out.println();
        System.out.println("Airplane Information");
        System.out.println("------------------");
        for(String air : airplane.airplaneList()){
            System.out.println(air);
        }
        System.out.println();
    }
    
    public void printFlight(){
        System.out.println();
        System.out.println();
        System.out.println("Flight Information");
        System.out.println("------------------");
        for(String flights: flight.printFlight()){
            System.out.println(flights);
        }
        System.out.println();
    }
    
    public void printPlaneInfo(){
        
        System.out.print("Give the name of the plane: ");
        String name = reader.nextLine();
        System.out.println(airplane.getName(name));
            }
        }
        
    
    

    

