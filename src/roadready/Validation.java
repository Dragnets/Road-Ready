/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package roadready;

/**
 *
 * @author Raitis Kupce
 */
public class Validation {
    
    public static Boolean validCode(String currentID){
        Boolean status;
        if (currentID.matches("[A-Z][A-Z][A-Z][A-Z][0-9][0-9][0-9]")){ //Only English Character allowed
            status = true;
        } else {
            status = false;
        }
        return status;
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
    
    public static Boolean transmission (String gearBoxType){
        String[] valid = {"Manual", "Automatic", "Semi auto", "Unlisted"};
        for (String word:valid){
            if(word.equals(gearBoxType)){
                return true;
            }
        }
        return false;
    }
}