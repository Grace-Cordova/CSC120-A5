public class Passenger {
    
    private String name;
    
    /**
     * Constructs a passenger with the following attributes
     * @param  name name of the passenger
     * @return passenger with the following attributes
     */
    //Passenger constructor 
    public Passenger(String name) {
        this.name = name;
    }

    /**
     * An accessor for the private variable name
     * @param  does not take in any parameters
     * @return  returns the name of the particular instance of passenger
     */
    // Accessor so that the car can access the passengers name for teh array list
    public String getName(){
        return this.name;
    }

    /**
     * Allows a passenger to board the car and calls the add passenger method
     * @param  c a car
     * @return  does not return anything
     */
    //Method that allows a passenger to board car. I know I need to throw an exception here but I don't know who catches it.  
    public void boardCar(Car c){
        try {
            c.addPassenger(this);
        }catch(RuntimeException e){
            System.out.println(e);
        }
    }

    /**
     * Allows a passenger to get off of a car and calls the remove passenger method
     * @param  c a car
     * @return  does not return anything
     */
    public void getOffCar(Car c){
        try {
            c.removePassenger(this);
        }catch(RuntimeException e){
            System.out.println(e);
        }
    }
}
