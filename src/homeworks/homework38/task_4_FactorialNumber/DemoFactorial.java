package homeworks.homework38.task_4_FactorialNumber;

import homeworks.homework6.scanner.UserInput;

public class DemoFactorial {
    public static void main(String[] args) {

        FactorialOfNumber factorialOfNumber = a -> {
            if (a < 0) {
                System.out.println("doesn't work for negative numbers");
            }

            long factorial = 1;
            for (int i = 1; i <= a; i++) {
                factorial *= i;
            }
            return Math.toIntExact(factorial);
        };

        UserInput input = new UserInput();
        int numberInput = input.inputInteger("enter number:");

        System.out.println("factorial of the number: "+ factorialOfNumber.number(numberInput));

    }
}
