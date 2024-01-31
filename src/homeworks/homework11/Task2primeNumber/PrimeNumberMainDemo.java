package homeworks.homework11.Task2primeNumber;


import java.util.Scanner;

public class PrimeNumberMainDemo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("please inter number: ");
        int inputNumber = scanner.nextInt();

        if (isPrime(inputNumber)) {
            System.out.println(inputNumber + " - простое число.");
        } else {
            System.out.println(inputNumber + " - не простое число.");
        }

        scanner.close();
    }

    // Метод для проверки является ли число простым
    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false; // 1 и числа меньше не являются простыми
        }

        // Проверяем делители от 2 до половины числа
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false; // Если число делится без остатка, то оно не простое
            }
        }

        return true; // Если не найдено делителей, то число простое
    }
}
