package despat.car;

import despat.engine.Engine;
import despat.engine.Fire;

public class Punto extends Fiat {
    protected final String model = "Punto";
    protected Engine engine = new Fire(1000);

    @Override
    public String GetName() {
        return new StringBuilder()
                .append("Car, brand: ")
                .append(brand)
                .append(", model: ")
                .append(model)
                .toString();
    }

    @Override
    public Engine GetEngine() {
        return this.engine;
    }

}
