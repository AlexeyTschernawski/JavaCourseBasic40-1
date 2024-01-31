package homeworks.homework11.Task1sumNumber1toN;

import homeworks.homework6.scanner.UserInput;

public class NumberInput {

    UserInput input= new UserInput();

    public int numberN (){
        int number = input.inputInteger("inter number: ");
        return number;
    }
}
