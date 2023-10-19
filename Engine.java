public class Engine {
    private FuelType f;
    double currentFuelLevel;
    double maxFuelLevel;
    // Constructor for the engine that initializes Fuel type and fuel level.
    public Engine(FuelType f, double fuelLevel){
        this.f = f;
        this.maxFuelLevel = fuelLevel;
        this.currentFuelLevel = this.maxFuelLevel;
    }
    //Method that allows the train to refuel hen it is out of gas 
    public void refuel(){
        this.currentFuelLevel = this.maxFuelLevel;
    }
    // Method that allows the train to run out of gas and calls refuel when necessary.
    public void go(){
        while (this.currentFuelLevel>0){
            this.currentFuelLevel -= 1;
        }
        refuel();
        System.out.println("The train has refueled!");
    }
    
}