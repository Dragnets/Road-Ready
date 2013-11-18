package roadready;

/**
 *
 * @author Kupce Raitis
 */
public class RoadReadyDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String code = "ABCD534";
        String cond = "Used";
        String body = "Saloon";
        String trans = "Manual";
        String fuel = "Diesel";
        
        Validation.validCode(code);
        Validation.Condition(cond);
        Validation.body(body);
        Validation.FuelType(fuel);
        Validation.transmission(trans);
        
        //Check all string before passing to constructor. By static Method.
        Vehicle a = new Vehicle(code, cond, "BMW", body, "Red","Diesel", 2007, trans, 18560,"1896c", 5, "5000", "Wonderfull car");
        //a.toString();
        System.out.println(a);
    }    
}
            //public Vehicle (String ID, Enum condition, String make, String bodyType, String colour, 
            //Enum fuel, int manufactured, Enum transmission, int millage, 
            //String engineSize, int doorNR, String price, String description)