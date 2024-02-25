package homeworks.homework29.task_5_HashSet_Names;

import homeworks.homework6.scanner.UserInput;

import java.util.HashSet;
import java.util.Set;

public class PersonDemo {
    public static void main(String[] args) {

        Set<Person> names = new HashSet<>();

        names.add(new Person("Alex"));
        names.add(new Person("hihi"));
        names.add(new Person("haha"));
        names.add(new Person("huhu"));
        names.add(new Person("hahu"));
        names.add(new Person("hihu"));
        names.add(new Person("huhu"));
        names.add(new Person("hahu"));
        names.add(new Person("huhu"));

        System.out.println(names);

        UserInput userInput = new UserInput();

        String inputName = userInput.inputText("enter name: ");

        Person inputPerson = new Person(inputName);

        if (names.contains(inputPerson)) {
            System.out.println("name '" + inputName + "'exist ");

        } else {
            System.out.println("word '" + inputName + "' wasn't found");
        }

        String nameToCheck = "huhu";
        Person inputPersonString = new Person(nameToCheck);
        if (names.contains(inputPersonString)) {
            System.out.println("Set содержит имя: " + nameToCheck);
        } else {
            System.out.println("Set не содержит имя: " + nameToCheck);
        }
    }
}
