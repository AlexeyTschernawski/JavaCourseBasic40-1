package homeworks.homework38.task_2_SumOfTwoNumbers;

import homeworks.homework6.scanner.UserInput;

public class Demo_Sum {
    public static void main(String[] args) {

        SumOfNumbers sumOfNumbers = ((x, y) -> x + y );

        System.out.println("sum of 2 numbers: " + sumOfNumbers.numbers(5,6));


        UserInput userInput = new UserInput();

        double a = userInput.inputDouble("num a");
        double b = userInput.inputDouble("num b");

        System.out.println(sumOfNumbers.numbers(a,b));



    }
}
