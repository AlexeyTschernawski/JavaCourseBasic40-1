package homeworks.homework40.task_4_StudentsSortStream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class DemoSortStudents {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student("Alex", 2020, 85.6));
        students.add(new Student("Herbert", 2021, 89.1));
        students.add(new Student("Oliver", 2019, 65.9));
        students.add(new Student("Thomas", 2023, 74.2));
        students.add(new Student("Melanie", 2022, 50.4));

        List<Student> studentsSort = students.stream()
                .sorted(Comparator.comparingDouble(Student::getGrade).reversed())
                .limit(2)
                .sorted(Comparator.comparingInt(Student::getYearOfAdmission))
                .collect(Collectors.toList());

        System.out.println(studentsSort);
    }
}
