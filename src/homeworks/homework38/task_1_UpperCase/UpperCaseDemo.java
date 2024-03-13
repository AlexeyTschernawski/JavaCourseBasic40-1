package homeworks.homework38.task_1_UpperCase;

public class UpperCaseDemo {
    public static void main(String[] args) {

        UpperCaseService upperCaseService = new UpperCaseService();

        String upperCaseText = upperCaseService.text(null, null);

        System.out.println("text in upper Case: " + upperCaseText);

    }
}

