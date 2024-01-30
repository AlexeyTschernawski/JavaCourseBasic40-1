package homeworks.homework6.scanner;

import java.util.Scanner;

public class UserInput {

    public String inputText(String massage){
        Scanner scanner = new Scanner(System.in);

        System.out.println(massage);
        String inputText = scanner.nextLine();
        return inputText;
    }

    public int inputInteger(String massage){
        Scanner scanner = new Scanner(System.in);

        System.out.println(massage);
        int inputInteger = scanner.nextInt();
        return inputInteger;
    }

    public double inputDouble(String massage){
        Scanner scanner = new Scanner(System.in);

        System.out.println(massage);
        double inputDouble = scanner.nextDouble();
        return inputDouble;
    }

    public boolean inputBoolean(String massage){
        Scanner scanner = new Scanner(System.in);

        System.out.println(massage);
        boolean inputBoolean = scanner.nextBoolean();
        return inputBoolean;
    }
}
