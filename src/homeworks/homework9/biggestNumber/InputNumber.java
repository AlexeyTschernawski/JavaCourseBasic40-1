package homeworks.homework9.biggestNumber;

import homeworks.homework6.scanner.UserInput;

public class InputNumber {

    UserInput input = new UserInput();

    public BiggestNumber0to100 inputNumbers(){

        int num1 = input.inputInteger("inter number: ");
        int num2 = input.inputInteger("inter number: ");
        int num3 = input.inputInteger("inter number: ");
        int num4 = input.inputInteger("inter number: ");
        return new BiggestNumber0to100(num1,num2,num3,num4);
    }
}
