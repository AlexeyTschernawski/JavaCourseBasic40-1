package homeworks.homework40.task_4_StudentsSortStream;

import com.sun.jdi.connect.Connector;

public class Student {

    private String name;
    private int yearOfAdmission;
    private double grade;

    public Student(String name, int yearOfAdmission, double grade) {
        this.name = name;
        this.yearOfAdmission = yearOfAdmission;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfAdmission() {
        return yearOfAdmission;
    }

    public void setYearOfAdmission(int yearOfAdmission) {
        this.yearOfAdmission = yearOfAdmission;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", yearOfAdmission=" + yearOfAdmission +
                ", grade=" + grade +
                '}';
    }
}

