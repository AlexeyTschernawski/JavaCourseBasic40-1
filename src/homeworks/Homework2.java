package homeworks;

public class Homework2 {
    public static void main(String[] args) {

        // Task 1

        char G = 'A';
        G++;
        int varInt = 89;
        byte varByte = 4;
        short varShort = 56;
        float varFloat = 4.7333436F;
        double varDouble = 4.355453532;
        long varLong = 12121;

        System.out.println(G);
        System.out.println((varInt + varByte) / varDouble * varLong / varShort / varFloat);

        //Task 2
        int a = 3;
        int b = 4;
        int c = 5;

        System.out.print(a);
        System.out.print(b);
        System.out.println(c);

        int num = 345;
        int num1, num2, num3;

        num1 = num / 100;
        num2 = (num / 10) % 10;
        num3 = num % 10;

        System.out.println("number " + num + " -> " + num1+ ", " + num2 + ", " + num3);

    }

}
