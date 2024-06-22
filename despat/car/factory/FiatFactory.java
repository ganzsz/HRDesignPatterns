package despat.factories;

import despat.car.*;
import despat.factories.Exceptions.ModelNotFoundException;

public class FiatFactory {
    public Fiat GetFiat(String model) throws ModelNotFoundException {
        return switch (model.toLowerCase()) {
            case "panda" -> new Panda();
            case "punto" -> new Punto();
            default -> throw new ModelNotFoundException("Fiat", model);
        };
    }
}
