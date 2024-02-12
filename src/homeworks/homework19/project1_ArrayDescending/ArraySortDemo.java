package homeworks.homework19.project1_ArrayDescending;

import java.util.Arrays;

public class ArraySortDemo {
    public static void main(String[] args) {

        ArrayService arrayService = new ArrayService();


        //пример по заданию через ввод с клавы

        int[] array = arrayService.createArrayFromUserInput();
        array = arrayService.fillArrayFromUserInput(array);

        //через toString с рамками
        System.out.println(Arrays.toString(array));

        //через метод printArray
        arrayService.printArray(array);

       int[] arrayDescending = arrayService.sort(array);
        arrayService.sort(arrayDescending);
        arrayService.printArray(arrayDescending);

        arrayService.arrayOddNumbersDescending(array);

    }
}
