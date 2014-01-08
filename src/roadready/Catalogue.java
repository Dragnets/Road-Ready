package roadready;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Raitis Kupce
 */
public class Catalogue {
    
    private Car managerChoice;
        
    private Random randomGenerator;
    
    private ArrayList<Car> vehicle= new ArrayList<>();
    
    private int totalVehicle;
    public Catalogue() {
                              
    }
    
    public void addVehicle( Car newCar){
        this.vehicle.add(newCar);
        this.totalVehicle ++;
    }
    
    public ArrayList getAllProducts(){
        return this.vehicle;
    }
    public Car findVehicle(String id) throws ProductException{
        Car matchID = null;
        for(Car a:vehicle){
            String currentID = a.getVehicleID();
            if(currentID.equals(id)){
                matchID = a;
            }
        }
        if(matchID == null){
            throw new ProductException("Vehicle not found");
        }
   
    return matchID;
    }
    
    public Car starProduct(){
        
        randomGenerator = new Random();
        int target = randomGenerator.nextInt(this.totalVehicle);
        this.managerChoice = vehicle.get(target);
        System.out.println("My Target: "+target);
        
        return managerChoice;    
        }
}