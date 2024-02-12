package homeworks.homework19.task2_WordsCounter;

public class WordsDemo {
    public static void main(String[] args) {

        ArrayWordsService arrayWordsService = new ArrayWordsService();

        String[] arrayWords = arrayWordsService.inputText();
        int wordCounter = arrayWordsService.counterWords(arrayWords);

        System.out.println("entered words: " +wordCounter);

    }
}
