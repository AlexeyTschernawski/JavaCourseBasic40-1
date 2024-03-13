package homeworks.homework38.task_1_UpperCase;

import homeworks.homework6.scanner.UserInput;

public class Demo2 {
    public static void main(String[] args) {

        UpperCaseInterface2 upperCaseInterface2 = a -> a.toUpperCase();

        UserInput userInput = new UserInput();

        String newUpperCaseText = upperCaseInterface2.upperCase(userInput.inputText("Enter text"));

        System.out.print("new upper case text: " + newUpperCaseText);


    }
}

