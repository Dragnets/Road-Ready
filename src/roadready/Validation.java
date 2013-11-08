/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package roadready;

/**
 *
 * @author kupcer
 */
public class Validation {
    
    public static Boolean validVehicleID(String currentID){
       
        if ( currentID.length() < 5){
           return true;
        } else {
            return false;
        }        
    }    
    
    
    public static Boolean Condition(String state) {
        String[] valid = {"New","Used"};
            for (String word:valid){        
                if (state.equals(word)){
                    return true;
                }               
            }
            return false;
    }
    
    public static Boolean FuelType(String fuel) {
        String[] valid = {"Petrol", "Diesel", "BiFuel", "Eletric",
        "Hybrid", "Unlisted"};        
        for (String word:valid){
            if (word.equals(fuel)){
                return true;
                }
            }
        return false;
    }
    
    public static Boolean body(String type){
        String[] valid = {"Hatchback", "Saloon", "Estate", "Convertible", "MPV",
            "Couple", "Quatro", "Unlisted"};
        for (String word:valid){
            if(word.equals(type)){
                return true;
                }
            }
        return false;
    }
    
    public static Boolean transmission (String gearBoxType){
        String[] valid = {"Manua", "Automatic", "Semi auto", "Unlisted"};
        for (String word:valid){
            if(word.equals(gearBoxType)){
                return true;
            }
        }
        return false;
    }
    
}

