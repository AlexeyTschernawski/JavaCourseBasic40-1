package homeworks.homework34.miniProjekt.task_1_StudentCourse;

import java.util.ArrayList;
import java.util.List;

public class Course {

    private String courseName;
    private List<Student> enrolledStudents;

    public Course(String courseName) {
        this.courseName = courseName;
        this.enrolledStudents = new ArrayList<>();
    }

    public String getCourseName() {
        return courseName;
    }

    public List<Student> getEnrolledStudents() {
        return enrolledStudents;
    }

    public void enrollStudent(Student student) {
        enrolledStudents.add(student);
        student.addCourse(this);
    }

    @Override
    public String toString() {
        return courseName;
    }
}
