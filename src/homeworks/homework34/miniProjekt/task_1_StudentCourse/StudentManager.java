package homeworks.homework34.miniProjekt.task_1_StudentCourse;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentManager {

    private Map<Integer, Student> students;

    public StudentManager() {
        this.students = new HashMap<>();
    }

    public void addStudent(Student student) {
        students.put(student.getStudentId(), student);
    }

    public void removeStudent(int studentId) {
        students.remove(studentId);
    }

    public Student findStudentById(int studentId) {
        return students.get(studentId);
    }

    public void addCourseToStudent(int studentId, Course course) {
        Student student = findStudentById(studentId);
        if (student != null) {
            student.addCourse(course);
        }
    }

    public void printStudentsOnCourse(Course course) {
        List<Student> enrolledStudents = course.getEnrolledStudents();
        System.out.println("Students enrolled in course " + course.getCourseName() + ":");
        for (Student student : enrolledStudents) {
            System.out.println(student);
        }
    }

    public void printCoursesForStudent(int studentId) {
        Student student = findStudentById(studentId);
        if (student != null) {
            Map<Integer, Course> courses = student.getCourses();
            System.out.println("Courses for student " + student.getFullName() + ":");
            for (Course course : courses.values()) {
                System.out.println(course);
            }
        }
    }

    public void printAllStudents() {
        System.out.println("All students:");
        for (Student student : students.values()) {
            System.out.println(student);
        }
    }
}
