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
       while (csvFile.hasNext()) {
           dataRow = csvFile.next();
           if (first){
               first = false;
               continue;
           }
           String[] fields = dataRow.split(",");
           String vehicleID    = fields[0].trim();
           String condition    = fields[1].trim();
           String make         = fields[2].trim();
           String model        = fields[3].trim();
           String bodyType     = fields[4].trim();
           String colour       = fields[5].trim();
           String fuel         = fields[6].trim();
           int manufactured    = Integer.parseInt(fields[7].trim());
           String transmission = fields[8].trim();
           int millage         = Integer.parseInt(fields[9].trim());
           String engineSize   = fields[10].trim();
           int doorNR         = Integer.parseInt(fields[11].trim());
           String price        = fields[12].trim();
           String description  = fields[13].trim();
           
           Vehicle newVehicle = new Vehicle(vehicleID,condition,make,model,bodyType,
                   colour,fuel,manufactured,transmission,millage,engineSize,
                   doorNR, price, description);
           //System.out.println(newVehicle); Use for to check wether can read 
           this.catalogue.addVehicle(newVehicle);
           }
       }
   
       public Catalogue getCatalogue(){
           return this.catalogue;
       
    }
}
