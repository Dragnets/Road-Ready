package roadready;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Raitis Kupce
 * Presents contents of given csv file and data for searched Vehicle
 */
public class Controller {
    
    /**
     * The Constructor
     */
    public Controller() {
    }
    
    /**
     * Pass the csv file to CatalogueReader and  represents it. Represents 
     * the use of finding vehicle in catalogue.
     */
    public void run() {
        Scanner fileName = new Scanner(System.in);
        System.out.print("Enter File name: ");
        Catalogue sportCars = new Catalogue();

        try {
            CatalogueReader newCatalogue = new CatalogueReader(fileName.next()); // Next() Convert to string
            sportCars = newCatalogue.getCatalogue();
            sportCars.soldVehicle("KOHL485"); //Stage 3 Q3 list of in stock
            ArrayList<Car> mylist = sportCars.getProductInStock();
            int num = 1;
            for (Car obj : mylist) {
                System.out.println("\nVehicle " + num);
                System.out.println(obj);
                num++;
            }
        } catch (FileNotFoundException e) {
            System.out.println("Not a valid file, enter again");
            run();
        } catch (ProductException e) {
            System.out.println(e);
        }

        String escapeWord = "Exit";
        Boolean exit = true;
        while (exit) { 
            System.out.print("\nPlease enter Vehicle ID: ");
            Scanner keyword = new Scanner(System.in);
            String vehicleID = keyword.next();
            if (!vehicleID.equals(escapeWord)) {
                try {
                    Car mycar = sportCars.findVehicle(vehicleID); 
                    System.out.println(mycar);
                } catch (ProductException e) {
                    System.out.println(e);
                }
            }
            if (vehicleID.equals(escapeWord)) {
                exit = false; 
            }
        }
    }
}
