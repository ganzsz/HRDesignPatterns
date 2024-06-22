package despat.car.factory.Exceptions;

public class ModelNotFoundException extends Exception {
    public ModelNotFoundException(String brand, String model) {
        super("Could not find the " + brand + " model " + model);
    }
}