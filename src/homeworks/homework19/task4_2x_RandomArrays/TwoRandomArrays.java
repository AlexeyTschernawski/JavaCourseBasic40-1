package homeworks.homework19.task4_2x_RandomArrays;

import java.util.Random;

public class TwoRandomArrays {



    public int[] randomArray(int size) {
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(5); // generade numbers from 0 to 9
        }
        return array;
    }

    public double averageArray(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return (double) sum / array.length;
    }

        public void printArray(int[] workingArray, double average) {
            for (int i = 0; i < workingArray.length; i++) {
                System.out.print(workingArray[i] + ", ");
            }
            System.out.println();
            System.out.println("Среднее арифметическое: " + average);
        }

    }


