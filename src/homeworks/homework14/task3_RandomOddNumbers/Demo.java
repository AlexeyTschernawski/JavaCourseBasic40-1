package homeworks.homework14.task3_RandomOddNumbers;

public class Demo {
    public static void main(String[] args) {

        int arraySize = 15;

        ArrayRandomService arrayRandomService = new ArrayRandomService();

        int[] newArray = arrayRandomService.randomArray(arraySize);

        int evenNumbers = arrayRandomService.evenNumbers(newArray);

        System.out.println("array: " + java.util.Arrays.toString(newArray));
        System.out.println("even number: " + evenNumbers);

    }
}
