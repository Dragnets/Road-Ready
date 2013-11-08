package roadready;
import java.util.Currency;
import java.text.NumberFormat;
import java.util.Locale; //
/**
 *
 * @author kupcer
 */
public class Vehicle {
    
    String vehicleID; //Set the lenght of string !!!!!!
    state condition;
    String make;
    //Model; Int+String????
    String bodyType;
    String colour;
    Fuel fuel; // Or list of String. 
    int manufactured;
    Enum transmission;
    int millage;
    String engineSize;
    int doortNR;
    Locale locale = new Locale("en","UK");
    NumberFormat price;
    String description;
    // Photo ????????????
    
    public Vehicle (String ID, Enum condition, String make, String bodyType, String colour, 
            Enum fuel, int manufactured, Enum transmission, int millage, 
            String engineSize, int doorNR, String price, String description){
       
        if (validVehicleID(ID)){
            this.vehicleID = ID;
        } else {
            System.out.println("Please enter correct ID code");
        }
        
        this.condition = condition;
        this.make = make;
        this.bodyType = bodyType;
        this.colour = colour;
        this.fuel = fuel;
        this.manufactured = manufactured;
        this.transmission = transmission;
        this.millage = millage;
        this.engineSize = engineSize;
        this.doortNR = doorNR;
        this.price = NumberFormat.getCurrencyInstance(locale);
        this.price.format(price);
        this.description = description;
        
    }
    
    public enum state {
        New,Used,
    }
    
    public enum Fuel {
        Petrol, Diesel, BiFuel, Eletric, Hybrid, Unlisted
    }
    
    
    public Boolean validVehicleID(String currentID){
       
        if ( currentID.length() < 5){
           return true;
        } else {
            return false;
        }        
        
    }
    
    public String toString () {
        return ("Vehicle ID: "+this.vehicleID+
                "\n Condition: "+this.condition+
                "\n Make: "+this.make+
                "\n Body Type: "+this.make+
                "\n Colour: "+this.colour+
                "\n Fuel: "+this.fuel+
                "\n Manufactured"+this.manufactured+
                "\n Transmission"+this.transmission+
                "\n Millage: "+this.millage+
                "\n Engine Size: "+this.engineSize+
                "\n No Of Door: "+this.doortNR+
                "\n Price: "+this.price+
                "\n Description"+this.description);
    }
}
