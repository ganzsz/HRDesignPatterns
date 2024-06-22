package despat.factories.Exceptions;

public class BrandNotFoundException extends Exception {
    public BrandNotFoundException(String brand) {
        super("Unable to find brand " + brand);
    }
}
