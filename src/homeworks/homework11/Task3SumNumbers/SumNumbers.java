package homeworks.homework11.Task3SumNumbers;

import homeworks.homework6.scanner.UserInput;

public class SumNumbers {
    public static void main(String[] args) {

        UserInput input = new UserInput();
        int sum = 0;

        System.out.println("inter numbers, for stop inter negative number.");

        while (true) {

            int num = input.inputInteger("inter number");

            if (num < 0) {
                break;
            }

            sum = sum + num;
        }

        System.out.println("sum of intered numbers: " + sum);
    }
}