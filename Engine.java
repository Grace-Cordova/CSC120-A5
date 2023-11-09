public class Engine {
    private FuelType f;
    private double currentFuelLevel;
    private double maxFuelLevel;

    /**
     * Constructs the engine
     * @param   f,fuelLevel takes in two values that are used to describe the engine.
     * @return  returns an engine with the following attributes.
     */
    // Constructor for the engine that initializes Fuel type and fuel level.
    public Engine(FuelType f, double fuelLevel){
        this.f = f;
        this.maxFuelLevel = fuelLevel;
        this.currentFuelLevel = this.maxFuelLevel;
    }

    /**
     * Changes the current fuel level to the max fuel level, refuels
     * @param  does not take in any parameters
     * @return  does not return anything
     */
    //Method that allows the train to refuel when it is out of gas 
    public void refuel(){
        this.currentFuelLevel = this.maxFuelLevel;
    }

    /**
     * Causes the train to go and run out of fuel
     * @param  does not take in any parameters
     * @return  does not return anything
     */
    // Method that allows the train to run out of gas and calls refuel when necessary.
    public void go(){
        while (this.currentFuelLevel>0){
            this.currentFuelLevel -= 1;
        }
        throw new RuntimeException("The train is out of fuel!");
    }
    
}