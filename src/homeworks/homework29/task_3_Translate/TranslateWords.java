package homeworks.homework29.task_3_Translate;

import homeworks.homework6.scanner.UserInput;

import java.util.HashMap;
import java.util.Map;

public class TranslateWords {
    public static void main(String[] args) {

        Words word1 = new Words("you", "du");
        Words word2 = new Words("dog", "Hund");
        Words word3 = new Words("boy", "Junge");
        Words word4 = new Words("women", "Frau");
        Words word5 = new Words("men", "Mann");

        Map<String, Words> dictionary = new HashMap<>();

        dictionary.put(word1.getWord(),word1);
        dictionary.put(word2.getWord(),word2);
        dictionary.put(word3.getWord(),word3);
        dictionary.put(word4.getWord(),word4);
        dictionary.put(word5.getWord(),word5);

        System.out.println(dictionary);

        UserInput userInput = new UserInput();

        String yourWord = userInput.inputText("enter word: ");

        if (dictionary.containsKey(yourWord)) {
            System.out.println("translate '" + yourWord + "': " + dictionary.get(yourWord));

            dictionary.remove(yourWord);

            System.out.println("new dictionary: " + dictionary);
        } else {
            System.out.println("word '" + yourWord + "' wasn't found in dictionary.");
        }
    }
}
