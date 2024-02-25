package homeworks.homework29.task_6_ArrayListInSet;

import java.util.*;

public class ElementsDemo {
    public static void main(String[] args) {

        List<Element> elementList = new ArrayList<>();

        elementList.add(new Element("Alex"));
        elementList.add(new Element("Thomas"));
        elementList.add(new Element("Jon"));
        elementList.add(new Element("Alex"));
        elementList.add(new Element("Jeny"));
        elementList.add(new Element("Alex"));
        elementList.add(new Element("Thomas"));
        elementList.add(new Element("Herbert"));

        for (int i = 0; i < elementList.size(); i++) {
            System.out.print(elementList.get(i) + " ");
        }

        HashSet<Element> hashSet = new HashSet<>(elementList);

        System.out.println();

        for (int i = 0; i < hashSet.size(); i++) {
        }
        System.out.print(hashSet + " ");

        System.out.println();

        hashSet.add(new Element("Maria"));
        hashSet.add(new Element("Oliver"));
        hashSet.add(new Element("Oliver"));

        for (int i = 0; i < hashSet.size(); i++) {
        }
        System.out.print(hashSet + " ");

        System.out.println("----------------");

        List<Element> newArrayList = new ArrayList<>(hashSet);

        for (int i = 0; i < newArrayList.size(); i++) {
            System.out.print(newArrayList.get(i) + " ");
        }

        }

    }

