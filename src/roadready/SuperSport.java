package roadready;

/**
 *
 * @author Raitis
 */

public class SuperSport extends Vehicle implements Car {
    
    private String maxSpeed;

    public SuperSport(String ID, String condition, String make, String model,
            String bodyType, String colour, String fuel, int manufactured,
            String transmission, int millage, String engineSize, int doorNR,
            String price, String description, String maxSpeed) throws ProductException {

        super(ID, condition, make, model, bodyType, colour, fuel, manufactured,
                transmission, millage, engineSize, doorNR, price, description);
        this.maxSpeed = maxSpeed;

    }
    
    /**
     * Gets the type of car
     * @return the String "SuperSports"
     */
    @Override
    public String getTypeOfCar(){
        return "SuperSports";
    }
    public String getMaxSpeed() {
        return this.maxSpeed;
    }
    @Override
    public String toString(){
        return ( super.toString()+ "\n Max speed: "+this.maxSpeed);

    }
}

