package despat.factories;

import despat.car.Car;
import despat.factories.Exceptions.BrandNotFoundException;
import despat.factories.Exceptions.ModelNotFoundException;

public class CarFactory {
    public Car GetCar(String brand, String model) throws BrandNotFoundException, ModelNotFoundException {
        return switch (brand.toLowerCase()) {
            case "fiat" -> new FiatFactory().GetFiat(model);
            default -> throw new BrandNotFoundException(brand);
        };
    }
}
