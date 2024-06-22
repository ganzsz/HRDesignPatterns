package despat.car;

import despat.engine.Engine;

public abstract class Fiat implements Car {
    private final int vin;
    private int wheels = 4;
    protected final String brand = "Fiat";

    Fiat(int vin) {
        this.vin = vin;
    }

    @Override
    public int getVin() {
        return vin;
    }

    @Override
    public int getWheels() {
        return wheels;
    }

    @Override
    public String getBrand() {
        return brand;
    }

    public abstract String getModel();

    public abstract Engine getEngine();

    @Override
    public String toString() {
        return "Fiat [vin=" + getVin() + ", model=" + getModel() + ", engine=" + getEngine() + "]";
    }

}
