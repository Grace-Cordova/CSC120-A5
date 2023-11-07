import java.util.ArrayList;
public class Train {
    private final Engine engine;
    private ArrayList<Car> cars;
    // Constructor for the tain.
    public Train(FuelType fuelType, double fuelCapacity, int nCars, int passengerCapacity){
        this.engine = new Engine(fuelType, fuelCapacity);

        this.cars = new ArrayList<>();
        for (int n = 0; n<nCars; n++){
            this.cars.add(new Car(passengerCapacity));
        }

    }
    // accessor for the engine so that the train can access it.
    public Engine getEngine(){
        return this.engine;
    }
    // Method to print the manifest for the entire train by running through each car.
    public void printManifest(){
        System.out.println("Train Manifest\n---------------\n");
        for (Car c : this.cars){
            c.printManifest();
        }
    }

}
