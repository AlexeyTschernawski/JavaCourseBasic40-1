package homeworks.homework13.arrayRandom;

import java.util.Arrays;

public class ArrayRandomStupidSolution {
    public static void main(String[] args) {

        double random1 = Math.random() * (50 - 10 + 1) + 10;
        long random2Int1 = Math.round(random1);
        double random2 = Math.random() * (50 - 10 + 1) + 10;
        long random2Int2 = Math.round(random2);
        double random3 = Math.random() * (50 - 10 + 1) + 10;
        long random2Int3 = Math.round(random3);
        double random4 = Math.random() * (50 - 10 + 1) + 10;
        long random2Int4 = Math.round(random4);
        double random5 = Math.random() * (50 - 10 + 1) + 10;
        long random2Int5 = Math.round(random5);
        double random6 = Math.random() * (50 - 10 + 1) + 10;
        long random2Int6 = Math.round(random6);
        double random7 = Math.random() * (50 - 10 + 1) + 10;
        long random2Int7 = Math.round(random7);
        double random8 = Math.random() * (50 - 10 + 1) + 10;
        long random2Int8 = Math.round(random8);

        long[] array = {random2Int1, random2Int2, random2Int3, random2Int4,
                        random2Int5, random2Int6, random2Int7, random2Int8};

        //method with to toString

        System.out.println(Arrays.toString(array));

        //method with loop

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0){
                array[i] = 0;
            }
            System.out.print(array[i] + ", ");

        }
    }
}
