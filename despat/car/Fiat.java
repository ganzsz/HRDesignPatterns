package despat.car;

public abstract class Fiat extends Car {
    private int wheels = 4;
    protected final String brand = "Panda";

    Fiat(int vin) {
        super(vin);
    }

    @Override
    public int getWheels() {
        return wheels;
    }

    @Override
    public String getBrand() {
        return brand;
    }
}
