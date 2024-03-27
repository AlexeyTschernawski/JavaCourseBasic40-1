package homeworks.homework34.miniProjekt.task_1_StudentCourse;

public class Manager {
    public static void main(String[] args) {

        StudentManager studentManager = new StudentManager();


        Student student1 = new Student("Alexey", "Bren", 123);
        Student student2 = new Student("Thomas", "Huber", 125);
        Student student3 = new Student("Oliver", "Muller", 124);

        Course course1 = new Course("Informatics");
        Course course2 = new Course("Logistics");

        studentManager.addStudent(student1);
        studentManager.addStudent(student2);
        studentManager.addStudent(student3);


        studentManager.addCourseToStudent(123, course1);
        studentManager.addCourseToStudent(124, course2);
        studentManager.addCourseToStudent(125, course1);


        studentManager.printAllStudents();

        System.out.println("find student 123: ");
        System.out.println(studentManager.findStudentById(123));

        studentManager.printCoursesForStudent(123);
        studentManager.printStudentsOnCourse(course1);


        }

    }

