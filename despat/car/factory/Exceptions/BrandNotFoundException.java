package despat.car.factory.Exceptions;

public class BrandNotFoundException extends Exception {
    public BrandNotFoundException(String brand) {
        super("Unable to find brand " + brand);
    }
}
