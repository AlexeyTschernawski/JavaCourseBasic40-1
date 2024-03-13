package homeworks.homework38.task_1_UpperCase;

import homeworks.homework6.scanner.UserInput;

import java.util.Locale;

public class UpperCaseService implements UpperCaseInterface {


    @Override
    public String text(String originalText, String upperCaseText) {
        UserInput userInput = new UserInput();
        originalText = userInput.inputText("Enter text");
        upperCaseText = originalText.toUpperCase();
        return upperCaseText;
    }
}



