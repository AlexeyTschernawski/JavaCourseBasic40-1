package homeworks.homework13.task1and2arrayRandomWithMethod;

public class IncreasingArray {

    public void increasing (int[] workingArray){

        boolean arrayIncreasing = true;
        for (int i = 1; i < workingArray.length; i++) {
            if (workingArray[i] <= workingArray[i - 1]) {
                arrayIncreasing = false;
                break;
            }
        }
        if (arrayIncreasing) {
            System.out.println("the array is strictly increasing sequence.");
        } else {
            System.out.println("the array is NOT strictly increasing sequence.");
        }
    }
}
