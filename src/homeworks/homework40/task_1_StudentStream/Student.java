package homeworks.homework40.task_1_StudentStream;

public class Student {

        String name;
        int age;
        double avgGrade;

        public Student(String name, int age, double avgGrade) {
            this.name = name;
            this.age = age;
            this.avgGrade = avgGrade;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", avgGrade=" + avgGrade +
                    '}';
        }
    }

