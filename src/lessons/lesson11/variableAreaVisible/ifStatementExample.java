package lessons.lesson11.variableAreaVisible;

import homeworks.homework6.scanner.UserInput;

public class ifStatementExample {
    public static void main(String[] args) {


        String text;

        UserInput userInput = new UserInput();

        if (userInput.inputInteger("Please enter number:") > 0 ) {

             text = "Положительное число";

        } else {
             text = "отрицательное число";
        }

        System.out.println(text);


    }
}
