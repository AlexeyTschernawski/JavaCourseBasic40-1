package lessons.lesson12;

import homeworks.homework6.scanner.UserInput;

public class Symbols {
    public static void main(String[] args) {


        UserInput input = new UserInput();

        String inputText = input.inputText("Inter text: ");

        for (int i = 0; i < inputText.length(); i++) {
            char symbol = inputText.charAt(i);

            if (symbol!= '"' && symbol != '@' && symbol != '(' &&
            symbol != ')'){

            }

        }
    }
}
