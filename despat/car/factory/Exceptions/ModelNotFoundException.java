package despat.factories.Exceptions;

public class ModelNotFoundException extends Exception {
    public ModelNotFoundException(String brand, String model) {
        super("Could not find the " + brand + " model " + model);
    }
}