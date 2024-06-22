package despat;

import despat.car.Car;
import despat.car.factory.CarFactory;
import despat.car.factory.Exceptions.BrandNotFoundException;
import despat.car.factory.Exceptions.ModelNotFoundException;

public class App {
    private static void testFactory() {
        String[][] tests = {
                { "Fiat", "Panda" },
                { "Fiat", "Panda", "100 HP" },
                { "Fiat", "Punto" },
                { "Fiat", "Problem" },
                { "Invalid", "Panda" },
                { "Both", "Invalid" },
        };
        var carFactory = new CarFactory();

        for (String[] strings : tests) {
            try {
                Car car;
                if (strings.length > 2) {
                    car = carFactory.getCar(strings[0], strings[1], strings[2], 1422055);
                } else {
                    car = carFactory.getCar(strings[0], strings[1], 1422055);
                }
                System.out.print(car.getName());
                System.out.print(" Engine: ");
                System.out.println(car.getEngine());
            } catch (ModelNotFoundException m) {
                System.err.println(m);
            } catch (BrandNotFoundException b) {
                System.err.println(b);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("App.main()");
        testFactory();
    }
}
