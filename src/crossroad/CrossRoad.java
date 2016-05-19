package crossroad;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sviatoslav Potaychuk on 19.05.2016.
 */
public class CrossRoad {
    private List<Trasport> list = new ArrayList<>();

    void transportCrossed(Trasport trasport) {
        trasport.move();
        list.add(trasport);
    }

    /**
     * This method solve count of lorry and print about it
     * @return count of lorry crossed crossroad
     */
    int lorryTracking() {
        System.out.print("Count of lorry crossed crossroad is : ");
        int i = 0;
        for (Trasport t : list) {
            if (t instanceof Lorry) {
                i++;
            }

        }
        return i;
    }

    /**
     * This method solve count of moto and print about it
     * @return count of moto crossed crossroad
     */
    int motoTracking() {
        System.out.print("Count of moto crossed crossroad is : ");
        int i = 0;
        for (Trasport t : list) {
            if (t instanceof Moto) {
                i++;
            }

        }
        return i;
    }

    /**
     * This method solve count of car and print about it
     * @return count of car crossed crossroad
     */
    int carTracking() {
        System.out.print("Count of car crossed crossroad is : ");
        int i = 0;
        for (Trasport t : list) {
            if (t instanceof Car) {
                i++;
            }

        }
        return i;
    }

    /**
     * This method solve count of all transport and print about it
     * @return count of transport crossed crossroad
     */
    int transportTracking() {
        System.out.print("Count of transport crossed crossroad is : ");
        return list.size();
    }

    /**
     * This method checks if transport has crossed crossroad
     * @param trasport  is transport witch is looked
     * @return true if it's and false if it's not
     */
    boolean transportWasHere(Trasport trasport) {
        for (Trasport t : list) {
            if (t.equals(trasport)) {
                return true;
            }

        }
        return false;
    }
}
