package homeworks.homework29.task_2_LinkedList;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class NumbersDemo {
    public static void main(String[] args) {

        Number number = new Number(0);

        int[] randomNumbers = number.randomArray(10);

        LinkedList<Integer> numbers = new LinkedList<>();

        for (int num: randomNumbers) {
            numbers.add(num);
        }

        System.out.println("Numbers stored in the LinkedList: " + numbers);

        int maxNum = Collections.max(numbers);
        int minNum = Collections.min(numbers);

        System.out.println("max number: " + maxNum);
        System.out.println("min number: " + minNum);

        Collections.sort(numbers);

        System.out.println("sort list: " + numbers);



        }

    }
