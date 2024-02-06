package homeworks.homework13.task1and2arrayRandomWithMethod;

import homeworks.homework6.scanner.UserInput;

public class Input {

UserInput userInput = new UserInput();
ArrayService arrayService = new ArrayService();
    public void input (){

        boolean errorInput = true;

        int lengthArray = 0;

        while (errorInput) {

            lengthArray = userInput.inputInteger("enter Array length: ");
            if (lengthArray > 0) {
                errorInput = false;
            }
            else {
                System.out.println("you entered wrong number!");
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
                System.out.println("you entered the wrong number!");
            }
        }
    }
}

