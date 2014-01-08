package roadready;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Raitis Kupce
 */
public class Controller {

    public Controller() {
    }

    public void run() {
        Scanner fileName = new Scanner(System.in);
        System.out.print("Enter File name: ");
        Catalogue sportCars = new Catalogue();

        try {
            CatalogueReader newCatalogue = new CatalogueReader(fileName.next()); // Next() Convert to string
            sportCars = newCatalogue.getCatalogue();
            ArrayList<Car> mylist = sportCars.getAllProducts();
            //System.out.println(mylist);
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
        while (exit) { // Does not exit if csv typed incorect first time.
            System.out.print("Please enter Vehicle ID: ");
            Scanner keyword = new Scanner(System.in);
            String vehicleID = keyword.next();
            if (!vehicleID.equals(escapeWord)) {
                try {
                    Car mycar = sportCars.findVehicle(vehicleID); /// HMmmm car???? interface
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
