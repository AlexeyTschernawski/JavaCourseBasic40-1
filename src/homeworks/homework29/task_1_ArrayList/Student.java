package homeworks.homework29.task_1_ArrayList;

public class Student {

    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student" +
                " " + name + ", ";
    }
}
