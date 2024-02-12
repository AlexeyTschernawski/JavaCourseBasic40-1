package homeworks.homework19.project1_ArrayDescending;

import homeworks.homework6.scanner.UserInput;

public class ArrayService {

    public int[] createArrayFromUserInput() {
        UserInput userInput = new UserInput();
        int arraySize = userInput.inputInteger("inter Arrays size: ");

      return new int[arraySize];
    }

    public int[] fillArrayFromUserInput(int[] arrayElements) {
        UserInput userInput = new UserInput();
        System.out.println("inter arrays elements: ");

        for (int i = 0; i < arrayElements.length; i++) {
            arrayElements[i] = userInput.inputInteger("element " + (i + 1) + ": ");
        }
        return arrayElements;
    }


    public int[] fillArray(int arraySize) {
        int[] newArray = new int[arraySize];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = i + 1;
        }
        return newArray;
    }

    public void arrayOddNumbersDescending(int[] workingArray) {
        int counter = 0;
        for (int i = 1; i <= workingArray.length; i += 2) {
            counter++;
        }
        int[] fillOddNumbers = new int[counter];
        int number = 1;
        for (int i = 0; i < counter; i++) {
            fillOddNumbers[i] = number;
            number += 2;
        }

        for (int i = fillOddNumbers.length - 1; i >=0; i--) {
            System.out.print(fillOddNumbers[i] + ", ");
        }
        System.out.println();
    }



    public int[] sort(int[] workingArray) {
        int length = workingArray.length;
        int[] reversedArray = new int[length];

        for (int i = 0; i < length; i++) {
            reversedArray[i] = workingArray[length - 1 - i];
        }
        return reversedArray;
    }

    public void printArray(int[] workingArray) {
        for (int i = 0; i < workingArray.length; i++) {
            System.out.print(workingArray[i] + ", ");
        }
        System.out.println();
    }

}
