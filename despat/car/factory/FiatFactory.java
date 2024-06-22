package despat.car.factory;

import despat.car.Car;
import despat.car.Panda;
import despat.car.Punto;
import despat.engine.Fire;

import despat.car.factory.Exceptions.ModelNotFoundException;

public class FiatFactory {
    public Car getFiat(String model, int vin) throws ModelNotFoundException {
        return getFiat(model, vin, "");
    }

    public Car getFiat(String model, int vin, String version) throws ModelNotFoundException {
        return switch (model.toLowerCase()) {
            case "panda" -> switch (version.toLowerCase()) {
                case "100 hp" -> new Panda(vin, new Fire(1450));
                default -> new Panda(vin, new Fire(1200));
            };
            case "punto" -> new Punto(vin, new Fire(1000));
            default -> throw new ModelNotFoundException("Fiat", model);
        };
    }
}
