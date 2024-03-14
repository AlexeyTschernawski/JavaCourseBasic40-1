package homeworks.homework40.task_1_StudentStream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Demo {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student("Alex", 25, 5.3));
        students.add(new Student("Marta", 25, 2.3));
        students.add(new Student("Thomas", 25, 1.6));
        students.add(new Student("Herbert", 25, 5.9));
        students.add(new Student("Jon", 25, 6.7));
        students.add(new Student("Oliver", 25, 4.1));
        students.add(new Student("Jeane", 25, 3.5));

        List<Student> filteredStudents = students.stream()
                .filter(student -> student.age >= 20) // фильтр по возрасту
                .filter(student -> student.avgGrade > 4.5) // фильтр по среднему баллу
                .collect(Collectors.toList());

        // Вывод отфильтрованных студентов
        System.out.println("Students with age 20+ and average grade 4.5:");
        filteredStudents.forEach(System.out::println);


    }
}
