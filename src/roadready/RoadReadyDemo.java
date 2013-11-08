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
        
        //Check all string before passing to constructor. By static Method.
        Vehicle a = new Vehicle("abcd", "Use", "BMW", "Saloon", "Red","Diesel", 2007, "Manual", 18560,"1896c", 5, "5000", "Wonderfull car");
        //a.toString();
        System.out.println(a);
    }  
    
}
//public Vehicle (String ID, Enum condition, String make, String bodyType, String colour, 
            //Enum fuel, int manufactured, Enum transmission, int millage, 
            //String engineSize, int doorNR, String price, String description)