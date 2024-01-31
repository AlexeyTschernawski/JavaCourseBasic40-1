package lessons.lesson12;

import homeworks.homework6.scanner.UserInput;

import java.util.Scanner;

public class elevator {
    public static void main(String[] args) {

        UserInput inputLevel = new UserInput();

        int buildingHight = inputLevel.inputInteger("inter Level: ");
        int levelsCounter = 0;

        for (int i = 0; i <= buildingHight ; i = i+7-4) {
            levelsCounter++;
        }
        System.out.println("the number of attampts" +levelsCounter);
    }
}
