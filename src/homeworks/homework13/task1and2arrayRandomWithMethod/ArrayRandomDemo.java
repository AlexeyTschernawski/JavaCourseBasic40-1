package homeworks.homework13.task1and2arrayRandomWithMethod;

import homeworks.homework6.scanner.UserInput;

public class ArrayRandomDemo {
    public static void main(String[] args) {

        ArrayService arrayService = new ArrayService();
        ReplaceOddNumberwithZero replaceOddNumberwithZero = new ReplaceOddNumberwithZero();
        UserInput userInput = new UserInput();

        boolean errorInput = true;

        int lengthArray = 0;

        while (errorInput) {

            lengthArray = userInput.inputInteger("enter Array length: ");
            if (lengthArray > 0) {
                errorInput = false;
            }
            else {
                System.out.println("you entered the wrong number!");
            }

        }

        int[] myArray = arrayService.createArray(lengthArray);

        arrayService.printArray(myArray);

        errorInput = true;

        int startNumber = 0;
        int endNumber = 0;

        while (errorInput){
            startNumber = userInput.inputInteger("enter start number: ");
            endNumber = userInput.inputInteger("enter end number: ");

            if (startNumber < endNumber){
                errorInput = false;
            }
            else {
                System.out.println("you entered not correct number!");
            }
        }
        arrayService.fillArrayRandom(myArray,startNumber,endNumber);

        arrayService.printArray(myArray);

        replaceOddNumberwithZero.replaceOddWithZero(myArray);

        IncreasingArray increasingArray = new IncreasingArray();
        increasingArray.increasing(myArray);
    }

}
