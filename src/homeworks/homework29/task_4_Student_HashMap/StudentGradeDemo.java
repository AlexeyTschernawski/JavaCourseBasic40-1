package homeworks.homework29.task_4_Student_HashMap;

import java.util.*;

public class StudentGradeDemo {
    public static void main(String[] args) {

        Student student1 = new Student("Vasja", 85.5);
        Student student2 = new Student("Alex", 45.3);
        Student student3 = new Student("Thomas", 35.5);
        Student student4 = new Student("Jeny", 90.3);
        Student student5 = new Student("Herbert", 87.9);

        Map<String, Student> studentMap = new HashMap<>();

        studentMap.put(student1.getName(), student1);
        studentMap.put(student2.getName(), student2);
        studentMap.put(student3.getName(), student3);
        studentMap.put(student4.getName(), student4);
        studentMap.put(student5.getName(), student5);




        System.out.println(studentMap);


        Collection<Student> students = studentMap.values();
        Student MaxGrade = Collections.max(students, Comparator.comparingDouble(Student::getGrade));
        System.out.println("Student with max grade: " + MaxGrade.getName());


        student4.setGrade(68.8);
        System.out.println(studentMap);

        Collection<Student> students2 = studentMap.values();
        Student MaxGrade2 = Collections.max(students2, Comparator.comparingDouble(Student::getGrade));
        System.out.println("Student with max grade: " + MaxGrade2.getName());
    }



}
