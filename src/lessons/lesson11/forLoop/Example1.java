package lessons.lesson11.forLoop;

import homeworks.homework6.scanner.UserInput;

public class Example1 {
    public static void main(String[] args) {


        UserInput userInput = new UserInput();

        int numberOfIterations = userInput.inputInteger("Please enter number of iteration: ");

        for (int i = 0; i < numberOfIterations; i++) {

            int userInt = userInput.inputInteger("Please enter integer number: ");

            if (userInt > 0 ) {

                System.out.println("Положительное число");

            } else {
                System.out.println("отрицательное число");
            }
        }

    }
}
