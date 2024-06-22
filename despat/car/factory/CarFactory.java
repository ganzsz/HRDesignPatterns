package despat.car.factory;

import despat.car.Car;
import despat.car.factory.Exceptions.BrandNotFoundException;
import despat.car.factory.Exceptions.ModelNotFoundException;

public class CarFactory {
    public Car getCar(String brand, String model, int vin) throws BrandNotFoundException, ModelNotFoundException {
        return getCar(brand, model, "", vin);
    }

    public Car getCar(String brand, String model, String type, int vin)
            throws BrandNotFoundException, ModelNotFoundException {
        return switch (brand.toLowerCase()) {
            case "fiat" -> new FiatFactory().getFiat(model, vin, type);
            default -> throw new BrandNotFoundException(brand);
        };
    }
}
