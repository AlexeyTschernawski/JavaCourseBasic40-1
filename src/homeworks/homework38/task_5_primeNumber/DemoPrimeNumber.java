package homeworks.homework38.task_5_primeNumber;

import homeworks.homework6.scanner.UserInput;

public class DemoPrimeNumber {
    public static void main(String[] args) {

        PrimeNumberInterface primeNumber = number -> {

            if (number <= 1) {
                return false;
            }

            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    return false;
                }
            }

            return true;
        };

        UserInput input = new UserInput();
        int numberInput = input.inputInteger("enter number: ");

        if (primeNumber.isPrime(numberInput)) {
            System.out.println(numberInput + " - простое число.");
        } else {
            System.out.println(numberInput + " - не является простым числом.");
        }

    }
}

