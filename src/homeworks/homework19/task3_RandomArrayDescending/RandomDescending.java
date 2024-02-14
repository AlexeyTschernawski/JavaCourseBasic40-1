package homeworks.homework19.task3_RandomArrayDescending;

import java.util.Arrays;
import java.util.Random;

public class RandomDescending {

    public int[] randomArray(int size) {
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(10); // generade numbers from 0 to 9
        }
        return array;
    }


    public int[] array  (int[] workingArray) {
        Random random = new Random();

        for (int i = 0; i < workingArray.length; i++) {
            workingArray[i] = random.nextInt(10) + 1;
        }

        Arrays.sort(workingArray);
        for (int i = 0; i < workingArray.length / 2; i++) {
            int temp = workingArray[i];
            workingArray[i] = workingArray[workingArray.length - 1 - i];
            workingArray[workingArray.length - 1 - i] = temp;
        }
        return workingArray;
    }


    public void printArray(int[] workingArray) {
        for (int i = 0; i < workingArray.length; i++) {
            System.out.print(workingArray[i] + ", ");
        }
        System.out.println();
    }

    }

