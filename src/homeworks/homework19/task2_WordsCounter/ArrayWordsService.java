package homeworks.homework19.task2_WordsCounter;

import homeworks.homework6.scanner.UserInput;

public class ArrayWordsService {

    public String[] inputText() {
        UserInput userInput = new UserInput();

        String inputText = userInput.inputText("inter text: ");
        String[] arrayElements = inputText.split("\\s+");
        return arrayElements;
        }


    public int counterWords(String[] array) {
        int counter = 0;
        for (String element : array) {
            if (!element.isEmpty()) {
                counter++;
            }
        }
        return counter;
    }
}
