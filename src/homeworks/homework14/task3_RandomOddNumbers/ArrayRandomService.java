package homeworks.homework14.task3_RandomOddNumbers;

import java.util.Random;

public class ArrayRandomService {

    public int[] randomArray(int size) {
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 1; i < size; i++) {
            array[i] = random.nextInt(10); // generade numbers from 0 to 9
        }
        return array;
    }

    public int evenNumbers(int[] array) {
        int counter = 0;
        for (int num : array) {
            if (num % 2 == 0) {
                counter++;
            }
        }
        return counter;


    }
}
