package homeworks.homework14.task7_arraysRandom_Max_First;

import homeworks.homework6.scanner.UserInput;

import java.util.Arrays;
import java.util.Random;

public class ArrayOperations {

    public static void main(String[] args) {
        // Ввод размера массива от пользователя
        int size = getInput("Введите размер массива: ");

        // Создание и заполнение массива случайными числами
        int[] array = generateRandomArray(size);

        // Вывод массива
        System.out.println("Массив: " + Arrays.toString(array));

        // Нахождение максимального элемента и его индекса
        int[] maxIndexes = findMaxElementAndIndexes(array);

        // Вывод результата
        System.out.println("Максимальный элемент: " + array[maxIndexes[0]]);
        System.out.println("Индекс максимального элемента: " + maxIndexes[0]);
        System.out.println("Сумма всех элементов: " + calculateSum(array));

        // Вывод массива индексов максимальных элементов
        System.out.println("Массив индексов максимальных элементов: " + Arrays.toString(maxIndexes));
    }

    private static int getInput(String prompt) {

        UserInput scanner = new UserInput();
        System.out.print(prompt);
        return scanner.inputInteger("");
    }

    private static int[] generateRandomArray(int size) {
        int[] array = new int[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(100);
        }

        return array;
    }

    private static int calculateSum(int[] array) {
        int sum = 0;
        for (int element : array) {
            sum += element;
        }
        return sum;
    }

    private static int[] findMaxElementAndIndexes(int[] array) {
        int max = Integer.MIN_VALUE;
        int maxIndex = -1;

        // Находим максимальный элемент и его индекс
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                maxIndex = i;
            }
        }

        // Считаем количество максимальных элементов
        int count = 0;
        for (int element : array) {
            if (element == max) {
                count++;
            }
        }

        // Создаем массив для хранения индексов максимальных элементов
        int[] maxIndexes = new int[count];
        int currentIndex = 0;

        // Заполняем массив индексов
        for (int i = 0; i < array.length; i++) {
            if (array[i] == max) {
                maxIndexes[currentIndex++] = i;
            }
        }

        return maxIndexes;
    }
}

