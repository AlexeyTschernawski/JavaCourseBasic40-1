package homeworks.homework29.task_2_LinkedList;

import java.util.LinkedList;
import java.util.Random;

public class Number {

    private int num;

    public Number(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int[] randomArray(int size) {
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(100) +1; // generade numbers from 0 to 9
        }
        return array;
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
}
