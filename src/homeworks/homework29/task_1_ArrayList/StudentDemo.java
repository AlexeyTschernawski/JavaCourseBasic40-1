package homeworks.homework29.task_1_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class StudentDemo {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student("Vasilij"));
        students.add(new Student("Maria"));
        students.add(new Student("Thomas"));
        students.add(new Student("Oliver"));
        students.add(new Student("Jeane"));

        for (int i = 0; i < students.size(); i++) {
            System.out.print(students.get(i) + " ");
        }

        System.out.println();

        for (int i = students.size() - 1; i >= 0; i--) {
            System.out.print(students.get(i) + " ");
        }
        System.out.println();

        students.remove(3);
        students.set(3, new Student("Alexey"));
        students.set(0, new Student("Alexey"));
        students.add(0,new Student("new student"));


        for (int i = 0; i < students.size(); i++) {
            System.out.print(students.get(i) + " ");
        }
    }
}
