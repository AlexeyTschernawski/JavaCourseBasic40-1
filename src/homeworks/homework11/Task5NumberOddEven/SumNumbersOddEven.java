package homeworks.homework11.Task5NumberOddEven;

import homeworks.homework6.scanner.UserInput;

public class SumNumbersOddEven {
    public static void main(String[] args) {

        UserInput input = new UserInput();

        int number = input.inputInteger("geben Sie ein Zahl ein: ");

        int geradeZaehler = 0;
        int ungeradeZaehler = 0;

        for (int i = 0; i <= number; i++) {
            if (i % 2 == 0) {
                geradeZaehler++;
            } else {
                ungeradeZaehler++;
            }
        }

        System.out.println("die Zahl der geraden Zahlen: " + geradeZaehler);
        System.out.println("die Zahl der ungeraden Zahlen: " + ungeradeZaehler);
    }
}
