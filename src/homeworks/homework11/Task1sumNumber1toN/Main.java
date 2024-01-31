package homeworks.homework11.Task1sumNumber1toN;

/*Write a program that takes a number as input
  and displays the sum of even numbers*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("inter number: ");
        int n = scanner.nextInt();
        int sum = 0;

        for (int i = 0; i <= n; i++) {
                 if (i % 2 == 0) {
                     sum = sum+i;
            }
        }
        System.out.println(sum);
    }
}
