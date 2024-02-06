package homeworks.homework14.task2_OppositeArrayOddNumbers;


public class Demo {
    public static void main(String[] args) {

        int arraySize = 99;

        ArrayWithOddNumbers arrayWithOddNumbers = new ArrayWithOddNumbers();

        int[] newArray = arrayWithOddNumbers.fillArray(arraySize);

        arrayWithOddNumbers.printArray(newArray);

        arrayWithOddNumbers.oppositeNumbers(newArray);


    }
}
