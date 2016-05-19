package crossroad;

/**
 * Created by Sviatoslav Potaychuk on 19.05.2016.
 */
public class Car implements Trasport {
    private String name;
    private String licensePlate;

    /**
     * Constructor
     * @param name is name of car model
     * @param licensePlate is value of license plate
     */
     Car(String name, String licensePlate) {
        this.name = name;
        this.licensePlate = licensePlate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()){
            return false;
        }
        Car car = (Car) o;
        return name.equals(car.name) && licensePlate.equals(car.licensePlate);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + licensePlate.hashCode();
        return result;
    }

    @Override
    public void move() {
        System.out.println("Car" + name+" " + licensePlate +"moves");
    }
}
