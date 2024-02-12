package homeworks.homework19.task1_arrayStringChangeElements;

import homeworks.homework6.scanner.UserInput;

public class ArrayStringService {

    public int[] stringInputArraySize() {
        UserInput userInput = new UserInput();
        int arraySize = userInput.inputInteger("inter words number: ");

        return new int[arraySize];
    }

    public String[] stringInputArray  (String[] arrayElements) {
        UserInput userInput = new UserInput();
        System.out.println("inter arrays elements: ");

        for (int i = 0; i < arrayElements.length ; i++) {
            arrayElements[i] = userInput.inputText
                    ("element" + (i + 1) + " ");
        }
        return arrayElements;
    }

    // Метод для обмена элементов в массиве в обратном порядке
    public void reverseArray(String[] array) {
        int length = array.length;
        for (int i = 0; i < length / 2; i++) {
            // Обмен элементов между началом и концом массива
            String temp = array[i];
            array[i] = array[length - 1 - i];
            array[length - 1 - i] = temp;
        }
    }

    public void printArrayElements(String[] array) {
        for (String element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public void printArray(String[] workingArray) {
        for (int i = 0; i < workingArray.length; i++) {
            System.out.print(workingArray[i] + ", ");
        }
        System.out.println();
    }
}
