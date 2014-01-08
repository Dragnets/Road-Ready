package roadready;

import java.util.ArrayList;
import java.util.Random;

/**
 * Provides a contract for
 * concrete classes such as SuperSport and SportsVehicle
 * @author Raitis Kupce
 */
public class Catalogue {
    
    /** Stored value of the manager choice */
    private Car managerChoice;
    /** Instance to generate random number */    
    private Random randomGenerator;
    /** The ArrayList of the vehicle */
    private ArrayList<Car> vehicle= new ArrayList<>();
    /** The count of vehicles presented */
    private int totalVehicle;
    
    /**
     * The constructor
     */
    public Catalogue() {
                              
    }
    
    /**
     * Add a vehicle and update total vehicle
     * @param newCar the instance Car passed in
     */
    public void addVehicle( Car newCar){ //Stage 2 Q4
        this.vehicle.add(newCar);
        this.totalVehicle ++;
    }
    
    /**
     * Get the cars presented so far
     * @return cars as a ArrayList
     */
    public ArrayList getAllProducts(){ //Stage2 Q4
        return this.vehicle;
    }
    public void soldVehicle(String vehicleID) throws ProductException{
        Car myvehicle = this.findVehicle(vehicleID);
        myvehicle.vehicleSold();
    }
    
    public ArrayList getProductInStock(){
        ArrayList<Car> newList = new ArrayList<>();
        for (Car obj:vehicle){
            if (obj.getVehicleSoldDate().equals("Still In stock")){
                newList.add(obj);
            }
            
        }
        return newList;
    }
    /**
     * Find the vehicle by id
     * @param id the instance Car for look up 
     * @return the Car
     * @throws ProductException if vehicleID is not found
     */
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
    
    /**
     * Pick ups a random Car in catalogue
     * @return the Car
     */
    public Car starProduct(){
        
        randomGenerator = new Random();
        int target = randomGenerator.nextInt(this.totalVehicle);
        this.managerChoice = vehicle.get(target);
        
        return managerChoice;    
        }
}