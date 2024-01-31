package lessons.lesson12;

import homeworks.homework6.scanner.UserInput;

public class NumbersSumAverage {
    public static void main(String[] args) {
        UserInput input = new UserInput();

        int summa = 0;
        int zaehler = 0;

       while (true){
           int inputNumbers = input.inputInteger("inter numbers, for stop inter -> 0");

           if (inputNumbers == 0) {
               break;
           }
           summa += inputNumbers;
           zaehler++;
       }
       if (zaehler > 0) {
           double average = (double) summa / zaehler;
           System.out.println("sum = " + summa);
           System.out.println("average= " + average);
       }
    }
}
