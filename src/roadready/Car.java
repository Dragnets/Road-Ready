package roadready;

/**
 *
 * @author Raitis Kupce
 * Provides a contract for
 * concrete classes such as Rectangle, Circle, Square
 */
public interface Car {
    /**
     * @return String giving type of car e.g. Vehicle, SuperSport, SportsVehicle
     */
    public String getTypeOfCar(); 
    
    public String getVehicleID();
  
   // public String getVehicleDateInStock();
    
    //public String getVehicleSoldDate();
      
}
