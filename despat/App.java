package despat;

import despat.car.Car;
import despat.car.factory.CarFactory;
import despat.car.factory.Exceptions.BrandNotFoundException;
import despat.car.factory.Exceptions.ModelNotFoundException;
import despat.car.option.Speaker;

public class App {
    private static CarFactory factoryInstance;

    private static CarFactory getFactoryInstance() {
        if (App.factoryInstance == null) {
            App.factoryInstance = new CarFactory();
        }

        return App.factoryInstance;
    }

    private static void testFactory() {
        System.out.println("App.testFactory()");
        String[][] tests = {
                { "Fiat", "Panda" },
                { "Fiat", "Panda", "100 HP" },
                { "Fiat", "Punto" },
                { "Fiat", "Problem" },
                { "Invalid", "Panda" },
                { "Both", "Invalid" },
        };

        for (String[] strings : tests) {
            try {
                Car car;
                if (strings.length > 2) {
                    car = App.getFactoryInstance().getCar(strings[0], strings[1], strings[2], 1422055);
                } else {
                    car = App.getFactoryInstance().getCar(strings[0], strings[1], 1422055);
                }
                System.out.println(car);
            } catch (ModelNotFoundException m) {
                System.err.println(m);
            } catch (BrandNotFoundException b) {
                System.err.println(b);
            }
        }
    }

    private static void testDecorator() {
        System.out.println("App.testDecorator()");
        try {
            var luxeobject = App.getFactoryInstance().getCar("Fiat", "Panda", "100 HP", 442200);
            var carWithSpeakers = new Speaker(luxeobject);
            carWithSpeakers.setSpeakerCount(5);
            System.out.println(carWithSpeakers);
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public static void main(String[] args) {
        System.out.println("App.main()");
        testFactory();
        testDecorator();
    }
}
