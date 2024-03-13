package homeworks.homework38.task_3_Palindrome;

import homeworks.homework6.scanner.UserInput;

public class DemoPalindrom {
    public static void main(String[] args) {

        PalindromeInterface palindromeInterface = text -> {
            String cleanStr = text.replaceAll("\\s", "").toLowerCase();
            int length = cleanStr.length();
            for (int i = 0; i < length / 2; i++) {
                if (cleanStr.charAt(i) != cleanStr.charAt(length - i - 1)) {
                    return false;
                }
            }
            return true;
        };

        UserInput input = new UserInput();

        String textInput = input.inputText("enter text:");

        System.out.println("is a palindrome? " + palindromeInterface.isPalindrome(textInput));
    }
}
