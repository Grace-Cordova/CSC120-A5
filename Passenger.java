public class Passenger {
    
    private String name;
    //Passenger constructor 
    public Passenger(String name) {
        this.name = name;
    }
    // Accessor so that the car can access the passengers name for teh array list
    public String getName(){
        return this.name;
    }
    //Method that allows a passenger to board car. I know I need to throw an exception here but I don't know who catches it.  
    public void boardCar(Car c){
        c.addPassenger(this);
        if (this.passengersOnBoard.length.equals (maxCapacity)) {
            c.removePassenger(this);
        }
    }
}
