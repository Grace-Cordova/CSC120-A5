import java.util.ArrayList;
public class Car {
    private ArrayList <Passenger> passengersOnboard;
    // Initializes arraylist of the names of passengers on board
    private int maxCapacity;
    // an int that stores a max capacity

    // Constructor for the car so that it contains the list of passengers on board and a max capacity 
    public Car(int maxCapacity){
            this.passengersOnboard = new ArrayList<>();
            this.maxCapacity = maxCapacity;
    }

    // Method that allows you to add a passenger and prints a message if the car is at capacity
    public void addPassenger(Passenger p){
        if (this.passengersOnboard.size() >= maxCapacity){
            System.out.println(" This car is at capacity.");
        }else{
            this.passengersOnboard.add(p);
        }
    }
    // Method that removes a passenger and prints a warning if the passenger tries to get off a car they are not on
    public void removePassenger(Passenger p){
        if(this.passengersOnboard.contains(p)){
            this.passengersOnboard.remove(p);
        }else{
            System.out.println("This passenger is not in this car and cannot get off.");
        }
    // Method that prints the list of names of passengers in the car. I should probably just return this and not print. Because the large manifest is printed in the train class.
    }
    public void printManifest(){
        for (Passenger p:passengersOnboard){
            System.out.println(p.getName());
        }
    }

}