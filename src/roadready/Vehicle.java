package roadready;

import java.util.Scanner;
import java.util.Currency;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale; // Find out wehther needed
import java.util.GregorianCalendar;
import java.util.TimeZone;
/**
 *
 * @author Raitis Kupce
 */
public class Vehicle implements Car{

    String vehicleID; //Set the lenght of string !!!!!!
    String condition;
    String make;
    String model; //String????
    String bodyType;
    String colour;
    String fuel; // Or list of String. 
    int manufactured;
    String transmission;
    int millage;
    String engineSize;
    int doorNR;
    Locale locale = new Locale("en", "UK");
    String price;
    String description;
    Calendar calendar;
    String dateInMarket;
    String soldDate = "Still In stock";
    

    public Vehicle(String ID, String condition, String make, String model, String bodyType,
            String colour, String fuel, int manufactured, String transmission,
            int millage,String engineSize, int doorNR, String price,
            String description) throws ProductException {

        if (!Validation.validCode(ID)) {
            throw new ProductException("Invalid ID");
        }
        if(!Validation.Condition(condition)){
            throw new ProductException("Invalid Condition");
        }
        
        if(!Validation.body(bodyType)){
            throw new ProductException("Invalid Body type");
        }
        if(!Validation.FuelType(fuel)){
            throw new ProductException("Invalid Fuel Type");
        }
        if(!Validation.transmission(transmission)){
            throw new ProductException("Invalid transmision");
        }
        this.vehicleID = ID;
        this.condition = condition;
        this.make = make;
        this.model=model;
        this.bodyType = bodyType;
        this.colour = colour;
        this.fuel = fuel;
        this.manufactured = manufactured;
        this.transmission = transmission;
        this.millage = millage;
        this.engineSize = engineSize;
        this.doorNR = doorNR;
        //Locale local = new Locale("en","UK");
        //NumberFormat fmt = NumberFormat.getCurrencyInstance(locale);
        //this.price = fmt.format(price);
        this.price = price;
        this.description = description;
        dateVehicleInStock();
    }
    
    public String getVehicleID(){
        return this.vehicleID;
    }
    
    // Set up current date
    public String gregorianCalendar(){
        calendar = new GregorianCalendar(TimeZone.getTimeZone("GMT+0"));
        Date now = new Date();
        calendar.setTime(now);

        int day   = calendar.get(Calendar.DAY_OF_MONTH);
        int month = calendar.get(Calendar.MONTH);
        int year  = calendar.get(Calendar.YEAR);
        String monthName = new SimpleDateFormat("MMM").format(month);
        
        String currentDate = "" +day+" "+monthName+" "+year;
        return currentDate;
    }
    
    // date when introduced
    public void dateVehicleInStock(){
        dateInMarket = gregorianCalendar();
    }
    //get date in market
    public String getVehicleDateInStock(){
        return dateInMarket;
    }
    
    //set up date when sold
    public void vehicleSold(){
        soldDate = gregorianCalendar();
    }
    public String getVehicleSoldDate(){
        return soldDate;
    }

    /**
     * Gets the type of car
     * @return the String "Vehicle"
     */
    @Override
    public String getTypeOfCar(){
        return "Vehicle";
    }
    @Override
    public String toString() {
        return ("Vehicle ID: " + this.vehicleID
                + "\n Condition: " + this.condition
                + "\n Make: " + this.make
                + "\n Model: " + this.model
                + "\n Body Type: " + this.bodyType
                + "\n Colour: " + this.colour
                + "\n Fuel: " + this.fuel
                + "\n Manufactured: " + this.manufactured
                + "\n Transmission: " + this.transmission
                + "\n Millage: " + this.millage
                + "\n Engine Size: " + this.engineSize
                + "\n No Of Door: " + this.doorNR
                + "\n Price: " + this.price
                + "\n Description: " + this.description
                + "\n Date introduced into market: "+ this.dateInMarket
                + "\n Date it was sold: " + this.soldDate);
    }
}




/*
   public static String scanner() {
        Scanner in = new Scanner(System.in);
        String newWord = in.next();
        return newWord;
    }

    public void setCondition(String state) {
        if (Validation.Condition(state)) {
            this.condition = state;
        } else {
            System.out.println("Please enter Used or New");
            setCondition(scanner());
        }
    }

    public void setFuelType(String fuel) {
        if (Validation.FuelType(fuel)) {
            this.fuel = fuel;
        } else {
            setFuelType(scanner());
        }
    }

    public void setbody(String type) {
        if (Validation.body(type)) {
            this.bodyType = type;
        } else {
            setbody(scanner());
        }
    }

    public void setTrans(String gearBoxType) {
        if (Validation.transmission(gearBoxType)) {
            this.transmission = gearBoxType;
        } else {
            setTrans(scanner());
        }
    }
*/