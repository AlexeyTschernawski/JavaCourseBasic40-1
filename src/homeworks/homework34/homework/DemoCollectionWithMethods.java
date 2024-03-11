package homeworks.homework34.homework;

public class DemoCollectionWithMethods {
    public static void main(String[] args) {

        CollectionWithMethods<String> myCollection = new CollectionWithMethods<>();

        myCollection.add("element 1");
        myCollection.add("element 2");
        myCollection.add("element 3");

        System.out.println(myCollection.size());

        for (int i = 0; i < myCollection.size(); i++) {
            System.out.println(myCollection.get(i) + " ");
        }
        System.out.println("-----------------");

        myCollection.add(1, "element 10");

        // for (int i = 0; i < myCollections.size(); i++) {
        //  System.out.println(myCollections.get(i) + " ");
        //}

        for (int i = 0; i < myCollection.size(); i++) {
            System.out.println(myCollection.get(i) + " ");
        }
        System.out.println("------------------");

        myCollection.remove(3);
        for (int i = 0; i < myCollection.size(); i++) {
            System.out.println(myCollection.get(i) + " ");
        }
        System.out.println("---------------------");

        myCollection.remove2(0);
        for (int i = 0; i < myCollection.size(); i++) {
            System.out.println(myCollection.get(i) + " ");
        }

        System.out.println("----------------check method");

        myCollection.remove2(20);
        for (int i = 0; i < myCollection.size(); i++) {
            System.out.println(myCollection.get(i) + " ");
        }

    }

}
