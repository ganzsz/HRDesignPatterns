package despat.car.option;

import despat.car.Car;
import despat.engine.Engine;

public abstract class CarDecorator implements Car {
    Car internalCar;

    public CarDecorator(Car car) {
        this.internalCar = car;
    }

    public abstract void build();

    @Override
    public int getVin() {
        return internalCar.getVin();
    }

    @Override
    public String getBrand() {
        return internalCar.getBrand();
    }

    @Override
    public String getModel() {
        return internalCar.getModel();
    }

    @Override
    public Engine getEngine() {
        return internalCar.getEngine();
    }

    @Override
    public int getWheels() {
        return internalCar.getWheels();
    }
}
