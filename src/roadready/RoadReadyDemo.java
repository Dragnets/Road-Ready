package roadready;

import java.util.ArrayList;

/**
 *
 * @author Kupce Raitis
 */
public class RoadReadyDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ProductException  {
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
            Vehicle a = new Vehicle("ABCD589", "Used", "BMW", "Saloon", "Red",
                    "Diesel", 2007, "Manual", 18560,"1896c", 5, "5000", "Wonderfull car");
            car.addVehicle(a);  //Stage 1 Q4   
        }catch(ProductException e){
            System.out.println(e);
        }
        try{
        Vehicle b = new Vehicle("ABCD786", "New", "BMW", "Saloon", "Red","Diesel", 2007, "Manual", 18560,"1896c", 5, "5000", "Beatifull car");
        car.addVehicle(b); //Stage 1 Q4
        }catch(ProductException e){
            System.out.println("\n error found for Object b : "+e);
        }
        
        // Sage 1 Q4  Display The Caalogue
        /*ArrayList<Vehicle> mylist = car.getAllProducts();
        for (Vehicle obj : mylist) {
            System.out.println("\n DONE\n" + obj);
        */
        // Stage 1 Q4 FindProduct 
        /*
        Vehicle myVehicle = car.findVehicle("ABCD786");
        System.out.println("\n Found A Vehicle: \n"+myVehicle); 
        }
        */
        
        /* Manager Choice 
        Vehicle managerChoice = car.starProduct();
        System.out.println(managerChoice);
        */  
    } 
   
}
