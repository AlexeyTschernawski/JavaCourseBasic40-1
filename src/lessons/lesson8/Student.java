package lessons.lesson8;

public class Student {

    private String lastName;
    private String firstName;
    private String studentCardNumber;
    private String group;

    public Student(String lastName, String firstName, String studentCardNumber, String group) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.studentCardNumber = studentCardNumber;
        this.group = group;
    }

    public void printStudentInfo(){
        System.out.println("Student's first name: " + firstName);
        System.out.println("Student's last name: " + lastName);
        System.out.println("Student's card number: " + studentCardNumber);
        System.out.println("Student's group: " + group);
    }
}
