package homeworks.homework19.task1_arrayStringChangeElements;

public class Demo {
    public static void main(String[] args) {

        ArrayStringService arrayStringService = new ArrayStringService();

        int[] arraySize = arrayStringService.stringInputArraySize();
        String[] arrayElements = new String[arraySize.length];

        arrayStringService.stringInputArray(arrayElements);

        arrayStringService.printArray(arrayElements);

        arrayStringService.reverseArray(arrayElements);
        arrayStringService.printArray(arrayElements);

        System.out.println("how much elements in array: ");

    }
}
