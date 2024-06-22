package despat.car;

import despat.engine.Engine;
import despat.engine.Fire;

public class Panda extends Fiat {
    protected final String model = "Panda";
    protected Engine engine;

    public Panda(int vin, Fire engine) {
        super(vin);
        this.engine = engine;
    }

    @Override
    public String getName() {
        return new StringBuilder()
                .append("Car, brand: ")
                .append(brand)
                .append(", model: ")
                .append(model)
                .toString();
    }

    @Override
    public Engine getEngine() {
        return this.engine;
    }

    @Override
    public String getModel() {
        return model;
    }
}
