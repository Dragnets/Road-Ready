package roadready;

/**
 *
 * @author Raitis
 */
public class SportsVehicle extends Vehicle{
        
        private Boolean modification;
        private String detailsOfModification = "N/A";
        
        
    public SportsVehicle(String ID, String condition, String make, String model,
            String bodyType, String colour, String fuel, int manufactured, 
            String transmission,int millage,String engineSize, int doorNR, 
            String price, String description,Boolean modification, 
            String detailsOfModification) throws ProductException{
        
       super(ID,condition,make,model,bodyType,colour,fuel,manufactured,
               transmission,millage,engineSize,doorNR,price,description);
       this.modification = modification;
       this.detailsOfModification = detailsOfModification;
    }
    
    public String toString(){
        return ( super.toString()+ this.modification+this.detailsOfModification);
    }
}
