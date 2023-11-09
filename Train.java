import java.util.ArrayList;
public class Train {
    private final Engine engine;
    private ArrayList<Car> cars;

    /**
     * Constructs a train
     * @param  fuelType,fuelCapacity,nCars,passengerCapacity 
     * @return  a train with the following attributes
     */
    // Constructor for the tain.
    public Train(FuelType fuelType, double fuelCapacity, int nCars, int passengerCapacity){
        this.engine = new Engine(fuelType, fuelCapacity);

        this.cars = new ArrayList<>();
        for (int n = 0; n<nCars; n++){
            this.cars.add(new Car(passengerCapacity));
        }

    }

    /**
     * Accessor for the engine
     * @param  does not take in any parameters
     * @return  returns a particular instance of the train
     */
    // accessor for the engine so that the train can access it.
    public Engine getEngine(){
        return this.engine;
    }

    /**
     * Prints a manifest with the names of the passengers throughout the train
     * @param  does not take in any parameters
     * @return  does not return anything
     */
    // Method to print the manifest for the entire train by running through each car.
    public void printManifest(){
        System.out.println("Train Manifest\n---------------\n");
        for (Car c : this.cars){
            c.printManifest();
        }
    }

    /**
     * Gets a car at the ith index and returns it
     * @param  i an index of the cars array list
     * @return  returns the car at the index i
     */
    public Car getCar(int i){
        return cars.get(i);
    }

    /**
     * gets the max capacity of the entire train
     * @param  does not take in any parameters
     * @return  returns the max capacity of the entire train
     */
    public int getMaxCapacity(){
        int max = 0;
        for (Car c:cars){
            max+=c.getMaxCapacity();
        }
        return max;
    }

    /**
     * Gets the number of seats remaining in the entire train
     * @param  does not take in any parameters
     * @return returns the number of seats remaining in the entire train
     */
    public int getSeatsRemaining(){
        int seats = 0;
        for (Car c: cars){
            seats+=c.getSeatsRemaining();
        }
        return seats;
    }

}
