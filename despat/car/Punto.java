package despat.car;

import despat.engine.Engine;
import despat.engine.Fire;

public class Punto extends Fiat {
    protected final String model = "Punto";
    protected Engine engine;

    public Punto(int vin, Fire engine) {
        super(vin);
        this.engine = engine;
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
