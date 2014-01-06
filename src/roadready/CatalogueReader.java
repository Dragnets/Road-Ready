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
    //private ArrayList<Vehicle> catalogue = new ArrayList<>();
    //private Catalogue catalogue = null;
    private Catalogue catalogue = new Catalogue();
    
   public CatalogueReader(String fileName) throws FileNotFoundException, ProductException{
       
      // try {
       this.csvFile = new Scanner(new File(fileName));
       //} catch (FileNotFoundException e){
          // System.out.println("Not a valid file name, try again");
       
       csvFile.useDelimiter("\n");
       String dataRow = new String();
       boolean first = true;
       int a = 0;
       while (csvFile.hasNext()) {
          dataRow = csvFile.next();
          String[] fields = dataRow.split(",");
          String carType = "";
          
          
          if (first){
              System.out.println("Check");
              for (char c: fields[0].trim().toCharArray()){
                if (Character.isDigit(c)) { //check if first is ID or field
                    a = 1;
                    carType = fields[1].toLowerCase().trim();
                    first = false;
                   break;
                }else{ 
                    continue;
                }
              }
              if(a == 0){
                  first = false;
                  continue;
              }   
           }
           String vehicleID    = fields[0].trim();
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
           System.out.println("End");
           if (carType.equals("sport")){
               Boolean modification = Boolean.valueOf(fields[15].trim());
               String detailsOfModification = fields[16].trim();
               SportsVehicle sport = new SportsVehicle(vehicleID,condition,make,model,bodyType,
                   colour,fuel,manufactured,transmission,millage,engineSize,
                   doorNR, price, description, modification, 
                   detailsOfModification);
           }
           if (carType.equals("supercar")){
               String maxSpeed = fields[15].trim();
               SuperSport sport = new SuperSport(vehicleID,condition,make,model,bodyType,
                   colour,fuel,manufactured,transmission,millage,engineSize,
                   doorNR, price, description, maxSpeed);
           }else{
           Vehicle newVehicle = new Vehicle(vehicleID,condition,make,model,bodyType,
                   colour,fuel,manufactured,transmission,millage,engineSize,
                   doorNR, price, description);
           //System.out.println(newVehicle); Use for to check wether can read 
           this.catalogue.addVehicle(newVehicle);
           }
       }
   }
   public Catalogue getCatalogue(){
       return this.catalogue;
    }
}