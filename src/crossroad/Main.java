package crossroad;

/**
 * Created by Sviatoslav Potaychuk on 19.05.2016.
 */
public class Main {

    public static void main(String[] args) {

        CrossRoad crossRoad = new CrossRoad();
        Moto yamaha = new Moto("Yamaha", "AА 234-34 В");

        crossRoad.transportCrossed(new Moto("Yamaha", "AА 234-34 В"));
        crossRoad.transportCrossed(new Moto("Suzuki", "AА 111-34 В"));
        crossRoad.transportCrossed(new Moto("Harley Davidson", "AА 211-34 В"));
        crossRoad.transportCrossed(new Lorry("Man", "CC 000-34 В"));
        crossRoad.transportCrossed(new Car("Tesla", "OP 777-34 В"));
        crossRoad.transportCrossed(new Lorry("Volvo", "YY 777-33 R"));
        crossRoad.transportCrossed(new Lorry("Man", "ZZ 784-34 Y"));

        System.out.println(crossRoad.transportTracking());
//        System.out.println(crossRoad.carTracking());
//        System.out.println(crossRoad.motoTracking());
        System.out.println(crossRoad.lorryTracking());


        System.out.println(crossRoad.transportWasHere(yamaha));
    }
}
