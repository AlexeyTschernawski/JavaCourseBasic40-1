package homeworks.homework30;

import java.util.Set;
import java.util.TreeSet;

public class FlatDemo {
    public static void main(String[] args) {

        Set<Flat> flatSet = new TreeSet<>();

        flatSet.add(new Flat(3, 80.5));
        flatSet.add(new Flat(2, 45.5));
        flatSet.add(new Flat(4, 80.8));
        flatSet.add(new Flat(5, 90.8));
        flatSet.add(new Flat(1, 45.8));

        for (Flat flat : flatSet) {
            System.out.println("Number of rooms: " + flat.getRooms() + ", Area: " + flat.getArea());
        }
    }
}
