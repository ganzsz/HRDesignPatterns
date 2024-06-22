package despat.car;

import despat.engine.Engine;

public interface Car {
    public abstract int getVin();

    public abstract String getBrand();

    public abstract String getModel();

    public abstract Engine getEngine();

    public abstract int getWheels();
}
