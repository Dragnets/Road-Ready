package roadready;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Raitis Kupce
 */
public class RoadReadyDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ProductException, FileNotFoundException  {
        /*
        String code = "ABCD589";
        String code2 = "ABDDD534";
        String cond = "Used";
        String body = "Saloon";
        String trans = "Manual";
        String fuel = "Diesel";
        */
        
        /*
        if(!Validation.validCode(code));
        Validation.Condition(cond);
        Validation.body(body);
        Validation.FuelType(fuel);
        Validation.transmission(trans);
        */
        
        Catalogue car = new Catalogue();
        try {        
            Vehicle a = new Vehicle("ACDD589", "Used", "BMW","525", "Saloon", "Red",
                    "Diesel", 2007, "Manual", 18560,"1896c", 5, "5000", "Wonderfull car");
            car.addVehicle(a);  //Stage 1 Q4   
        }catch(ProductException e){
            System.out.println(e);
        }
        try{
        Vehicle b = new Vehicle("ABCD786", "New", "BMW","535", "Saloon", "Red","Diesel", 2007, "Manual", 18560,"1896c", 5, "5000", "Beatifull car");
        car.addVehicle(b); //Stage 1 Q4
        }catch(ProductException e){
            System.out.println("\n error found for Object b : "+e);
        }
        
        // Sage 1 Q4  Display The Caalogue
        /*ArrayList<Vehicle> mylist = car.getAllProducts();
        int num = 1;
        for (Vehicle obj : mylist) {
            System.out.println("\nVehicle "+num+"\n"+obj);
            num++;
        }*/
        // Stage 1 Q4 FindProduct 
        
        //Vehicle myVehicle = car.findVehicle("ACD786");
            //if (myVehicle == null){
            //    System.out.println("No record of this VehicleID");
            //} else{
            //    System.out.println("\n Found A Vehicle: \n"+myVehicle);
                       
        

        /* Manager Choice 
        Vehicle managerChoice = car.starProduct();
        System.out.println(managerChoice);
        */  
        
        // TESTING CSV FILE
        /*Scanner fileName = new Scanner(System.in);
        System.out.println("Filen Name: ");
        fileName.hasNext();
        
        try{
            CatalogueReader SportCar = new CatalogueReader(fileName.next());
        }catch (FileNotFoundException e){
            System.out.println("File Not Found");
        }catch (ProductException e){
            System.out.println(e);
        }*/  
    }   
}
