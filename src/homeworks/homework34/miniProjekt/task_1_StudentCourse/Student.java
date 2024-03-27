package homeworks.homework34.miniProjekt.task_1_StudentCourse;

import java.util.HashMap;
import java.util.Map;

public class Student {
//
    private String firstName;
    private String lastName;
    private int studentId;
    private Map<Integer, Course> courses;

    public Student(String firstName, String lastName, int studentId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentId = studentId;
        this.courses = new HashMap<>();
    }

    public int getStudentId() {
        return studentId;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public void addCourse(Course course) {
        courses.put(course.getCourseName().hashCode(), course);
    }

    public void removeCourse(Course course) {
        courses.remove(course.getCourseName().hashCode());
    }

    public Map<Integer, Course> getCourses() {
        return courses;
    }

    @Override
    public String toString() {
        return "Student{" +
                "fullName='" + getFullName() + '\'' +
                ", studentId=" + studentId +
                '}';
    }
}
