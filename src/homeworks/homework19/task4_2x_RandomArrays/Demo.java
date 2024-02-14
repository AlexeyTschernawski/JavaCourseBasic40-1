package homeworks.homework19.task4_2x_RandomArrays;

public class Demo {
    private static int[] newArray2;

    public static void main(String[] args) {

        int arraySize = 5;

        TwoRandomArrays twoRandomArrays = new TwoRandomArrays();

        int[] array1 = twoRandomArrays.randomArray(arraySize);

        twoRandomArrays.printArray(array1, twoRandomArrays.averageArray(array1));

        int[] array2 = twoRandomArrays.randomArray(arraySize);

        twoRandomArrays.printArray(array2, twoRandomArrays.averageArray(array2));

        double average1 = twoRandomArrays.averageArray(array1);
        double average2 = twoRandomArrays.averageArray(array2);

        if (average1 > average2) {
            System.out.println("Среднее арифметическое для массива 1 больше.");
        } else if (average1 < average2) {
            System.out.println("Среднее арифметическое для массива 2 больше.");
        } else {
            System.out.println("Средние арифметические для обоих массивов равны.");
        }
    }

}

