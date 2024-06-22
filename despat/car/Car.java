package despat.car;

import despat.engine.Engine;

public abstract class Car {
    private final int vin;

    Car(int vin) {
        this.vin = vin;
    }

    public int getVin() {
        return vin;
    }

    public abstract String getName();

    public abstract String getBrand();

    public abstract String getModel();

    public abstract Engine getEngine();

    public abstract int getWheels();
}
