import java.util.ArrayList;
public class Car {
    private ArrayList <Passenger> passengersOnboard;
    // Initializes arraylist of the names of passengers on board
    private int maxCapacity;
    // an int that stores a max capacity
    private int seatsRemaining;

    /**
     * Constructs the Car
     * @param   maxCapacity Takes in a value that each car will contain
     * @return  returns a car with each of the following elements
     */
    // Constructor for the car so that it contains the list of passengers on board and a max capacity 
    public Car(int maxCapacity){
            this.passengersOnboard = new ArrayList<>();
            this.maxCapacity = maxCapacity;
            this.seatsRemaining = maxCapacity-passengersOnboard.size();
    }

    /**
     * Adds a passengers name to the array list passengersOnboard
     * @param   p The passenger to add
     * @return  does not return anything
     */
    // Method that allows you to add a passenger and prints a message if the car is at capacity
    public void addPassenger(Passenger p){
        
        if (this.passengersOnboard.size() >= maxCapacity) {
            throw new RuntimeException(" This car is at capacity.");
        }
        if (this.passengersOnboard.contains(p)){
            throw new RuntimeException("This passenger cannot board the car because they are already on!");
        }
        this.passengersOnboard.add(p);
    }

    /**
     * Removes a passengers name from the array list passengersOnboard
     * @param   p The passenger to remove
     * @return  does not return anything
     */
    // Method that removes a passenger and prints a warning if the passenger tries to get off a car they are not on
    public void removePassenger(Passenger p){
        if(this.passengersOnboard.contains(p)){
            this.passengersOnboard.remove(p);
        }else{
            throw new RuntimeException("This passenger is not in this car and cannot get off.");
        }
      
    /**
     * prints a manifest of all of the passengers in the car
     * @param   does not take anything in
     * @return  does not return anything
     */
    // Method that prints the list of names of passengers in the car. I should probably just return this and not print. Because the large manifest is printed in the train class.
    }
    public void printManifest(){
        for (Passenger p:passengersOnboard){
            System.out.println(p.getName());
        }
    }

    /**
     * An accessor for the max capacity
     * @param  does not take in any parameters
     * @return  this instance of max capacity
     */
    public int getMaxCapacity(){
        return this.maxCapacity;
    }

    /**
     * Accesses the number of seats remaining in the car
     * @param  does not take in any parameters
     * @return  this instance of seats remaining
     */
    public int getSeatsRemaining(){
        return this.seatsRemaining;
    }

}