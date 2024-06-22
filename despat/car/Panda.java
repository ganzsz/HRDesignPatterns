package despat.car;

import despat.engine.Engine;
import despat.engine.Fire;

public class Panda extends Fiat {
    protected final String model = "Panda";
    protected Engine engine = new Fire(1200);

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
