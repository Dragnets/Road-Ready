package roadready;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Raitis Kupce
 */
public class CatalogueReader {
   
    private Scanner csvFile; 

    private Catalogue catalogue = new Catalogue();
    
    //Catalogue sc = new Catalogue();
    
    Car car;
    
    /**
     * Reads  Two type of csv file, Only Vehicle class and mixs
     * @param fileName
     * @throws FileNotFoundException
     * @throws ProductException 
     */
   public CatalogueReader(String fileName) throws FileNotFoundException, ProductException{
       
      // try {
       this.csvFile = new Scanner(new File(fileName));
       //} catch (FileNotFoundException e){
          // System.out.println("Not a valid file name, try again");
       
       csvFile.useDelimiter("\n");
       String dataRow = new String();
       boolean first = true;
       int a = 0;
       String carType = "";
       while (csvFile.hasNext()) {
          dataRow = csvFile.next();
          String[] fields = dataRow.split(",");
          
          if (first){
              for (char c: fields[0].trim().toCharArray()){
                if (Character.isDigit(c)) { //check if first is ID or field
                    a = 1;
                    first = false;
                   break;
                }else{ 
                    continue;
                }
              } 
              if(a == 0){ // skip first line if there is a field
                  first = false;
                  continue;
              }   
           }
           String vehicleID    = fields[0].trim();
           //System.out.println(vehicleID);
           String condition    = fields[1+a].trim();
           String make         = fields[2+a].trim();
           String model        = fields[3+a].trim();
           String bodyType     = fields[4+a].trim();
           String colour       = fields[5+a].trim();
           String fuel         = fields[6+a].trim();
           int manufactured    = Integer.parseInt(fields[7+a].trim());
           String transmission = fields[8+a].trim();
           int millage         = Integer.parseInt(fields[9+a].trim());
           String engineSize   = fields[10+a].trim();
           int doorNR         = Integer.parseInt(fields[11+a].trim());
           String price        = fields[12+a].trim();
           String description  = fields[13+a].trim();
           
           
           if (a==1){ // Only perfome if different type of cars in file
               carType = fields[1].toLowerCase().trim();
           }
              switch (carType) {
                  case "sport":
                      Boolean modification = Boolean.valueOf(fields[15].trim());
                      String detailsOfModification = fields[16].trim();
                      this.car = new SportsVehicle(vehicleID, condition, make, model, bodyType,
                              colour, fuel, manufactured, transmission, millage, engineSize,
                              doorNR, price, description, modification,
                              detailsOfModification);
                      break;
                  case "supercar":
                      String maxSpeed = fields[15].trim();
                      this.car = new SuperSport(vehicleID, condition, make, model, bodyType,
                              colour, fuel, manufactured, transmission, millage, engineSize,
                              doorNR, price, description, maxSpeed);
                      break;
                  default:
                      this.car = new Vehicle(vehicleID, condition, make, model, bodyType,
                              colour, fuel, manufactured, transmission, millage, engineSize,
                              doorNR, price, description);
                      break;
              }
               this.catalogue.addVehicle(car);      
       } // While loop close
   }
   
   /**
    * Gets the catalogue
    * @return Catalogue 
    */
   public Catalogue getCatalogue(){
       return this.catalogue;
    }
}


           //else{
           //    System.out.println("URAA");
           //    Vehicle vehicle = new Vehicle(vehicleID, condition, make, model, bodyType,
           //                colour, fuel, manufactured, transmission, millage, engineSize,
           //                doorNR, price, description);
           //    this.catalogue.addVehicle(vehicle);
          // }