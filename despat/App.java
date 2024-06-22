package despat;

import despat.factories.CarFactory;
import despat.factories.Exceptions.BrandNotFoundException;
import despat.factories.Exceptions.ModelNotFoundException;

public class App {
    public static void main(String[] args) {
        System.out.println("App.main()");
        String[][] tests = {
                { "Fiat", "Panda" },
                { "Fiat", "Punto" },
                { "Fiat", "Problem" },
                { "Invalid", "Panda" },
                { "Both", "Invalid" },
        };
        var carFactory = new CarFactory();

        for (String[] strings : tests) {
            try {
                var car = carFactory.GetCar(strings[0], strings[1]);
                System.out.print(car.GetName());
                System.out.print(" Engine: ");
                System.out.println(car.GetEngine());
            } catch (ModelNotFoundException m) {
                System.err.println(m);
            } catch (BrandNotFoundException b) {
                System.err.println(b);
            }
        }
    }
}
