package roadready;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Raitis Kupce
 */
public class Catalogue {
    
    private Vehicle managerChoice;
        
    private Random randomGenerator;
    
    private ArrayList<Vehicle> vehicle= new ArrayList<>();
    
    private int totalVehicle;
    public Catalogue() throws ProductException{
                              
     
    }
    public void addVehicle( Vehicle newCar){
        this.vehicle.add(newCar);
        this.totalVehicle ++;
    }
    
    public ArrayList getAllProducts(){
        return this.vehicle;
    }
    public Vehicle findVehicle(String id){
        Vehicle matchID = null;
        for(Vehicle a:vehicle){
            String currentID = a.getVehicleID();
            //System.out.println(a+"NOW");
            if(currentID.equals(id)){
                matchID = a;
            }
        }
        //if ( matchID == null){
            //return "No record of this ID";
        
               
    return matchID;
    }
    
    public Vehicle starProduct(){
        
        randomGenerator = new Random();
        int target = randomGenerator.nextInt(this.totalVehicle);
        this.managerChoice = vehicle.get(target);
        System.out.println("My Target: "+target);
        
        return managerChoice;    
        }
}
