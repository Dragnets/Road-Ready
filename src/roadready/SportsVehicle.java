package roadready;

/**
 *
 * @author Raitis
 */
public class SportsVehicle extends Vehicle implements Car{
        
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
    /**
     * Gets the type of car
     * @return the String "SportsVehicle" 
     */
    public String getTypeOfCar(){
        return "SportsVehicle";
    }
    
    @Override
    public String toString(){
        return ( super.toString()+"\n Modifided: "+ this.modification
                +"\n Details of Modification: "+this.detailsOfModification);
    }
}
