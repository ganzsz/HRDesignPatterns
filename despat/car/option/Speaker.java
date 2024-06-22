package despat.car.option;

import despat.car.Car;

public class Speaker extends CarDecorator {
    private int speakerCount;

    public Speaker(Car car) {
        super(car);
    }

    public void setSpeakerCount(int count) {
        this.speakerCount = count;
    }

    @Override
    public void build() {
        System.out.println("This car now has " + speakerCount + " speakers installed.");
    }

    @Override
    public String toString() {
        return "Speaker [count=" + speakerCount + ", internalCar=" + internalCar + "]";
    }

}