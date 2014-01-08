package roadready;

/**
 *
 * @author Raitis
 * This class is a representation of a SuperSport, implements Car
 */
public class SuperSport extends Vehicle implements Car {
    /** Stores initial price */
    private String initialPrice;
    /** Stores the discount */
    private int discount = 500; 
    /** The current SuperSport max speed*/
    private String maxSpeed;

    /**
     * The constructor
     * Sets up initial values for price, maxSpeed and gives discounted price
     * @param ID the ID that the SuperSport will be initialised with
     * @param condition the condition that the SuperSport will be 
     * initialised with
     * @param make  the make that the SuperSport will be initialised with
     * @param model the model that the SuperSport will be initialised with
     * @param bodyType the bodyType that the SuperSport will be 
     * initialised with
     * @param colour the colour that the SuperSport will be initialised with
     * @param fuel the fuel that the SuperSport will be initialised with
     * @param manufactured the manufactured that the SuperSport will be 
     * initialised with
     * @param transmission the transmission that the SuperSport will be 
     * initialised with
     * @param millage the millage that the SuperSport will be initialised with
     * @param engineSize the engineSize that the SuperSport will be 
     * initialised with
     * @param doorNR the doorNR that the SuperSport will be initialised with
     * @param price the price that the SuperSport will be initialised with
     * @param description the description that the SuperSport will be 
     * initialised with
     */
    public SuperSport(String ID, String condition, String make, String model,
            String bodyType, String colour, String fuel, int manufactured,
            String transmission, int millage, String engineSize, int doorNR,
            String price, String description,
            String maxSpeed) throws ProductException {

        super(ID, condition, make, model, bodyType, colour, fuel, manufactured,
                transmission, millage, engineSize, doorNR, price, description);
        this.maxSpeed = maxSpeed;
        initialPrice=price;
        this.price = discounted();
    }
    /**
     * Works out the discount from current price
     * @return discounted price
     */
    private String discounted(){ //Stage 5 Q1
        float newPrice = Integer.parseInt(this.price)-discount;
        return String.valueOf(newPrice);
    }
    
    /**
     * Gets the type of car
     * @return the String "SuperSports"
     */
    @Override
    public String getTypeOfCar(){
        return "SuperSports";
    }
    /**
     * Gets the max speed of the SuperSports
     * @return maxSpeed
     */
    public String getMaxSpeed() {
        return this.maxSpeed;
    }
    
    /**
     * Generates a string showing the data for the SuperSport
     * @return data about the SuperSport
     */
    @Override
    public String toString(){
        return ( super.toString()+ "\n Max speed: "+this.maxSpeed
                +"\n******* SPECIAL OFFER "+'\u00A3'+this.discount
                +" POUNDS OFF was "+'\u00A3'+this.initialPrice
                +" POUNDS *******");

    }
}

