package homeworks.homework19.task3_RandomArrayDescending;

public class Demo {
    public static void main(String[] args) {

        int arraySize = 10;

        RandomDescending randomDescending = new RandomDescending();

        int[] newArray = randomDescending.randomArray(arraySize);


        int[] randomArray = randomDescending.array(newArray);
        randomDescending.printArray(randomArray);





    }
}
