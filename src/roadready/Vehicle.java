package roadready;
import java.util.Scanner;
import java.util.Currency;
import java.text.NumberFormat;
import java.util.Locale; //
/**
 *
 * @author kupcer
 */
public class Vehicle {
    
    String vehicleID; //Set the lenght of string !!!!!!
    String condition;
    String make;
    String Model; //String????
    String bodyType;
    String colour;
    String fuel; // Or list of String. 
    int manufactured;
    String transmission;
    int millage;
    String engineSize;
    int doortNR;
    Locale locale = new Locale("en","UK");
    String price;
    String description;
    // Photo ????????????
    
    public Vehicle (String ID, String condition, String make, String bodyType, String colour, 
            String fuel, int manufactured, String transmission, int millage, 
            String engineSize, int doorNR, String price, String description){
       
        //if (Validation.validVehicleID(ID)){
        //    this.vehicleID = ID;
        //}else{
        //    System.out.println("Please enter correct ID code");
            
       // }
        
        setCondition(condition);
        this.make = make;
        this.bodyType = bodyType;
        this.colour = colour;
        this.fuel = fuel;
        this.manufactured = manufactured;
        this.transmission = transmission;
        this.millage = millage;
        this.engineSize = engineSize;
        this.doortNR = doorNR;
        //Locale local = new Locale("en","UK");
        //NumberFormat fmt = NumberFormat.getCurrencyInstance(locale);
        //this.price = fmt.format(price);
        this.price=price;
        this.description = description;
    }
    
    public static String scanner(){
            Scanner in = new Scanner(System.in);
            String newWord = in.next();
            return newWord;
    }
    
    public void setCondition(String state){
        if(Validation.Condition(state)){
           this.condition = state;
        }else {
            System.out.println("Please enter Used or New");
            setCondition(scanner());
        }
    }
    
    public void setFuelType(String fuel) {
        if(Validation.FuelType(fuel)){
            this.fuel = fuel;
        }else{
            setFuelType(scanner());
        }
    }
    
    public void setbody(String type) {
        if(Validation.body(type)){
            this.bodyType = type;
        }else{
            setbody(scanner());
        } 
    }
    
    public void  setTrans (String gearBoxType){
        if(Validation.transmission(gearBoxType)){
            this.transmission = gearBoxType;
        }else{
            setTrans(scanner());
        } 
    }
    
    
    @Override
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
                "\n Description: "+this.description);
    }
}
