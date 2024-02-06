package homeworks.homework14.task6_WordsOddOrEven;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WordArraySplitter {

    public static void main(String[] args) {
        String[] wordsArray = {"color", "create", "monster", "bike", "mango", "pear"};

        List<String> oddLengthWords = new ArrayList<>();
        List<String> evenLengthWords = new ArrayList<>();

        for (String word : wordsArray) {
            if (word.length() % 2 == 0) {
                evenLengthWords.add(word);
            } else {
                oddLengthWords.add(word);
            }
        }

        // Converting Lists to Arrays
        String[] oddLengthArray = oddLengthWords.toArray(new String[0]);
        String[] evenLengthArray = evenLengthWords.toArray(new String[0]);

        // print result
        System.out.println("Words with an odd number of letters: " + Arrays.toString(oddLengthArray));
        System.out.println("Words with an even number of letters: " + Arrays.toString(evenLengthArray));
    }
}

