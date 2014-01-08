package roadready;

import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;
/**
 *
 * @author Raitis Kupce
 * This class is a representation of a Vehicle, implements Car
 */

public class Vehicle implements Car{
    /** Current vehicle ID */
    String vehicleID; //Set the lenght of string !!!!!!
    /** Current Vehicle condition */
    String condition;
    /** Current vehicle make */
    String make;
    /** Current vehicle model */
    String model;
    /** Current vehicle bodyType */
    String bodyType;
    /** Current vehicle colour */
    String colour;
    /** Current vehicle fuel */
    String fuel;
    /** Current vehicle manufactured date */
    int manufactured;
    /** Current vehicle transmission type */
    String transmission;
    /** Current vehicle millage */
    int millage;
    /** Current vehicle engine size */
    String engineSize;
    /** Current vehicle door amount */
    int doorNR;
    /** Current vehicle price */
    String price;
    /** Current vehicle description */
    String description;
    /** Current vehicle calendar */
    Calendar calendar;
    /** Current vehicle date it was introduced */
    String dateInMarket;
    /** Current vehicle date when it was sold if was */
    String soldDate = "Still In stock";
    
    /**
     * The constructor
     * Sets up initial values for ID, condition,make,model,bodyType,colour,fuel,
     * manufacture,transmission,millage,engineSize,doorNR,price,description,
     * check if given value is valid and sets up initial value for date in market.
     * @param ID
     * @param condition
     * @param make
     * @param model
     * @param bodyType
     * @param colour
     * @param fuel
     * @param manufactured
     * @param transmission
     * @param millage
     * @param engineSize
     * @param doorNR
     * @param price
     * @param description
     * @throws ProductException if product is not valid
     */
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
        this.price = price;
        this.description = description;
        dateVehicleInStock();
    }
    
    /**
     * Gets the vehicleID of the vehicle
     * @return price
     */
    @Override
    public String getVehicleID(){
        return this.vehicleID;
    }
    
    /**
     * Gets the price of the vehicle 
     * @return price
     */
    public String getPrice(){
        return this.price; 
    }
    
    /**
     * Set up current time 
     * @return current date
     */
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
    
    /**
     * Sets a new date for the vehicle
     */
    public void dateVehicleInStock(){
        dateInMarket = gregorianCalendar();
    }
    
    /**
     * Gets the date vehicle was introduced
     * @return date
     */
    public String getVehicleDateInStock(){
        return dateInMarket;
    }
    
    /**
     * Sets a new date when vehicle was sold
     */
    public void vehicleSold(){
        soldDate = gregorianCalendar();
    }
    
    /**
     * Gets the date vehicle was sold
     * @return 
     */
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
    
    /**
     * Generates a string showing the data for the vehicle
     * @return date about the vehicle
     */
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
                + "\n Price: " + '\u00A3'+this.getPrice()
                + "\n Description: " + this.description
                + "\n Date introduced into market: "+ this.dateInMarket
                + "\n Date it was sold: " + this.soldDate);
    }
}
