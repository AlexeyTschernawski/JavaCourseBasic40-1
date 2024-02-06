package homeworks.homework13.arrayRandom;

import java.util.Random;

public class arrayRandom2 {
    public static void main(String[] args) {

        Random randomNumber = new Random();

        int arraySize = 5;

        int[] ArrayRandom = new int[arraySize];

        for (int i = 0; i < arraySize; i++) {
            ArrayRandom[i] = randomNumber.nextInt(90) +10;

        }
        System.out.println();
        for (int i = 0; i < arraySize; i++) {
            System.out.print(ArrayRandom[i] + " ");
        }

        for (int i = 1; i < arraySize; i += 2) {
            ArrayRandom[i] = 0;
        }
        System.out.println();
        for (int i = 0; i < arraySize; i++) {
            System.out.print(ArrayRandom[i] + " ");

        }
    }

}
