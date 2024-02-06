package homeworks.homework13.task1and2arrayRandomWithMethod;

import java.util.Random;

public class ArrayService {

    public int[] createArray(int arrayLength) {
        int[] newArray = new int[arrayLength];
        return newArray;
    }

    public void fillArrayRandom(int[] workingArray, int minNumber, int maxNumber) {
        Random random = new Random();

        for (int i = 0; i < workingArray.length; i++) {
            int ramdomNumbers = random.nextInt(minNumber, maxNumber);
            workingArray[i] = ramdomNumbers;
        }
    }

    public void printArray(int[] workingArray) {
        System.out.println("data of Arrays elements: ");
        for (int i = 0; i < workingArray.length; i++) {
            System.out.print(workingArray[i] + ", ");
        }
        System.out.println();
    }


}
