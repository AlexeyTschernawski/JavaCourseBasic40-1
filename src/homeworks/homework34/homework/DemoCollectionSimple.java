package homeworks.homework34.homework;

import java.util.ArrayList;
import java.util.List;

public class DemoCollectionSimple {
    public static void main(String[] args) {

        List<CollectionSimple> collections = new ArrayList<>();

        collections.add(new CollectionSimple("Element 1"));
        collections.add(new CollectionSimple("Element 2"));
        collections.add(new CollectionSimple("Element 3"));

        for (int i = 0; i < collections.size(); i++) {
            System.out.println(collections.get(i) + " ");
        }
        System.out.println("-----");
        collections.remove(2);

        for (int i = 0; i < collections.size(); i++) {
            System.out.println(collections.get(i) + " ");
        }

        System.out.println("-----");

        collections.add(1,new CollectionSimple("element20"));
        for (int i = 0; i < collections.size(); i++) {
            System.out.println(collections.get(i) + " ");
        }

    }
}
