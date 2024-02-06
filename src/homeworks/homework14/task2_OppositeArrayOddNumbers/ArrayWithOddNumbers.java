package homeworks.homework14.task2_OppositeArrayOddNumbers;

public class ArrayWithOddNumbers {


    public int[] fillArray(int arraySize) {
        int[] newArray = new int[arraySize];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = i + 1;
        }
        return newArray;
    }

    public void printArray(int[] workingArray) {
        for (int i = 0; i < workingArray.length; i++) {
            System.out.print(workingArray[i] + ", ");
        }
        System.out.println();
    }


    public void oppositeNumbers(int[] workingArray) {
        int counter = 0;
        for (int i = 1; i <=workingArray.length ; i+=2) {
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





