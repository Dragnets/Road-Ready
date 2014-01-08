package roadready;

/**
 *
 * @author Raitis
 * This class is a representation of a SportsVehicle, implements Car
 */
public class SportsVehicle extends Vehicle implements Car{
        /** The current SportsVehicle modification */
        private Boolean modification;
        /** The current detailsOfModification */
        private String detailsOfModification = "N/A";
        
    /**
     * Sets up initial values for modification and detailsOfmodification.
     * @param ID the ID that the SportsVehicle will be initialised with
     * @param condition the condition that the SportsVehicle will be 
     * initialised with
     * @param make  the make that the SportsVehicle will be initialised with
     * @param model the model that the SportsVehicle will be initialised with
     * @param bodyType the bodyType that the Vehicle will be initialised with
     * @param colour the colour that the SportsVehicle will be initialised with
     * @param fuel the fuel that the SportsVehicle will be initialised with
     * @param manufactured the manufactured that the SportsVehicle will 
     * be initialised with
     * @param transmission the transmission that the SportsVehicle will 
     * be initialised with
     * @param millage the millage that the SportsVehicle will be 
     * initialised with
     * @param engineSize the engineSize that the Vehicle will be 
     * initialised with
     * @param doorNR the doorNR that the SportsVehicle will be initialised with
     * @param price the price that the Vehicle will be initialised with
     * @param description the description that the SportsVehicle will be 
     * initialised with
     * @param detailsOfModification the detailsOfModification that the 
     * SportsVehicle will be initialised with
     * @throws ProductException 
     */    
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
    @Override
    public String getTypeOfCar(){
        return "SportsVehicle";
    }
    
    /**
     * Generates a string showing the data for the SportsVehicle
     * @return data about the SuperSport
     */
    @Override
    public String toString(){
        return ( super.toString()+"\n Modifided: "+ this.modification
                +"\n Details of Modification: "+this.detailsOfModification);
    }
}
