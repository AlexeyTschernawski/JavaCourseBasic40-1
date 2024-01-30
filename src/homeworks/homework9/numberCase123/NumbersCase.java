package homeworks.homework9.numberCase123;

import homeworks.homework6.scanner.UserInput;

public class NumbersCase {
    public static void main(String[] args) {

        UserInput input = new UserInput();

        int numbers = input.inputInteger("please inter number 1,2 or 3: ");

        if (numbers <1 || numbers<3){
            System.out.println("you intered the wrong number");
        }

        switch (numbers){
            case 1:
                System.out.println("your number 1");
                break;

            case 2:
                System.out.println("your number 2");
                break;

            case 3:
                System.out.println("your number 3");
                break;
        }
    }
}
