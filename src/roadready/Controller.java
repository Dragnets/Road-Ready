package roadready;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Raitis Kupce
 */
public class Controller {
    
    public Controller(){
        
    }
    
    public void run()  {
        Scanner fileName = new Scanner(System.in);
        System.out.print("Enter File name: ");
        Catalogue sportCars = new Catalogue();
        
        try{
        CatalogueReader newCatalogue = new CatalogueReader(fileName.next()); // Next() Convert to string
        sportCars = newCatalogue.getCatalogue();
        ArrayList<Vehicle>mylist = sportCars.getAllProducts();
        int num = 1;
         for (Vehicle obj:sportCars){
             //DISPLAY LIST FROM CSV LOOK UP ROAD DEMO....
         }
        
        
        String escapeWord = "Exit";
        Scanner keyword = new Scanner(System.in); // What is this for?
        while (!keyword.next().equals(escapeWord)){
            sportCars.findVehicle(keyword.next());
        }
        }catch (FileNotFoundException e){
            System.out.println("Not a valid file, enter again");
        }catch (ProductException e){
            System.out.println(e);
        }   
        }
    
}
